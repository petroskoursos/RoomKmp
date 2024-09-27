package org.example.roomdatabasekmp.database

import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import platform.Foundation.NSHomeDirectory

fun getPeopleDatabase():PeopleDatabase{

    val dbfile= documentDirectory() +"/people.db"
    return Room.databaseBuilder(
        name = dbfile,
        factory = {PeopleDatabase::class.instantiateImpl()}
    )
        .setDriver(BundledSQLiteDriver)
        .build()
}