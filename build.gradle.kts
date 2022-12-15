buildscript {
    dependencies {
        classpath(Dependencies.GradlePlugins.pluginDaggerHilt)
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Dependencies.GradlePlugins.pluginAndroidApplication) version Dependencies.GradlePlugins.pluginAndroidApplicationVersion apply false
    id(Dependencies.GradlePlugins.pluginAndroidLibrary) version Dependencies.GradlePlugins.pluginAndroidLibraryVersion apply false
    id(Dependencies.GradlePlugins.pluginAndroidKotlin) version Dependencies.GradlePlugins.pluginAndroidKotlinVersion apply false
    id(Dependencies.GradlePlugins.pluginKotlinJvm) version Dependencies.GradlePlugins.pluginKotlinJvmVersion apply false
}