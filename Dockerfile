FROM openjdk:8-alpine
MAINTAINER liwei@comtom.cn

# work dir
WORKDIR /data

# env
ENV JAVA_OPTS="-Xms512m -Xmx1g -XX:MetaspaceSize=64m -XX:MaxMetaspaceSize=128m"
ENV TZ ="Asia/Shanghai"

# add jar
ADD ./target/smart-0.0.1-SNAPSHOT.jar app.jar

# port
EXPOSE 8080

# run cmd
CMD java -jar ${JAVA_OPTS} app.jar



