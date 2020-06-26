#!/usr/bin/env groovy

pipeline {
	agent any
	
	stages {
	    stage ('Build') {
	    	sh 'chmod +x ./mvnw'
	    	sh './mvnw compile jib:build'
	    }
	}
}