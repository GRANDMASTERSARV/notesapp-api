package com.sarvesh.notesapi.controller;

import com.sarvesh.notesapi.entity.Note;
import com.sarvesh.notesapi.entity.User;
import com.sarvesh.notesapi.service.NoteService;
import com.sarvesh.notesapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired private NoteService noteService;
    @Autowired private UserService userService;

    static class NoteRequest {
        public String content;
    }

    @PostMapping
    public Note createNote(@AuthenticationPrincipal UserDetails userDetails,
                           @RequestBody NoteRequest noteRequest) {
        User user = userService.findByUsername(userDetails.getUsername()).get();
        return noteService.createNote(user, noteRequest.content);
    }

    @GetMapping
    public List<Note> getNotes(@AuthenticationPrincipal UserDetails userDetails) {
        User user = userService.findByUsername(userDetails.getUsername()).get();
        return noteService.getNotesByUser(user);
    }
}
