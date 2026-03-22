package com.tcg.collection.collection;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CollectionRepository extends JpaRepository<Collection, UUID> {
}