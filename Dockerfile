FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/hello-lti.jar /hello-lti/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hello-lti/app.jar"]
