Spring Boot provides the Spring Boot actuator module for monitoring and managing your application

#To add our own context path for only actuator api we can used these property for updating context path
management.endpoints.web.base-path=/myact 

To see details of health we can used 

URL:  http://localhost:8080/myact/health
OutPut:

{
	"status": "UP",
	"details": {
		"custom": {
			"status": "UP",
			"details": {
				"App": "I am running ..!!",
				"Error": "Uptil now no error"
			}
		},
		"diskSpace": {
			"status": "UP",
			"details": {
				"total": 285357371392,
				"free": 203681644544,
				"threshold": 10485760
			}
		},
		"mongo": {
			"status": "UP",
			"details": {
				"version": "3.4.7"
			}
		}
	}
}

here you can see datasource details, as I am connecting to mongo DB
so health endpoint show status of those databases.

above output has custom health object 
actuator provides a HealthIndicator and AbstractHealthIndicator interface, which we can implement to provide custom health indicators


Spring Boot actuator provides the /info endpoint to display the information about the application

URL:http://localhost:8080/myact/info

OutPut:
{
	"app": {
		"name": "springboot-actuator",
		"version": "0.0.1-SNAPSHOT",
		"encoding": "UTF-8",
		"java": {
			"version": "1.8.0_74"
		}
	}
}

We can also display the Java version that your application uses. It takes the information from the Maven pom.xml file.