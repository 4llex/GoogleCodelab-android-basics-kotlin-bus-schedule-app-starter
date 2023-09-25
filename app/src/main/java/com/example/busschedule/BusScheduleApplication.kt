package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDatabase

class BusScheduleApplication: Application() {
    val appDatabase: AppDatabase by lazy { AppDatabase.getDatabase(this)}
}