The code in old_version and new_version is exactly the same.
The difference is in the pom.xml, quarkus version.
Tests were working with `@MyTestAnontation` with quarkus version 1.11.7.Final, 1.12.2.Final and 1.13.0.Final. 
Stoped working starting with 1.13.1.Final.
To check this enter the wanted folder and run `mvn clean install`.

