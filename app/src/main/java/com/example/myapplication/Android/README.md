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