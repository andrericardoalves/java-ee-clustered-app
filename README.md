**From the root of the project and running the command:**

*mvn clean install*

**The application is now ready to be containerized:**

*docker build -t javaee-clustered-app . *

**The image is ready and available, and we can test it with the creation of the container:**

*docker run -it -p 8080:8080 javaee-clustered-app*

**From the browser we will be able to see our application:**

- http://localhost:8080/JavaEEClusterApp/
- http://localhost:8080/JavaEEClusterApp/api/uuid