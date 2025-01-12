plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}
dependencies{
    implementation(libs.gradle.maven.publish.plugin)
    implementation(libs.gradle)
    implementation(libs.pluginKotlin)
    implementation(libs.pluginComposeCompiler)
    implementation(libs.pluginComposeMultiplatform)
}
