plugins {
    id (Dependencies.GradlePlugins.pluginAndroidApplication)
    id (Dependencies.GradlePlugins.pluginAndroidKotlin)
    id (Dependencies.GradlePlugins.pluginKotlinKapt)
    id (Dependencies.GradlePlugins.pluginAppDaggerHilt)
    id (Dependencies.GradlePlugins.pluginKotlinParcelize)
}

android {
    namespace = "com.best.easymind"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.best.easymind"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))

    // ui dependency
    implementation(Dependencies.UICore.androidCore)
    implementation(Dependencies.Compose.composeUi)
    implementation(Dependencies.Compose.composeMaterial)
    implementation(Dependencies.Compose.composeUiPreview)
    implementation(Dependencies.UICore.lifecycle)
    implementation(Dependencies.Compose.composeActivity)
    implementation(Dependencies.Compose.composeSystemUiController)
    implementation(Dependencies.Compose.composeViewpager)
    implementation(Dependencies.Compose.composeViewpagerIndicators)
    implementation(Dependencies.Compose.composeSwipeRefresh)
    implementation(Dependencies.Compose.composeConstraintLayout)
    implementation(Dependencies.Compose.composeLiveData)
    implementation(Dependencies.Compose.composeViewModel)

    //test and debug
    testImplementation(Dependencies.Test.junitCore)
    androidTestImplementation(Dependencies.Test.junitAndroid)
    androidTestImplementation(Dependencies.Test.espressoCore)
    androidTestImplementation(Dependencies.Compose.composeJunit)
    debugImplementation(Dependencies.Compose.composeUiToolkit)
    debugImplementation(Dependencies.Compose.composeTestManifest)
    coreLibraryDesugaring(Dependencies.UICore.coreLibs)

    //Dagger - Hilt
    implementation(Dependencies.DaggerHilt.hiltAndroid)
    kapt(Dependencies.DaggerHilt.hiltAndroidCompiler)
    kapt(Dependencies.DaggerHilt.hiltCompiler)
    implementation(Dependencies.DaggerHilt.hiltNavigationCompose)

    // Room
    implementation(Dependencies.Room.roomRuntime)
    kapt(Dependencies.Room.roomCompiler)
    implementation(Dependencies.Room.roomCoroutinesExtension)
}