package com.tennis.revision.controller;

import com.tennis.revision.model.RevisionTicket;
import com.tennis.revision.service.RevisionTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/revisionTickets")
public class RevisionTicketController {
    @Autowired
    RevisionTicketService revisionTicketService;

    @GetMapping("")
    public List<RevisionTicket> list() {
        return revisionTicketService.listAllRevisionTicket();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RevisionTicket> get(@PathVariable Integer id) {
        try {
            RevisionTicket revisionTicket = revisionTicketService.getRevisionTicket(id);
            return new ResponseEntity<RevisionTicket>(revisionTicket, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<RevisionTicket>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody RevisionTicket revisionTicket) {
        revisionTicketService.saveRevisionTicket(revisionTicket);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody RevisionTicket revisionTicket, @PathVariable Integer id) {
        try {
            RevisionTicket existRevisionTicket = revisionTicketService.getRevisionTicket(id);
            revisionTicket.setId(id);
            revisionTicketService.saveRevisionTicket(revisionTicket);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        revisionTicketService.deleteRevisionTicket(id);
    }
}
