plugins {
    id("java")
}

group = "com.amazon.aws"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.0-rc1")
    implementation("com.github.spotbugs:spotbugs-annotations:4.8.3")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("software.amazon.awssdk:sdk-core:2.25.45")
    implementation("software.amazon.awssdk:json-utils:2.25.45")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.skyscreamer:jsonassert:1.5.1")
}

tasks.test {
    useJUnitPlatform()
}
