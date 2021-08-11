package com.tennis.revision.service;

import com.tennis.revision.model.Client;
import com.tennis.revision.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client> listAllClient() {
        return clientRepository.findAll();
    }

    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    public Client getClient(Integer id) {
        return clientRepository.findById(id).get();
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }
}
