package ru.scriptrid.pcconfigurer.model.entity.pc.motherboard;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.scriptrid.pcconfigurer.model.entity.pc.ProcessorSocket;

@Entity
@Getter
@Setter
@Table(name = "motherboard")
public class MotherboardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "processor_socket")
    private ProcessorSocket processorSocket;

}