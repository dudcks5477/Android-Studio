# Essential Android

## Activity
- 앱의 한 화면이다.
- Life Cycle(수명 주기)

### Activity - 수명 주기 개념
- Activity 수명 주기 상태 간의 전환하기 위해 Activity 클래스는 6가지 콜백으로 구성된 핵심 세트
( _onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy()_ )를 제공한다.
- onCreate 
  - Activtiy가 만들어질 때 단 한번만 호출 된다.
  - Activtiy를 만들때 단 한번만 하면 되는 작업들은 여기에서 해준다.
- onStart
- onResume
  - 다시 앱으로 돌아올때 무조건 호출 된다.
  - activity가 다시 호출될 때 하면 되는 작업들을 여기에서 해준다.
- onPause
  - 화면의 일부가 가려 졌을 때
- onStop 
  - 화면 전부가 보이지 않을 때
- onDestroy
#### [activity-lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)

## Listner

### 익명함수 / 클래스
- 이름이 없는 함수 / 클래스
- 이름을 만들어줄 필요가 없다.
- 한번만 사용한다.

## Intent
- 의도, 요구, 의사 전달, 요청
- Intent 사용처
  - Activity와 Activity
  - Android System과 내 App (전화)
  - 다른 App과 내 App 
    - 무작정 사용할 수 없다.
    - 상호합의가 있어야 한다.
- 요청의 종류
  - 전달만 하는 요청
  - 리턴을 받는 요청

- 인텐트의 종류
  - 명시적 인텐트 -> 정확히 대상에게 요청
  - 암시적 인텐트 -> 할 수 있는 대상에게 요청

## Context
- 문맥
- Activity가 가지고 있는 주변 정보

## Task
- Activity와 같다.
- Stack
  - 햄버거처럼 아래에서 위로 쌓이는 것
  - Task가 쌓인다.

```markdown
                                        A
A ----> B ----> C ----> B ----> A ----> B
        A       B       A       B
                A               A
- 켜지는 방법을 자체 속성으로 가지고 있는 경우
  - launchMode
- 켜지는 방법을 지시하는 경우
  - IntentFalg
- LaunchMode                    다중 허용
  - Standard                       O
  - singleTop                     조건부 -> 열려고 하는 Activity가 현재 엑티비티라면 onNewIntent를 호출한다.
---
  - singleTask                     X
  - singleInstance                 X
```
- 인텐트 플레그
  - FLAG_ACTIVITY_NEW_TASK
  - FLAG_ACTIVITY_SINGLE_TOP
  - FLAG_ACTIVITY_CLEAR_TOP
  - etc..

[작업 및 백 스택 이해](https://developer.android.com/guide/components/activities/task-and-back-stack?hl=ko)

## Fragment
- Activity
  - App에 보이는 한 화면의 단위
- Activity가 가지고 있는 문제
  - ex
    - Activity가 길어지게 되면 {part 1, 2, 3, 4, 5, 6} 
      - 관리 point가 많아진다.
      - 관리가 어려워진다.
  - 다양한 device에서 오는 문제
    - Android device가 너무 다양하다.
      - Android에는 핸드폰만 있는게 아니다.
      - 태블릿이 있다.
- 사용처
  - Activity의 파트를 나누어서 책임진다.
- life cycle이 존재한다.
- Activity 종속적이다.
- 사용방법
  - XML에 ViewComponent로 추가한다.
  - 코드로(동적)으로 추가한다.
- 데이터 전달 방법
  - Activity
    - Fragment : argument와 bundle
  - Fragment
    - Activity : 자체 구현