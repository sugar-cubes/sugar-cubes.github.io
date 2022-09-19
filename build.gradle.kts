import org.asciidoctor.gradle.jvm.AsciidoctorTask

plugins {
    id("org.asciidoctor.jvm.convert") version "3.3.2"
}

repositories {
    mavenCentral()
}

tasks.withType<AsciidoctorTask> {
    sourceDir("src/docs/asciidoc")
}
