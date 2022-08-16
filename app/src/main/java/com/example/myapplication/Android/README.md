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
