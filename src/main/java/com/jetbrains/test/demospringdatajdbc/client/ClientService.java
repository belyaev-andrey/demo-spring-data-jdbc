package com.jetbrains.test.demospringdatajdbc.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
class ClientService {

    private final ClientRepository clientRepository;

    ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(clientRepository.findAll());
    }

    public List<Client> findByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

}
