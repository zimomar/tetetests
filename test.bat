SET MAVEN_HOME=D:\apache-maven-3.5.4
SET SONAR_SCANNER_HOME=D:\sonar-scanner-4.2.0.1873-windows

SET PATH=%SONAR_SCANNER_HOME%\bin;%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%

start sonar-scanner.bat
mvn cobertura:cobertura checkstyle:checkstyle jar:jar