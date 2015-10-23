------------------------------------------------------------------------
To run the application WeldSE-OPTION-1:
------------------------------------------------------------------------
cd WeldSE-OPTION-1/
mvn clean install
java -jar target/WeldSeExample1-1.0.1-SNAPSHOT.jar


To run arquillian test:
mvn clean install -Dts


------------------------------------------------------------------------
To run the application WeldSE-OPTION-2:
------------------------------------------------------------------------
cd WeldSE-OPTION-2/
mvn clean install
mvn exec:java -Dexec.mainClass="org.jboss.weld.environment.se.StartMain"
