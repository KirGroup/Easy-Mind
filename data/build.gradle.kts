plugins {
    id(Dependencies.GradlePlugins.pluginAndroidLibrary)
    id(Dependencies.GradlePlugins.pluginAndroidKotlin)
    id(Dependencies.GradlePlugins.pluginKotlinKapt)
    id(Dependencies.GradlePlugins.pluginAppDaggerHilt)
    id(Dependencies.GradlePlugins.pluginKotlinParcelize)
}

android {
    namespace = "com.best.data"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":domain"))

    implementation(Dependencies.UICore.androidCore)

    // Room
    implementation(Dependencies.Room.roomRuntime)
    kapt(Dependencies.Room.roomCompiler)
    implementation(Dependencies.Room.roomCoroutinesExtension)

    //Dagger - Hilt
    implementation(Dependencies.DaggerHilt.hiltAndroid)
    kapt(Dependencies.DaggerHilt.hiltAndroidCompiler)
    kapt(Dependencies.DaggerHilt.hiltCompiler)
    implementation(Dependencies.DaggerHilt.hiltNavigationCompose)

    // Local unit tests
    testImplementation(Dependencies.Test.junitCore)
    testImplementation(Dependencies.Test.testingCore)
    testImplementation(Dependencies.Test.coroutinesTest)
    testImplementation(Dependencies.Test.truth)
    testImplementation(Dependencies.Test.mockWebServer)
    testImplementation(Dependencies.Test.mockCore)
    debugImplementation(Dependencies.Compose.composeTestManifest)

    // Instrumentation tests
    androidTestImplementation(Dependencies.Test.daggerHiltTesting)
    kaptAndroidTest(Dependencies.DaggerHilt.hiltAndroidCompiler)
    androidTestImplementation(Dependencies.Test.junitCore)
    androidTestImplementation(Dependencies.Test.coroutinesTest)
    androidTestImplementation(Dependencies.Test.testingCore)
    androidTestImplementation(Dependencies.Test.truth)
    androidTestImplementation(Dependencies.Test.junitAndroid)
    androidTestImplementation(Dependencies.Test.mockWebServer)
    androidTestImplementation(Dependencies.Test.mockAndroid)
    androidTestImplementation(Dependencies.Test.testRunner)
    androidTestImplementation(Dependencies.Test.dexmaker)
}