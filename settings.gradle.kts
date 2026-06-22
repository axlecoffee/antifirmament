pluginManagement {
	repositories {
		mavenLocal()
		maven("https://maven.axle.coffee/releases")
		mavenCentral()
		gradlePluginPortal()
		maven("https://maven.fabricmc.net/")
		maven("https://maven.architectury.dev")
		maven("https://maven.minecraftforge.net")
		maven("https://maven.kikugie.dev/snapshots")
		maven("https://maven.kikugie.dev/releases")
	}
}

plugins {
	id("net.fabricmc.fabric-loom") version "1.16.1" apply false
	id("net.fabricmc.fabric-loom-remap") version "1.16.1" apply false
	id("dev.architectury.loom") version "1.14.473" apply false
	kotlin("jvm") version "2.3.10" apply false
	kotlin("plugin.serialization") version "2.3.10" apply false
	id("coffee.axle.blahaj") version "3.2.0"
	id("dev.kikugie.stonecutter") version "0.9.6"
}

buildscript {
    configurations.classpath {
        resolutionStrategy {
            force(
                "org.jetbrains.kotlinx:kotlinx-serialization-json-jvm:1.8.1",
                "org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.8.1",
                "org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1",
                "org.jetbrains.kotlinx:kotlinx-serialization-core:1.8.1"
            )
        }
    }
}


blahaj {
	init(rootProject) {
		mc("1.21.10", "fabric")
		// mc("1.21.11", "fabric") // 1.21.10 works for this as well
		mc("26.1.2", "fabric")
	}
}

rootProject.name = "antifirm"
