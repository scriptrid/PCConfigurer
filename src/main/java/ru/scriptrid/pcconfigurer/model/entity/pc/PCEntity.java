package ru.scriptrid.pcconfigurer.model.entity.pc;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.scriptrid.pcconfigurer.model.entity.pc.cooler.PCCoolerEntity;
import ru.scriptrid.pcconfigurer.model.entity.pc.dram.DRAMEntity;
import ru.scriptrid.pcconfigurer.model.entity.pc.drive.DriveEntity;
import ru.scriptrid.pcconfigurer.model.entity.pc.graphicsCard.GraphicsCardEntity;
import ru.scriptrid.pcconfigurer.model.entity.pc.motherboard.MotherboardEntity;
import ru.scriptrid.pcconfigurer.model.entity.pc.processor.PCProcessorEntity;
import ru.scriptrid.pcconfigurer.model.entity.pc.psu.PowerSupplyEntity;

@Entity
@Setter
@Getter
@Table(name = "pc")
public class PCEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "pc_name", nullable = false, unique = true)
    private String pcName;

    @ManyToOne
    @JoinColumn(name = "motherboard_id")
    private MotherboardEntity motherboard;

    @ManyToOne
    @JoinColumn(name = "processor_id")
    private PCProcessorEntity processor;

    @ManyToOne
    @JoinColumn(name = "graphics_card_id")
    private GraphicsCardEntity graphicsCard;

    @ManyToOne
    @JoinColumn(name = "dram_id")
    private DRAMEntity dram;

    @ManyToOne
    @JoinColumn(name = "cooler_id")
    private PCCoolerEntity cooler;

    @ManyToOne
    @JoinColumn(name = "psu_id")
    private PowerSupplyEntity psu;

    @ManyToOne
    @JoinColumn(name = "drive_id")
    private DriveEntity driveEntity;
}