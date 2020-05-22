## Start
 Run As > Maven Build... > Goals: [spring-boot:run] > [Run] Click

## install
 Run As > Maven Install

## 개발 프레임 워크
  Spring Boot : 2.2.2<br>
  Java : 1.8<br>
  In memory DB : H2  

## 문제 해결 방법
 In memory DB로 H2를 사용하였는데 Spring boot에서도 지원해주고 설정관련 정보도 인터넷에 쉽게 찾을 수 있었습니다.<br>
 mabatis 의 result type의 변수와 값을 자유롭게 하고자 map으로 사용하였습니다.<br><br>
 
 **시간을 많이 소비한 부분**
 1. Unit Test<br>
 단위 테스트를 작성하고 개발한 경험이 적었기 때문에 단위테스트의 개념 및 코드 작성법을 공부할 수 있었습니다.<br>
 2. 한글 encoding<br>
 java application으로 api를 테스트 하다가 maven으로 실행했을때 한글 encoding이 안되서 properties 설정 및 filter 설정을 진행하였고<br>
 추가적으로 datasource sqlScriptEncoding 까지 encoding 설정을 마치고 나서야 완료할 수 있었습니다.<br>
 
