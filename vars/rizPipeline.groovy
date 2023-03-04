def call(Map config){

    if(config.type == maven){
        mavenPipeline();
    } else {
        pipeline {
        agent any 
        stages {    
            stage("Pipeline tidak didukung") {
                steps {
                    script {
                        echo("Pipeline tidak didukung")
                    }
                }
            } 
        }
        }
    }

}