node {
    def gradleHome
    stage('Preparation') { // for display purposes
        echo "Preparing pipeline..."
        git url: 'https://github.com/jkrizanic/rest-with-spring.git'


        gradleHome = tool 'Gradle 2.9' //tool name must match in the Global Tool Configuration
    }
    stage('Build') {
        // Run the Gradle build

        if (isUnix()) {
            sh "'${gradleHome}/bin/gradle' clean build"
        } else {
            bat(/"${gradleHome}\bin\gradle" clean build /)
        }


    }

    stage('Results') {
        junit '**/build/test-results/TEST*.xml'
        archive 'build/libs/*.jar'
    }
}