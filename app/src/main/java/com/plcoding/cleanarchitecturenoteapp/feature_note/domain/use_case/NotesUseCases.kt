package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NotesUseCases(
    val getNoteUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNote: GetNoteUseCase
)
