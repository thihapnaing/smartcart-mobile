// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("org.sonarqube") version "7.3.1.8318"
}
sonar {
  properties {
    property("sonar.projectKey", "thihapnaing_smartcart-mobile")
    property("sonar.organization", "thihapnaing0310")
  }
}
