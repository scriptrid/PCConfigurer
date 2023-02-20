package ru.scriptrid.pcconfigurer.model.entity.pc.cooler;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.scriptrid.pcconfigurer.model.entity.pc.ProcessorSocket;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "pc_cooler")
public class PCCoolerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @ElementCollection
    @Column(name = "compatible_socket")
    @CollectionTable(name = "pc_cooler_compatible_sockets", joinColumns = @JoinColumn(name = "owner_id"))
    private Set<ProcessorSocket> compatibleSockets = new LinkedHashSet<>();

    @Column(name = "tdp")
    private Integer tdp;

}