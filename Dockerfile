FROM tomcat:10.0

COPY ./hello-world /usr/local/tomcat/webapps/hello-world

EXPOSE 8080

CMD ["catalina.sh", "run"]
