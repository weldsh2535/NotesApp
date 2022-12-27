package com.version1.samplenoteapp.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.version1.samplenoteapp.Models.Note

@Dao
interface NoteDao {


    @Query("SELECT * FROM notes_table ORDER BY id DESC")
    fun getAllNotes():LiveData<List<Note>>

    @Insert
    fun insert(note: Note?)

    @Delete
    fun deleteNote(note: Note?)

    @Update
    fun updateNote(note: Note?)
}