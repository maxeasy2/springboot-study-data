
# Spring Boot Data 학습  
  
스프링 부트 데이터 연동을 학습하는 레파지토리 입니다  
학습내용별 브랜치로 구분되어 있습니다.  
(본 학습은 백기선님의 '스프링 부트 개념과 활용' 강의를 보고 실습을 진행하였습니다.)  
  
## PostgreSQL 디비 학습
  
 - Docker를 통한 PostgreSQL서버 설치
>
    docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=test -e POSTGRES_DB=springboot --name postgres_boot -d postgres
				
- Docker PostgreSQL 콘솔 접속 및 확인
> 
	# 도커 콘솔접속
	docker exec -i -t postgres_boot bash
	psql --username test --dbname springboot
	# 데이터베이스 조회
    \list
    # 테이블 조회
	\dt
	# 쿼리
	SELECT * FROM account;

- DataSource 설정
>
	spring.datasource.url=jdbc:postgresql://localhost:5432/springboot  
	spring.datasource.username=test  
	spring.datasource.password=pass