For building the project
--------------------------
`mvn clean install`

For creating the Docker image
--------------------------
`mvn fabric8:build`

To create the openshift resource descriptor, run command
--------------------------
`mvn fabric8:resource`

To push the docker image generated via mvn docker:build to either the global docker registry or a local docker registry.
--------------------------
`mvn fabric8:push`

Reference:
https://fabric8.io/guide/mavenDockerBuild.html

Common oc commands
--------------------------
`oc new-project spring-boot-docker-openshift-hello-world`\
`oc project <spring-boot-hello-world>`\
`oc login`\
`oc apply -f apache_root_pod.yml`\
`oc get pods`\
`oc logs -f apache`\
`oc pod delete apache`

Common Docker commands
--------------------------
For tagging the docker image before pushing it to repo
`docker tag <image_name:image_tag> <docker_username>/<image_name:image_tag>`\
`docker tag spring-boot-docker-openshift-hello-world:0.0.1-SNAPSHOT.dev pokarjm/spring-boot-docker-openshift-hello-world:0.0.1-SNAPSHOT.dev`\
`docker push pokarjm/spring-boot-docker-openshift-hello-world`

For Deploying to openshift using template
----------------------------------------------
If template is not uploaded: `oc process -f <filename> | oc create -f -`\
If template is uploaded: `oc process <deployment-template-name> | oc create -f -`

For deleting from template
-----------------------------
`oc process -f openshift/template.yaml | oc delete -f -`
