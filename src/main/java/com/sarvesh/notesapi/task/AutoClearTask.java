package com.sarvesh.notesapi.task;

import com.sarvesh.notesapi.service.NoteService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AutoClearTask {

    private final NoteService noteService;

    public AutoClearTask(NoteService noteService) {
        this.noteService = noteService;
    }

    // Runs every day at midnight
    @Scheduled(cron = "0 0 0 * * ?")
    public void clearNotesDaily() {
        noteService.deleteAllNotes();
        System.out.println("✅ All notes cleared (Scheduled Task)");
    }
}
