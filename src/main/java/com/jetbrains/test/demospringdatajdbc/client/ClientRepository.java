package com.jetbrains.test.demospringdatajdbc.client;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

interface ClientRepository extends ListCrudRepository<Client, Integer> {
    List<Client> findByEmail(String email);
    List<Client> findByNameContaining(String name);
}
