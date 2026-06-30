import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("default")

    productFlavors {
        create("dev") {
            dimension = "default"
            applicationId = "com.example.profile_app.dev"
            resValue(type = "string", name = "app_name", value = "PApp - Dev")
        }
        create("staging") {
            dimension = "default"
            applicationId = "com.example.profile_app.staging"
            resValue(type = "string", name = "app_name", value = "PApp - Staging")
        }
        create("prod") {
            dimension = "default"
            applicationId = "com.example.profile_app"
            resValue(type = "string", name = "app_name", value = "PApp - Prod")
        }
    }

    buildFeatures.resValues = true
}