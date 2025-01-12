import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.compose.ComposePlugin
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

@OptIn(ExperimentalWasmDsl::class)
fun Project.configureKotlinMultiplatform(artifactId:String){
    extensions.configure(KotlinMultiplatformExtension::class.java) {
        val compose = (this as ExtensionAware).extensions.getByName("compose") as ComposePlugin.Dependencies
        wasmJs {
            this.moduleName = "compose-plus-$artifactId"
            browser {
                commonWebpackConfig {
                    outputFileName = "compose-plus-$artifactId.js"
                    devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                        static = (static ?: mutableListOf()).apply {
                            add(project.projectDir.path)
                        }
                    }
                }
            }
            binaries.library()
        }
        androidTarget   {
            compilerOptions {
                jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
            }
            publishLibraryVariants("release", "debug")
        }

        jvm("desktop")
        iosX64()
        iosArm64()
        iosSimulatorArm64()

    }
}