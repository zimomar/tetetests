SET MAVEN_HOME=D:\apache-maven-3.5.4
SET JAVA_HOME=D:\jdk-11.0.2
SET SONAR_SCANNER_HOME=D:\sonar-scanner-4.2.0.1873-windows

SET PATH=%SONAR_SCANNER_HOME%\bin;%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%

cd /D Z:\COURS\2A\APPLI\TD4_cor\projet-td4-termine\evaluateurmaven

start sonar-scanner.bat

SET JAVA_HOME=C:\Program Files\Java\jdk1.8.0_221
SET PATH=%JAVA_HOME%\bin;%PATH%
mvn cobertura:cobertura checkstyle:checkstyle jar:jar