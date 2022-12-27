package com.version1.samplenoteapp.Database

import androidx.lifecycle.LiveData
import com.version1.samplenoteapp.Models.Note

class NotesRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note:Note){
        noteDao.insert(note)
    }
    suspend fun delete(note: Note){
        noteDao.deleteNote(note)
    }
    suspend fun update(note:Note){
        noteDao.updateNote(note)
    }
}