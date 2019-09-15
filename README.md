
# Spring Boot Data 학습  
  
스프링 부트 데이터 연동을 학습하는 레파지토리 입니다  
학습내용별 브랜치로 구분되어 있습니다.  
(본 학습은 백기선님의 '스프링 부트 개념과 활용' 강의를 보고 실습을 진행하였습니다.)  
  
## MY-SQL 디비 학습
  
 - Docker를 통한 MY-SQL서버 설치
>
    docker run -p 3306:3306 \  
    	--name mysql_boot \  
    	-e MYSQL_ROOT_PASSWORD=1234 \  
 		-e MYSQL_DATABASE=springboot \  
   		-e MYSQL_USER=test \  
    	-e MYSQL_PASSWORD=pass -d mysql
				
- Docker MY-SQL 콘솔 접속
> 
	docker exec -i -t mysql_boot bash
	mysql -u root -p

- MY-SQL DataSource 설정
>
    spring.datasource.url=jdbc:mysql://localhost:3306/springboot?		useSSL=false
	spring.datasource.username=test
	spring.datasource.password=pass