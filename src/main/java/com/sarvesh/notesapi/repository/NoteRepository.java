package com.sarvesh.notesapi.repository;

import com.sarvesh.notesapi.entity.Note;
import com.sarvesh.notesapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByUser(User user);
}