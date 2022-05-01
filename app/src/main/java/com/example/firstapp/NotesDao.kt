package com.example.firstapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NotesDao {

    @Insert
    suspend fun insertNotes(notes : Notes)

    @Delete
    suspend fun deleteNotes(notes: Notes)

    @Query("SELECT * FROM notes")
    fun getNotes() : LiveData<List<Notes>>
}