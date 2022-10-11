plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.ahmaddudayef.githubclientapp"
    compileSdk = AndroidConfig.compileSdkVersion

    defaultConfig {
        applicationId = "com.ahmaddudayef.githubclientapp"
        minSdk = AndroidConfig.minSdkVersion
        targetSdk = AndroidConfig.targetSdkVersion
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName
        vectorDrawables {
            useSupportLibrary = true
        }

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":core"))

    implementation(AndroidLib.kotlinStdlib)
    implementation(AndroidLib.androidxCore)
    implementation(AndroidLib.androidxAppcompat)
    implementation(AndroidLib.material)
    implementation(AndroidLib.androidxConstraintLayout)
    implementation(AndroidLib.preferencesDataStore)
    implementation(AndroidLib.swipeRefreshLayout)

    implementation(AndroidLib.navFragment)
    implementation(AndroidLib.navUi)

    implementation(AndroidLib.hilt)
    kapt(AndroidLib.hiltCompiler)

    implementation(AndroidLib.viewmodel)
    implementation(AndroidLib.livedata)

    implementation(AndroidLib.paging3)

    implementation(AndroidLib.coroutinesCore)
    implementation(AndroidLib.coroutinesAndroid)

    implementation(AndroidLib.retrofit)
    implementation(AndroidLib.retrofitGson)
    implementation(AndroidLib.okhttpLoggingInterceptor)

    implementation(AndroidLib.coil)
    implementation(AndroidLib.circleImage)
    implementation(AndroidLib.timber)

    implementation(AndroidLib.room)
    kapt(AndroidLib.roomCompiler)

    testImplementation(AndroidTestLib.jUnit)
    androidTestImplementation(AndroidTestLib.androidTestJUnit)
    androidTestImplementation(AndroidTestLib.androidTestEspressoCore)
    androidTestImplementation(AndroidTestLib.androidTestNavigation)
}

kapt {
    correctErrorTypes = true
}