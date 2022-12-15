object Dependencies {

    object GradlePlugins {
        const val pluginDaggerHilt = "com.google.dagger:hilt-android-gradle-plugin:2.44"
        const val pluginAndroidApplication = "com.android.application"
        const val pluginAndroidApplicationVersion = "7.3.1"
        const val pluginAndroidLibrary = "com.android.library"
        const val pluginAndroidLibraryVersion = "7.3.1"
        const val pluginAndroidKotlin = "org.jetbrains.kotlin.android"
        const val pluginAndroidKotlinVersion = "1.6.10"
        const val pluginKotlinJvm = "org.jetbrains.kotlin.jvm"
        const val pluginKotlinJvmVersion = "1.7.20"
        const val pluginKotlinKapt = "kotlin-kapt"
        const val pluginAppDaggerHilt = "dagger.hilt.android.plugin"
        const val pluginKotlinParcelize = "kotlin-parcelize"
        const val pluginJavaLibrary = "java-library"
    }

    object UICore {
        const val androidCore = "androidx.core:core-ktx:1.9.0"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
        const val coreLibs = "com.android.tools:desugar_jdk_libs:2.0.0"
    }

    object Test {
        const val junitCore = "junit:junit:4.13.2"
        const val junitAndroid = "androidx.test.ext:junit:1.1.4"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.5.0"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
        const val testingCore = "androidx.arch.core:core-testing:2.1.0"
        const val truth = "com.google.truth:truth:1.1.3"
        const val mockWebServer = "com.squareup.okhttp3:mockwebserver:4.9.1"
        const val mockCore = "io.mockk:mockk:1.10.5"
        const val mockAndroid = "io.mockk:mockk-android:1.10.5"
        const val mockitoCore = "org.mockito:mockito-core:4.3.1"
        const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:4.0.0"
        const val testRunner = "androidx.test:runner:1.5.1"
        const val dexmaker = "com.linkedin.dexmaker:dexmaker:2.28.3"
        const val daggerHiltTesting = "com.google.dagger:hilt-android-testing:2.37"
    }

    object Compose {
        const val composeUi = "androidx.compose.ui:ui:1.3.2"
        const val composeMaterial = "androidx.compose.material:material:1.3.1"
        const val composeUiPreview = "androidx.compose.ui:ui-tooling-preview:1.3.2"
        const val composeActivity = "androidx.activity:activity-compose:1.6.1"
        const val composeJunit = "androidx.compose.ui:ui-test-junit4:1.3.2"
        const val composeUiToolkit = "androidx.compose.ui:ui-tooling:1.3.2"
        const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:1.3.2"
        const val composeSystemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:0.18.0"
        const val composeViewpager = "com.google.accompanist:accompanist-pager:0.26.4-beta"
        const val composeViewpagerIndicators =
            "com.google.accompanist:accompanist-pager-indicators:0.26.4-beta"
        const val composeSwipeRefresh = "com.google.accompanist:accompanist-swiperefresh:0.25.0"
        const val composeConstraintLayout =
            "androidx.constraintlayout:constraintlayout-compose:1.0.1"
        const val composeLiveData = "androidx.compose.runtime:runtime-livedata:1.3.0-beta03"
        const val composeViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
    }

    object Room {
        const val roomRuntime = "androidx.room:room-runtime:2.4.3"
        const val roomCompiler = "androidx.room:room-compiler:2.4.3"
        const val roomCoroutinesExtension = "androidx.room:room-ktx:2.4.3"
    }

    object DaggerHilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:2.44"
        const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:2.44"
        const val hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0"
        const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }
}