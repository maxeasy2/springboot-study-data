# Spring Boot Data 학습

스프링 부트 데이터 연동을 학습하는 레파지토리 입니다
학습내용별 브랜치로 구분되어 있습니다.
(본 학습은 백기선님의 '스프링 부트 개념과 활용' 강의를 보고 실습을 진행하였습니다.)

## H2 인메모리 디비 학습

 - H2 콘솔 접속(실습시 방법2 사용)
   - 방법1) spring-boot-devtools 의존 추가.
   - 방법2) spring.h2.console.enabled=true 만 추가.
   - 아래와 같이 콘솔 접속 (접속시URL 확인필요)
     > http://localhost:8080/h2-console
- 실습 SQL
    -   CREATE TABLE USER (ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))
    -   INSERT INTO USER VALUES (1, ‘sample’)
