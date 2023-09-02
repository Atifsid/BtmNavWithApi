plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.btmnavwapi"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.btmnavwapi"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.8"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":core:common"))
    implementation(project(":core:common_utils"))
    implementation(project(":core:network"))
    implementation(project(":feature:module1:data"))
    implementation(project(":feature:module1:domain"))
    implementation(project(":feature:module1:ui"))
    implementation(project(":feature:module2:ui"))

    implementation(Deps.core)
    implementation(Deps.androidLifeCycle)
    implementation(Compose.activityCompose)
    implementation(platform(Compose.composeBom))
    implementation(Compose.composeUi)
    implementation(Compose.composeUiGraphics)
    implementation(Compose.uiToolingPreview)
    implementation(Compose.material3)
    testImplementation(TestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.espressoCore)
    androidTestImplementation(platform(AndroidTestImplementation.androidTestComposeBom))
    androidTestImplementation(AndroidTestImplementation.composeUiTestjunit)
    debugImplementation(DebugImplementation.composeUiTooling)
    debugImplementation(DebugImplementation.composeUiTestManifest)

    implementation(DaggerHilt.hilt)
    kapt(DaggerHilt.hiltAndroidCompiler)
    implementation(DaggerHilt.hiltComposeNavigation)

    implementation(Retrofit.retrofit)
    implementation(Retrofit.okHttp)
    implementation(Retrofit.gsonConvertor)

    implementation(Compose.navigation)
}

kapt {
    correctErrorTypes = true
}