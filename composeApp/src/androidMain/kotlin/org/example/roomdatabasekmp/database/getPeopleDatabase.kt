package org.example.roomdatabasekmp.database

import android.content.Context
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver

fun getPeopleDatabase(context: Context):PeopleDatabase{
    val dbfile= context.getDatabasePath("people.db")
    return Room.databaseBuilder<PeopleDatabase>(
        context= context.applicationContext,
        name=dbfile.absolutePath
    )
        .setDriver(BundledSQLiteDriver())
        .build()
}