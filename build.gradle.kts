plugins {
    kotlin("multiplatform") version "1.3.72"
    id("kotlinx-atomicfu") version "0.14.2"
}

val GROUP: String by project
val VERSION_NAME: String by project

group = GROUP
version = VERSION_NAME

repositories {
    mavenCentral()
}


kotlin {
    jvm("jvm6")
    jvm("jvm8")

    js {
        browser {
        }
        nodejs {
        }
    }
    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    macosX64("macos")
    linuxX64()
    mingwX64()

    sourceSets {
        val commonMain by getting {
            kotlin.srcDir("src/main/kotlin")
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:atomicfu-common:0.14.2")
            }
        }
        val commonTest by getting {
            kotlin.srcDir("src/test/kotlin")
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvm6Main by getting {
            dependencies {
                implementation(kotlin("stdlib"))
                implementation(kotlin("test-annotations-common"))
            }

        }
        val jvm6Test by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }

        val jvm8Main by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvm8Test by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
        val macosMain by getting {
        }
        val macosTest by getting {
        }

    }
}