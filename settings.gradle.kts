pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.develocity") version "4.3"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2"
    id("com.fueledbycaffeine.spotlight") version "1.4.1"
}
rootProject.name = "tests_project"
develocity {
    server = "https://ge.solutions-team.gradle.com/"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
} 
include (":core:push")
include (":core:contact")
include (":core:login")
include (":core:identity")
include (":feature:checkout")
include (":feature:cart")
include (":feature:user")
include (":feature:profile")
include (":domain:feed")
include (":domain:comment")
include (":domain:post")
include (":domain:search")
include (":repository:location")
include (":repository:network")
include (":repository:sync")
include (":repository:share")
include (":model:group")
include (":model:message")
include (":model:notification")
include (":app:app")