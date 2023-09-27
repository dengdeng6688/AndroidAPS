plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

apply(from = "${project.rootDir}/core/main/android_dependencies.gradle")
apply(from = "${project.rootDir}/core/main/android_module_dependencies.gradle")

android {

    namespace = "com.jjoe64.graphview"
}

dependencies {
    api(Libs.AndroidX.core)
}