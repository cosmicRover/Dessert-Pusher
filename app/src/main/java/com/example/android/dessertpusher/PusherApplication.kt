package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

class PusherApplication: Application(){

    override fun onCreate() {
        super.onCreate()

        //init the timber library for the whole app to use
        Timber.plant(Timber.DebugTree())
    }
}