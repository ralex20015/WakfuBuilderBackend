rootProject.name = "wakfu-builder-backend"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("worker-jobs")
include("core")
include("api")
include("app")