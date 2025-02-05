package com.david.clientMicrosservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.clientMicrosservice.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
