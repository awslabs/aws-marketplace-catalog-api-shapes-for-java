#!/bin/zsh

# remove any existing Gradle build/setting files
rm build.gradle.kts && rm settings.gradle.kts


# create new Gradle build
echo "1 1 aws-marketplace-catalog-api-shape-library-for-java no" | gradle init

# setup gradle build file with dependencies and targets
contents="plugins {
    id(\"java\")
}

group = \"com.amazon.awsg\"
version = \"0.0.1\"

repositories {
    mavenCentral()
}

dependencies {
    implementation(\"com.fasterxml.jackson.core:jackson-databind:2.17.0-rc1\")
    implementation(\"com.github.spotbugs:spotbugs-annotations:4.8.3\")
    implementation(\"javax.annotation:javax.annotation-api:1.3.2\")
    testImplementation(platform(\"org.junit:junit-bom:5.9.1\"))
    testImplementation(\"org.junit.jupiter:junit-jupiter\")
    testImplementation(\"org.skyscreamer:jsonassert:1.5.1\")
}

tasks.test {
    useJUnitPlatform()
}
"

if [ -f ./build.gradle.kts ]; then
   echo "$contents" > build.gradle.kts
elif [ -f ./build.gradle ]; then
   echo "$contents" > build.gradle
fi
