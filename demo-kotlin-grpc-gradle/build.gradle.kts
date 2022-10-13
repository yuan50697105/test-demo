import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protoc
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("java")
	id("java-library")
	id("org.springframework.boot") version "2.7.4"
	id("io.spring.dependency-management") version "1.0.14.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	id("com.google.protobuf") version "0.8.13"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

subprojects {
	apply {
		plugin("java")
		plugin("java-library")
		plugin("org.springframework.boot")
		plugin("io.spring.dependency-management")
		plugin("com.google.protobuf")
		plugin("org.jetbrains.kotlin.jvm")
		plugin("org.jetbrains.kotlin.plugin.spring")
		plugin("org.jetbrains.kotlin.plugin.allopen")
	}



	repositories {
		mavenCentral()
	}

	dependencies {
		implementation("net.devh:grpc-spring-boot-starter:2.13.1.RELEASE")
		implementation("io.grpc:grpc-stub:1.49.0")
		implementation("io.grpc:grpc-protobuf:1.49.0")
		implementation("io.grpc:grpc-netty-shaded:1.49.0")
		implementation("io.grpc:grpc-kotlin-stub:1.3.0")
		implementation("com.google.protobuf:protobuf-kotlin:3.21.6")
		implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
		implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		developmentOnly("org.springframework.boot:spring-boot-devtools")
		annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("io.projectreactor:reactor-test")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict","-opt-in=kotlin.RequiresOptIn")
			jvmTarget = "1.8"
		}
	}

	tasks.withType<Test> {
		enabled=false
		useJUnitPlatform()
	}

	sourceSets{
		main{
			java{
				srcDirs.add(File("src/main/grpc"))
			}

		}
	}
	kotlin{
		sourceSets{
			main{
				kotlin.srcDirs.add(File("src/main/grpc"))
			}
		}
	}



	protobuf {
		protobuf.generatedFilesBaseDir="$projectDir/src"
		protobuf.protoc {
			artifact = "com.google.protobuf:protoc:3.21.6"
		}
		protobuf.plugins {
			id("grpc") {
				artifact = "io.grpc:protoc-gen-grpc-java:1.49.0"
			}
			id("grpckt") {
				artifact = "io.grpc:protoc-gen-grpc-kotlin:1.3.0:jdk8@jar"
			}
		}
		protobuf.generateProtoTasks {
			all().forEach {
				it.plugins {
					id("grpc"){
						outputSubDir="grpc"
					}
					id("grpckt"){
						outputSubDir="grpc"
					}
				}
				it.builtins {
					id("kotlin"){
						outputSubDir="grpc"
					}
				}
			}
		}
	}
}
tasks.bootJar{
	enabled=false
}

