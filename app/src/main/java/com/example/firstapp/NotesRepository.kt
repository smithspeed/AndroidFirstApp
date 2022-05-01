package com.example.firstapp

import androidx.lifecycle.LiveData

class NotesRepository(private val notesDao: NotesDao) {

    suspend fun insertNotes(notes: Notes){

        notesDao.insertNotes(notes)
    }

    fun getNotes() : LiveData<List<Notes>>{
        return notesDao.getNotes()
    }
}