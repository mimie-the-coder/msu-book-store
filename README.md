Corntributors
Tendai Mbedzi Reg No. R2212392Q
Lisa Ncube R1911686N
Gwaunza Mitchel R194851C
Tinashe R189004Y


How to run the application

Backend Services
>
To Start Backend Services follow below steps.
>Using Intellij/Eclipse or Command Line

Import this project into IDE and run all Spring boot projects or 
build all the jars running `mvn clean install` command in root parent pom, which builds all jars.
All services will be up in the below mentioned ports.

But running this way we wont get monitoring of microservices. 
So if monitoring needed to see metrics like jvm memory, tomcat error count and other metrics.

Use below method to deploy all the services and monitoring setup in docker.

Use the `Postman Api collection` in the Postman directory. To make request to various services.

Services will be exposed in this ports

```
Api Gateway Service       : 8765
Eureka Discovery Service  : 8761
Account Service           : 4000
Billing Service           : 5000
Catalog Service           : 6000
Order Service             : 7000
Payment Service           : 8000
```
