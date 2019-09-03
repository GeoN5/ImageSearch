package com.example.mvvm_searchimage

import android.app.Application
import com.example.mvvm_searchimage.di.myDiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            //Android context
            androidContext(this@MyApplication)
            //modules
            modules(myDiModule)
        }

    }
}