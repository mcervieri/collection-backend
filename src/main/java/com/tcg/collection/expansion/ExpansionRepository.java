package com.tcg.collection.expansion;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ExpansionRepository extends JpaRepository<Expansion, UUID> {
}