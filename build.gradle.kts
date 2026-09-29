plugins {
    kotlin("jvm") version "1.9.20"  // Versión más reciente
    application  // Añadimos este plugin
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib"))  // Añadimos la biblioteca estándar
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}