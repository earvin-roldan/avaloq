### FizzBuzz logic
Java 8 provides the IntStream interface. We have used the following 
two methods of the IntStream interface.

rangeClosed() Method: Returns a sequential ordered

- In this method we specify the starting number (1) and ending 
number (100 or num)

mapToObj() Method: Returns an object-valued consisting of the 
results of applying the given function to the elements of this 
stream

- In this method we check if the number is divisible by 3 and 5 
to return "FizzBuzz", divisible only by 3 to return "Fizz", 
divisible only by 5 to return "Buzz" or else return the number itself

forEach Method: Performs an action for each element of this stream

- In this method we print the returned values

### Dockerfile explanation

FROM: The keyword FROM, tells Docker to use a given image with 
its tag as build-base. If this image is not in the local 
library, an online-search on DockerHub, or on any other 
configured remote-registry, is performed

ARG JAR_FILE: Is the variable that contains the jar file

COPY: We let Docker copy our jar file into the image

ENTRYPOINT: This will be the executable to start when 
the container is booting. We must define them as JSON-Array, 
because we will use an ENTRYPOINT in combination with a CMD for 
some application arguments.

To create an image from our Dockerfile, we have to run 
‘docker build':
```
docker build -t fizzbuzz .
```

To run the container from our image:
```
docker run -p 8080:8080 fizzbuzz
```
We can access it from the host machine at http://localhost:8080/avaloq/fizzbuzz?num=20

###Kubernetes Deployment

- The first four lines define the type of resource (Deployment), the version of this 
resource type (apps/v1), and the name of this specific resource (fizzbuzz).
- Next, you have the desired number of replicas of your pod.
- The next part ties together the Deployment resource with the Pod replicas.
```
The template.metadata.labels field defines a label for the Pods that wrap your 
container (app: fizzbuzz).

The selector.matchLabels field selects those Pods with a app: fizzbuzz label to 
belong to this Deployment resource.
```
- The next part in the Deployment defines the actual container that you want to run
```
- A name for the container (fizzbuzz)
- The name of the Docker image (fizzbuzz:latest), you can change this one to point 
to your docker image by replacing learnk8s to your Docker ID.
- The port that the container listens on (8080)
- The container specification also defines an imagePullPolicy of IfNotPresent — 
the instruction forces the Docker image to be downloaded only when not 
present locally
```

###CI/CD setup

To setup a CI/CD environment for the application we will use Azure DevOps.  
Prerequisites are azure subscription and access to a Git repo that contains the code.  
First thing we need to do is sign in to the Azure portal and in the search box, type 
DevOps Starter, and then select. Click on Add to create a new one.  
Next is to configure access to our Git repo and select a framework.  
Then configure Azure DevOps and Azure subscription. Once done, go to resource to view 
the DevOps Starter dashboard. Azure DevOps Starter automatically configures a CI build and release.
The dashboard shows your code repo, your CI/CD pipeline, and your app in Azure.  
Test the CI/CD pipeline by committing a change in the Git repo then wait for a few moments, a build 
starts in Azure Pipelines. You can monitor the build status in the DevOps Starter dashboard.



