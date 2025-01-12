import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project

fun Project.configureAndroid(
    artifactId: String,
    compileSdk: Int = 35,
    minSdk: Int = 21
) {
    extensions.configure(LibraryExtension::class.java) {
        this.namespace = "ir.ehsannarmani.compose_plus.$artifactId"
        this.compileSdk = compileSdk

        defaultConfig {
            this.minSdk = minSdk
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        buildTypes {
            getByName("release") {
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
    }
}