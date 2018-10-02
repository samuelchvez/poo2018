import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.71"
}

group = "io.edoo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("com.github.kittinunf.fuel:fuel-gson:1.15.0")
    compile ("com.google.code.gson:gson:2.8.5")
    compile("org.postgresql:postgresql:42.2.5")
    compile("org.jetbrains.exposed:exposed:0.10.5")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}