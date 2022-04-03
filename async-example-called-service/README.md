### Simple SpringBoot Application - To demonstrate async endpoint invocation
* A very simple SpringBoot application.
* Starts at port 8081.
* Exposes an endpoint http://localhost:8081/callme/{name} to be invoked in async fahion by other REST service 
* The endpoint simply prints 4 messages at a delay of 1 second  and completes. Doesnt really return anything.
