**From the root of the project and running the command:**

*mvn clean install*

**The application is now ready to be containerized:**

*docker build -t javaee-clustered-app . *

**The image is ready and available, and we can test it with the creation of the container:**

*docker run -it -p 8080:8080 javaee-clustered-app*

**From the browser we will be able to see our application:**

- http://localhost:8080/JavaEEClusterApp/
- http://localhost:8080/JavaEEClusterApp/api/uuid

**traefik** → Application that takes care of acting as the Load Balancer of the application. Listening on two ports: 80 for Load Balancing and 8080 for the administration console

**javaee_clusterd_app** → is our JavaEE application. We add the labels to communicate with traefik (such as the PathPrefix, and the indication of the port 8080 with which traefik will divert the http traffic)


Stack deployment:

*docker stack deploy --compose-file docker-compose.yaml javaee_stack*

*docker stack ls*

*docker stack ps javaee_stack*

*docker service ls*

**Dashbord Traefik**

http://localhost:8080/dashboard
