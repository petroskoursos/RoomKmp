package org.example.roomdatabasekmp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface PeopleDao {

    @Upsert
    suspend fun upsert(person: Person)

    @Delete
    suspend fun delete(person: Person)

    @Query("SELECT * FROM people")
    fun getallPeople(): Flow<List<Person>>
}