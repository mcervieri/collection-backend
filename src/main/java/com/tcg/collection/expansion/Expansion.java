package com.tcg.collection.expansion;

import com.tcg.collection.collection.Collection;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "expansions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expansion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id", nullable = false)
    private Collection collection;

    @Column(nullable = false)
    private String name;

    private String code;
}