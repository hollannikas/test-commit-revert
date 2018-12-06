import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

plugins {
    kotlin("jvm") version "1.3.10"
}

group = "fi.hollannikas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val junitJupiterVersion = "5.3.2"
val junitPlatformVersion = "1.3.2"

dependencies {
    compile(kotlin(module = "stdlib-jdk8"))
    testCompile(group = "org.junit.jupiter", name = "junit-jupiter-engine", version = junitJupiterVersion)
    testImplementation(gradleTestKit())
    testImplementation(kotlin("test"))
    testCompile(group = "org.junit.platform", name = "junit-platform-launcher", version = junitPlatformVersion)
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}