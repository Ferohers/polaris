plugins {
    kotlin("jvm") version "1.4.10"
    kotlin("plugin.serialization") version "1.4.10"
}

group = "dev.moreal"
version = "0.1"

val ktor_version = "1.4.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.0-RC2")

    testImplementation(kotlin("test-junit"))
}

tasks {
    test {
        testLogging.showExceptions = true
    }
}
