FROM java:8
VOLUME /tmp
COPY target/docker-demo-0.0.1.jar docker-demo.jar
RUN bash -c "touch /docker-demo.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-demo.jar"]
#docker pull cargo.sunnyoptical.cn/baseimages/java:jdk1.8-mvn-lihs