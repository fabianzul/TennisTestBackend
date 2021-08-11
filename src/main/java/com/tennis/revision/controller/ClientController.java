package com.tennis.revision.controller;

import com.tennis.revision.model.Client;
import com.tennis.revision.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("")
    public List<Client> list() {
        return clientService.listAllClient();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> get(@PathVariable Integer id) {
        try {
            Client user = clientService.getClient(id);
            return new ResponseEntity<Client>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("")
    public ResponseEntity<Client> add(@RequestBody Client client) {
        try {
            clientService.saveClient(client);
            System.out.println(client);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        } catch (Error error){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Client client, @PathVariable Integer id) {
        try {
            Client existClient = clientService.getClient(id);
            client.setId(id);
            clientService.saveClient(client);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        clientService.deleteClient(id);
    }
}
