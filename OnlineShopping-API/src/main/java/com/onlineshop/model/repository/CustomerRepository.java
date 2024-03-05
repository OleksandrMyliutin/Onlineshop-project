package edu.lemons.model.repository;

import edu.lemons.model.dto.CustomerDto;
import edu.lemons.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {
    Optional<CustomerDto> findByName(String name);

}