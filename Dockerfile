##############################################
#### 도커가 이해할 수 있는 설정파일 (의존성 주입)####
##############################################

#자바버전
FROM openjdk:23
#누가 도커 관리하는지 작성
LABEL maintainer="redis"
#jar파일 위치 정의변수
#지금 프로젝트는 프로젝트 안에 cinema라는 프로젝트 있음
ARG JAR_FILE=cinema/build/libs/cinema-001.jar
#도커 이미지로 사용할 이름
COPY ${JAR_FILE} app.jar
#컨테이너 실행시 반드시 실행해야함
ENTRYPOINT ["java","-jar","/app.jar"]
