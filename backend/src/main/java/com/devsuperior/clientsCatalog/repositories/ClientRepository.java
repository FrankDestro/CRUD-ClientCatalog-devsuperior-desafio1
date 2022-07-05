package com.devsuperior.clientsCatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.clientsCatalog.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
