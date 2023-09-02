pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BtmNavWApi"
include(":app")
include(":feature:module1:data")
include(":feature:module1:domain")
include(":feature:module1:ui")
include(":feature:module2:data")
include(":feature:module2:domain")
include(":feature:module2:ui")
include(":core:common")
include(":core:network")
include(":core:common_utils")
include(":core:feature_api")
