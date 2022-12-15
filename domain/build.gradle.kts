plugins {
    id(Dependencies.GradlePlugins.pluginJavaLibrary)
    id(Dependencies.GradlePlugins.pluginKotlinJvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    //coroutines dependency
    implementation(Dependencies.Test.coroutinesTest)

    // Local unit tests
    testImplementation(Dependencies.Test.junitCore)
    testImplementation(Dependencies.Test.testingCore)
    testImplementation(Dependencies.Test.coroutinesTest)
    testImplementation(Dependencies.Test.truth)
    testImplementation(Dependencies.Test.mockWebServer)
    testImplementation(Dependencies.Test.mockCore)
    // Optional -- Mockito framework
    testImplementation(Dependencies.Test.mockitoCore)
    // Optional -- mockito-kotlin
    testImplementation(Dependencies.Test.mockitoKotlin)
}