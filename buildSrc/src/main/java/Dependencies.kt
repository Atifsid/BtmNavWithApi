object Version {
    const val core = "1.10.1"
    const val appCompact = "1.6.1"
    const val androidMaterial = "1.9.0"
    const val androidLifeCycle = "2.6.1"
    const val activityCompose = "1.7.2"
    const val composeBom = "2023.08.00"
    const val junitTestImplementation = "4.13.2"
    const val junitAndroidTestImplementation = "1.1.5"
    const val espressoCore = "3.5.1"
    const val androidTestComposeBom = "2023.03.00"
    const val dagger = "2.44"
    const val hiltCompiler = "1.0.0"
    const val retrofit = "2.9.0"
    const val gsonConvertor = "2.9.0"
    const val okHttp = "4.9.0"
    const val scalerConvertor = "2.1.0"
    const val navVersion = "2.7.1"
    const val coilCompose = "2.4.0"
    const val hiltComposeNavigation = "1.0.0"
}

object Deps {
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appCompact = "androidx.appcompat:appcompat:${Version.appCompact}"
    const val androidMaterial = "com.google.android.material:material:${Version.androidMaterial}"
    const val androidLifeCycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.androidLifeCycle}"
}

object Compose {
    const val composeBom = "androidx.compose:compose-bom:${Version.composeBom}"
    const val activityCompose = "androidx.activity:activity-compose:${Version.activityCompose}"
    const val composeUi = "androidx.compose.ui:ui"
    const val composeUiGraphics = "androidx.compose.ui:ui-graphics"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val material3 = "androidx.compose.material3:material3"
    const val navigation = "androidx.navigation:navigation-compose:${Version.navVersion}"
}

object TestImplementation {
    const val junit = "junit:junit:${Version.junitTestImplementation}"
}

object AndroidTestImplementation{
    const val junit = "androidx.test.ext:junit:${Version.junitAndroidTestImplementation}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espressoCore}"
    const val androidTestComposeBom = "androidx.compose:compose-bom:${Version.androidTestComposeBom}"
    const val composeUiTestjunit = "androidx.compose.ui:ui-test-junit4"
}

object DebugImplementation {
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
}

object DaggerHilt {
    const val hilt  = "com.google.dagger:hilt-android:${Version.dagger}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Version.dagger}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Version.hiltCompiler}"
    const val hiltComposeNavigation = "androidx.hilt:hilt-navigation-compose:${Version.hiltComposeNavigation}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Version.gsonConvertor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val scalersConvertors = "com.squareup.retrofit2:converter-scalars:${Version.scalerConvertor}"
}

object Coil {
    const val coilCompose = "io.coil-kt:coil-compose:${Version.coilCompose}"
}