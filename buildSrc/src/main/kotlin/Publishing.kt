import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost
import org.gradle.api.Project

fun Project.setupMavenPublishing(artifactId:String) {
    extensions.configure(MavenPublishBaseExtension::class.java) {
        this.apply {
            coordinates(
                groupId = "ir.ehsannarmani.compose-plus",
                artifactId = artifactId,
                version = "0.0.1"
            )
            pom {
                name.set("Compose Plus")
                description.set("https://github.com/ehsannarmani/compose-plus")
                inceptionYear.set("2025")
                url.set("https://github.com/ehsannarmani/compose-plus")

                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }

                // Specify developers information
                developers {
                    developer {
                        id.set("ehsannarmani")
                        name.set("Ehsan Narmani")
                        email.set("ehsan.enk.narmani@gmail.com")
                    }
                }

                // Specify SCM information
                scm {
                    url.set("https://github.com/ehsannarmani/compose-plus")
                }
            }
            publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
            signAllPublications()
        }
    }
}