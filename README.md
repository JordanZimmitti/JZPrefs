# JZPrefs
Library That Makes Getting And Saving SharedPreferences Easier

#### How To Access JZPrefs In Your Android App

Add these repositories to the android part of your app build.gradle

    // Repositories For App//
    repositories {

        // Github Repository//
        mavenCentral()

        // Maven Repository Url//
        maven { url 'https://jitpack.io' }
    }
    
Add This line of code to the dependencies in your build.gradle

    implementation 'com.github.JordanZimmitti:JZNightMode:x.x.x'
[![](https://jitpack.io/v/JordanZimmitti/JZNightMode.svg)](https://jitpack.io/#JordanZimmitti/JZNightMode)

#### Saves A Shared Preference

    // Saves Text 'Age'//
    JZPrefs.savePref(this, uniqueID, "Age")
    
#### Gets A Shared Preference

    // Gets Text 'Age'//
    JZPrefs.savePref(this, uniqueID, "")
