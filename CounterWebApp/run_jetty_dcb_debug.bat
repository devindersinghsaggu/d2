set MAVEN_OPTS=-Xdebug -Djava.compiler=NON -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=n

call mvn tomcat:run -Pdcb %1