# TEST FRAMEWORK WITH CUCUMBER FOR PWA USING SELENOID

Run the following command:

            sh run_Test.sh


Whats pending:
1) PARALLEL execution in cucumber

2) STRATEGY pattern for different viewports and mobile

3) VIEW PORT - simplify build.gradle

4) MULTIPLE PAGE FILES - Dig further


    
What does ./run_test.sh and do?

2) Use docker-compose to bring up selenoid and selenoid UI, you can access 
    the selenoid-ui with the below URL
    
        http://localhost:8081/

3) Make sure you pull the docker images for the browser images mentioned in the browsers.json and configure according to the 
    requirements
    To quickly do this install jq (brew install jq)
    Run the command 
    
        cat /path/to/browsers.json | jq -r '..|.image?|strings' | xargs -I{} docker pull {}    
    
4) All the videos recorded are saved in /video in the PWD (Videos are saved with the session id)

5) If you are changing or updating browsers.json, restart docker image for selenoid, otherwise you docker would not recognise the environment

6) Pull the video recording image :
    
        docker pull  selenoid/video-recorder:latest

