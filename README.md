## 🚀 Try Our Application Now!

We're excited to invite you to experience our web application firsthand! Our app is designed to simplify your tasks and enhance productivity. 🌟

Click below to start exploring:

[![Explore Our Application](https://img.shields.io/badge/Explore-OurApp-blue?style=for-the-badge&logo=appveyor)](http://115.95.149.11:8081)


We hope you enjoy using our app as much as we enjoyed building it. If you have any feedback or encounter any issues, please let us know!

  <p align='center'>
    <img src="https://capsule-render.vercel.app/api?type=waving&color=auto&height=300&section=header&text=My%20Class%20Planner&fontSize=90&animation=fadeIn&fontAlignY=38&desc=&descAlignY=51&descAlign=62" width="100%">
</p>

<br><br>

## 프로젝트 소개

- My Class Planner 는 대학생들이 수강신청 할 때 시간표 충돌이 발생하지 않는 모든 가능한 시간표를 보여주는 웹 애플리케이션입니다.
- 개인이 듣고싶은 강의 정보를 추가하여 다양한 시간표를 생성 후 제공해 줍니다.
- 게시판/댓글 기능을 통해 다른 유저와 의사소통이 가능합니다.
- AI chat 시스템으로 유저가 사용하는데에 불편함을 느낄 때 도움 받을 수 있습니다.

<br><br>

## 팀 구성원 및 역할
<table>
  <tr>
    <th>구성원</th>
    <th>이름</th>
    <th>역할</th>
    <th>깃허브 주소</th>
  </tr>
  <tr>
    <td style="text-align: center;">
      <img src="https://github.com/k-mcp/My_Class_Planner/assets/101847682/82716b47-fa9c-4851-99da-085c34017bf3" width="120" />
    </td>
    <td>유정우</td>
    <td>팀장, Server, Algorithm, OPEN AI</td>
    <td>
      <a href="https://github.com/Jungwoo-Ryu">유정우의 깃허브</a>
    </td>
  </tr>
  <tr>
    <td style="text-align: center;">
      <img src="https://github.com/k-mcp/My_Class_Planner/assets/101847682/e7ae7ab4-a66e-47c8-b8b1-ba1a218717ad" width="120" />
    </td>
    <td>이은숙</td>
    <td>업무관리, DB 관리, 테스트관리</td>
    <td>
      <a href="https://github.com/Leeeunsookl">이은숙의 깃허브</a>
    </td>
  </tr>
  <tr>
   <td>
    <img src="https://github.com/k-mcp/My_Class_Planner/assets/101847682/41fc877b-eac7-41b2-91aa-86929d1f0991" width="120" />
    </td>
    <td>이혜진</td>
    <td>문서관리, DB 관리</td>
    <td>
      <a href="https://github.com/tesla1220">이혜진의 깃허브</a>
    </td>
  </tr>
  <tr>
    <td style="text-align: center;">
      <img src="https://github.com/GonY0624.png" width="120" />
    </td>
    <td>정고은</td>
    <td>Server, UI/UX</td>
    <td>
      <a href="https://github.com/GonY0624">정고은의 깃허브</a>
    </td>
  </tr>
</table>

<br><br>

## 1. 개발 환경

- Front : HTML/CSS, Javascript, Bootstrap, Thymeleaf
- Back-end : Java/Springboot
- 버전 및 이슈관리 : Github, Github Issues, Github Project
- 협업 툴 : Discord, Notion, Github
- 서비스 배포 환경 : jar
  
<br><br>


## 2. 채택한 개발 기술과 브랜치 전략

### Spring boot, Backtracking Algorithm

- Spring Boot
    - Spring Boot를 사용함으로써 애플리케이션의 구성과 실행을 간소화하여 개발 시간을 대폭 단축시킬 수 있었습니다.
    - 내장 서버를 활용하여 별도의 서버 구성 없이 개발과 테스트를 용이하게 진행할 수 있었습니다.
    - 스프링의 다양한 스타터 키트를 이용하여 의존성 관리를 간편하게 하고, 보일러플레이트 코드를 최소화하였습니다.

- Backtracking Algorithm
    - 복잡한 문제 해결을 위해 사용된 Backtracking 알고리즘은 가능한 모든 경우의 수를 체계적으로 탐색하며, 해결책을 찾아 나갔습니다.
    - 구조화된 알고리즘 설계를 통해, 데이터 입력에 따라 유동적으로 조건을 수정하고 최적의 해결책을 도출할 수 있었습니다.
    - 효율적인 시간 복잡도 관리를 위해 실패한 시나리오는 즉시 포기하고 다른 가능성에 집중할 수 있는 백트랙을 활용했습니다.
    - 클래스 스케줄링, 레이아웃 문제, 리소스 할당과 같이 다양한 조건과 제약이 있는 문제에 매우 효과적으로 적용되었습니다.


### 브랜치 전략

- Git-flow 전략을 기반으로 main, develop 브랜치와 feature 보조 브랜치를 운용했습니다.
- main, develop, Feat 브랜치로 나누어 개발을 하였습니다.
    - **main** 브랜치는 배포 단계에서만 사용하는 브랜치입니다.
    - **develop** 브랜치는 개발 단계에서 git-flow의 master 역할을 하는 브랜치입니다.
    - **Feat** 브랜치는 기능 단위로 독립적인 개발 환경을 위하여 사용하고 merge 후 각 브랜치를 삭제해주었습니다.

<br><br>


## 3. 프로젝트 구조

```
├── README.md
├── build
│   ├── classes
│   ├── generated
│   ├── libs
│   ├── reports
│   ├── resolvedMainClassName
│   ├── resources
│   ├── test-results
│   └── tmp
├── build.gradle
├── docs
│   └── pull_request_template.md
├── gradle
│   └── wrapper
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    └── test

```

<br><br>

## 4. 역할 분담

### 🍊유정우

- **UI**
    - 페이지 : 홈, 사이드바, Add Course, Generate Plans, AI 채팅방
    - 공통 컴포넌트 : 게시글 템플릿, 버튼
- **기능**
    - 게시글 등록 및 수정 및 삭, 댓글 등록, 백트래킹 기반의 시간표 생성 알고리즘, OPEN AI Fetch

<br>
    
### 👻이은숙

- **UI**
    - 페이지 : 프로필 설정, 프로필 수정, 팔로잉&팔로워 리스트, 상품 등록, 상품 수정, 채팅 목록, 404 페이지
    - 공통 컴포넌트 : 탭메뉴, InputBox, Alert 모달, 댓글
- **기능**
    - 프로필 설정 및 수정 페이지 유저 아이디 유효성 및 중복 검사, 상품 등록 및 수정

<br>

### 😎이혜진

- **UI**
    - 페이지 :  FAQ 포함 Contact Us 페이지
    - 공통 컴포넌트 : 사이드바 카테고리 및 아이콘 추가 삽입, 카테고리별 버튼 및 폰트 작업
- **기능**
    -  Contact Us 페이지 이메일 발송 기능 구현, 로그인 유효성 및 중복 검사, 회원가입 유효성 및 중복 검사, 이메일 검증

<br>

### 🐬정고은

- **UI**
    - 페이지 : 로그인, 로그아웃, my course, community, post, view, 사용자 프로필 페이지, 전반적인 사용자 인터페이스 재구성
    - 공통 컴포넌트 : 버튼, 검색 폼
- **기능**
    - 유저 검색, 유저 schedule 보여주기, 시스템 모니터링
    
<br><br>

## 5. 개발 기간 및 작업 관리

### 개발 기간

- 전체 개발 기간 : 2024-04-01 ~ 2024-06-01
- DB 모델링 : 2024-04-01 ~ 2024-04-05
- UI 구현 : 2024-04-06 ~ 2024-04-23
- 기능 구현 : 2024-04-24 ~ 2022-06-01

<br>

### 작업 관리

- GitHub Projects와 Issues를 사용하여 진행 상황을 공유했습니다.
- 주간회의를 진행하며 작업 순서와 방향성에 대한 고민을 나누고 Notion에 회의 내용을 기록했습니다.

<br><br>


## 6. 물리 데이터 모델
<img width="1000" alt="model" src="https://github.com/k-mcp/My_Class_Planner/assets/101847682/3190614a-92bb-4003-ae18-b64c77761a10">


<br><br>


## 7. 신경 쓴 부분
- :heart_eyes:[알고리즘](https://github.com/k-mcp/My_Class_Planner/wiki/시간표-생성-알고리즘)
- 😊[비밀번호 암호화](https://github.com/k-mcp/My_Class_Planner/wiki/비밀번호-암호화)
- :smiley:[메일인증](https://github.com/k-mcp/My_Class_Planner/wiki/이메일-인증-시스템)


<br><br>

## 8. 화면별 기능 요약

### [초기화면]
- 서비스 접속 초기화면으로 My Class Planner 의 로고가 회전합니다.
    - 게스트로 이용할 경우 : Continue as Guest, Settings 기능 사용 불가능합니다.
    - 회원으로 이용할 경우 : Sign in
- SNS(카카오톡, 구글, 페이스북) 로그인 기능은 구현되어 있지 않습니다.

| 초기화면 |
|----------|
<img src="https://github.com/k-mcp/My_Class_Planner/assets/98254345/c2a319d0-5fe2-4a0f-b6c4-7e7a35371607" width="1000"/>

<br>

### [회원가입]
- Sign up 페이지와 Sign in 페이지를 자유롭게 이동할 수 있습니다.
- 이메일 주소와 유저네임을 입력하고 Sign up 버튼을 누르면 유효성 검사를 요청하는 Alert 창이 표시 됩니다.
- 이메일 주소의 형식이 유효하지 않거나 이미 가입된 이메일일 경우 또는 비밀번호가 6자 미만일 경우에는 각 입력창 하단에 경구 문구가 나타납니다.
- 유효성 검사 이후 Sign up 버튼을 클릭하면 해당 이메일로 인증 코드를 발송합니다.

| 회원가입 |
|----------|
<img src="https://github.com/k-mcp/My_Class_Planner/assets/98254345/d5a7e864-7791-4d4e-bc13-74bfd803fc61" width="1000"/>

| 이메일 인증 |
|----------|
<img src="https://github.com/k-mcp/My_Class_Planner/assets/98254345/2d71ed90-a130-4537-81ae-119a978ecbd8" width="1000"/>


<br>

### [로그인/로그아웃]
- 이메일 인증이 아직 완료 되지 않은 계정에 경우 재인증 이메일이 전송됩니다.
- 인증된 계정의 경우 Session 에 사용자의 정보를 저장하고 홈페이지로 이동하여 사용자가 저장한 데이터를 조회 할 수 있습니다.
- 로그아웃시 로컬 저장소의 토큰 값과 사용자 정보를 삭제하고 초기화면으로 이동합니다.

| 로그인 / 로그아웃 |
|----------|
<img src="https://github.com/k-mcp/My_Class_Planner/assets/98254345/efc756f8-7a8f-499c-8766-9a8020b70b5f" width="1000"/>

<br>

### [핵심 기능]
- Add Courses : 사용자는 자기가 듣고싶은 강의와 섹션들을 자유롭게 저장 할 수 있습니다.
    - Add Section : 섹션을 추가 합니다.
    - 사용자는 한번에 한 강의만 등록 할 수 있습니다. (강의명을 동일하게 작성하면 존재하는 해당 컬럼 하위에 섹션 정보가 추가됩니다.)
    - Submit : 입력한 정보를 DB 에 저장한 후 My Course page 로 이동하여 저장 된 강의 정보들을 조회 합니다.
- My Course : 사용자는 추가된 강의 정보들을 조회하며 삭제할 수 있습니다.
    - Delete Course: 선택한 강의를 삭제 합니다. (삭제할 때 섹션 일부만 삭제하는것은 불가능합니다.)
    - Go to Genereate: 시간표 생성기 페이지로 이동합니다.     

| Add Courses / My Course |
|----------|
<img src="https://github.com/k-mcp/My_Class_Planner/assets/98254345/927be4dd-109b-4d47-88f7-3abf0294caad" width="1000"/>

<br>

### [Generate Plans]
- Generate Plans: 사용자는 원하는 강의를 선택 후 Generate 버튼을 클릭합니다.
- 만일 해당 강의들로 만들 수 있는 시간표가 없다면 아무것도 반환 되지 않습니다.
- 생성된 시간표를 선택하여 저장하고 My Plans 페이지에서 조회 및 삭제가 가능합니다.

| Generate Plans |
|----------|
<img src="https://github.com/k-mcp/My_Class_Planner/assets/98254345/721ab34a-8090-44eb-923e-6afafcff2a6d" width="1000"/>

| My Plans |
|----------|
<img src="https://github.com/k-mcp/My_Class_Planner/assets/98254345/df3003ba-6cd9-46d1-8773-99b123107cfb" width="1000"/>


<br><br>

## 9. 개선 목표

- 시간표 시각화 : Timetable API 를 이용해서 강의들을 블럭 단위로 시각화 해서 보여줄 예정

<br>
