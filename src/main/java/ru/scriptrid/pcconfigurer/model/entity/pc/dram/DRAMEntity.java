package ru.scriptrid.pcconfigurer.model.entity.pc.dram;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ram")
public class DRAMEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "dram_type", nullable = false)
    private DRAMType dramType;

    @Column(name = "memory_capacity", nullable = false)
    private Integer memoryCapacity;

}