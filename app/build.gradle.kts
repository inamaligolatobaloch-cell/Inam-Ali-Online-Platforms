plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.inamali.onlineplatforms"
    compileSdk = 35
    compileOptions {\n        sourceCompatibility = JavaVersion.VERSION_17\n        targetCompatibility = JavaVersion.VERSION_17\n    }\n    kotlinOptions { jvmTarget = "17" }\n    defaultConfig {
        applicationId = "com.inamali.onlineplatforms"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
