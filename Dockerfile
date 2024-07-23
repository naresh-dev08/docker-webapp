FROM tomcat:10.1-jdk11
COPY target/docker-webapp.war /usr/local/tomcat/webapps/my-docker-webapp.war
EXPOSE 8080