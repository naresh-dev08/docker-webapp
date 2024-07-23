FROM tomcat:10.1.0-jre17
COPY target/docker-webapp.war /usr/local/tomcat/webapp/my-docker-webapp.war
EXPOSE 8080