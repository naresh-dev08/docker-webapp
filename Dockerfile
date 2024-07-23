FROM tomcat:10.1.0-jdk17-openjdk
COPY target/docker-webapp.war /usr/local/tomcat/webapp/my-docker-webapp.war
EXPOSE 8080