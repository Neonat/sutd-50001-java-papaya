# JavaPapaya

Java and Android learning exercises from Infosys coursework, kept as a reference project. The repository combines Android project scaffolding with standalone Java problem sets and tutorial attempts.

## Project index

| Path | Contents |
| --- | --- |
| [app](app/) | Android application module, resources and generated example tests; namespace `com.example.javapapaya` |
| [myapplication](myapplication/) | Second Android application module; namespace `com.example.myapplication` |
| [Tutorial27Jan](myapplication/src/main/java/Tutorial27Jan/) | Java tutorial exercises, including static-method and variable-swap attempts |
| [Problem-Set-1X](myapplication/Problem-Set-1X/) | Standalone Java question folders, stored outside the Android module's default `src/main/java` source set |
| [settings.gradle.kts](settings.gradle.kts) | Gradle project definition including both `:app` and `:myapplication` |
| [gradle/libs.versions.toml](gradle/libs.versions.toml) | Dependency and Android Gradle Plugin version catalogue |

## Opening in Android Studio

1. Open the repository root containing `settings.gradle.kts`, then let Android Studio import both modules.
2. Configure the local Android SDK and Gradle JDK for the checked-in toolchain. The project specifies Android Gradle Plugin `9.0.0` and Gradle wrapper `9.1.0`.
3. Install Android SDK API 36. Both modules declare compile/target SDK 36, minimum SDK 24 and Java source/target compatibility 11. Java source compatibility is separate from the JDK required to run Gradle.
4. Select the module you want to inspect. Review and complete its exercises before attempting a build or run configuration.

The checked-in manifests define application scaffolding without launcher activities, and some Java exercises are incomplete. Builds and emulator/device runs have not been verified as part of this documentation update. The problem-set files can be studied independently of the Android module source set.
