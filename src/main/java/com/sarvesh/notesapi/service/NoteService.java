package com.sarvesh.notesapi.service;



import com.sarvesh.notesapi.entity.Note;
import com.sarvesh.notesapi.entity.User;
import com.sarvesh.notesapi.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired private NoteRepository noteRepository;

    public Note createNote(User user, String content) {
        Note note = new Note();
        note.setUser(user);
        note.setContent(content);
        return noteRepository.save(note);
    }

    public List<Note> getNotesByUser(User user) {
        return noteRepository.findByUser(user);
    }

    public void deleteAllNotes() {
        noteRepository.deleteAll();
    }
}

