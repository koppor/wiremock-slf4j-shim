plugins {
    java
    `maven-publish`
}

group = "com.github.koppor"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.13")
    implementation("com.github.koppor:wiremock-slf4j-spi-shim:main-SNAPSHOT")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        mavenLocal()
    }
}
