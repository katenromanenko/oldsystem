package com.example.oldsystem.controller;

import com.example.oldsystem.model.Client;
import com.example.oldsystem.model.Note;
import com.example.oldsystem.model.NoteRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class OldSystemController {

    @PostMapping("/clients")
    public ArrayList<Object> getAllClients() {
        // Возвращаем список клиентов
        ArrayList<Object> clients = new ArrayList<>();
        clients.add(new Client("vhh4", "01588E84-D45A-EB98-F47F-716073A4F1EF", "Ne", "Abr", "INACTIVE", "10-15-1999", "2021-11-15 11:51:59"));
        return clients;
    }

    @PostMapping("/notes")
    public List<Note> getClientNotes(@RequestBody NoteRequest request) {
        // Возвращаем список заметок для клиента
        List<Note> notes = new ArrayList<>();
        notes.add(new Note("Patient Care Coordinator, reached out to patient caregiver is still in the hospital.",
                "20CBCEDA-3764-7F20-0BB6-4D6DD46BA9F8",
                "2021-11-15 11:51:59",
                "C5DCAA49-ADE5-E65C-B776-3F6D7B5F2055",
                "2021-09-16 12:02:26 CDT",
                "p.vasya",
                "2021-11-15 11:51:59"));
        return notes;
    }
}

