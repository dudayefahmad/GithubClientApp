plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.ahmaddudayef.core"
    compileSdk = AndroidConfig.compileSdkVersion

    defaultConfig {
        minSdk = AndroidConfig.minSdkVersion
        targetSdk = AndroidConfig.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    implementation(AndroidLib.kotlinStdlib)
    implementation(AndroidLib.androidxCore)
    implementation(AndroidLib.androidxAppcompat)
    implementation(AndroidLib.material)
    implementation(AndroidLib.androidxConstraintLayout)

    implementation(AndroidLib.coroutinesCore)
    implementation(AndroidLib.coroutinesAndroid)

    implementation(AndroidLib.viewmodel)
    implementation(AndroidLib.livedata)
    implementation(AndroidLib.coil)

    testImplementation(AndroidTestLib.jUnit)
    androidTestImplementation(AndroidTestLib.androidTestJUnit)
    androidTestImplementation(AndroidTestLib.androidTestEspressoCore)
}