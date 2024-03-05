package edu.lemons.model.repository;

import edu.lemons.model.dto.ProductDto;
import edu.lemons.model.entity.ProductEntity;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {

    List<ProductDto> findByproduct_name(String name);

    // TODO: Test query -> remove
    @NonNull List<ProductEntity> findAll();

}