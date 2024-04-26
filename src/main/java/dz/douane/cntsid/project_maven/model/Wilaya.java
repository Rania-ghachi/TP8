package dz.douane.cntsid.project_maven.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "wilaya")
public class Wilaya {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "actif")
    private Boolean actif;

    @Column(name = "compte_creation")
    private Integer compteCreation;

    @Column(name = "compte_maj")
    private Integer compteMaj;

    @Column(name = "date_creation")
    private LocalDateTime dateCreation;

    @Column(name = "date_maj")
    private LocalDateTime dateMaj;

    @Column(name = "nom_arabe")
    private String nomArabe;

    @Column(name = "nom_latin")
    private String nomLatin;

    @Column(name = "nom_tamazight")
    private String nomTamazight;

    // Add constructors, getters, and setters

    // Optionally, you can add additional methods, relationships, or annotations as needed
}

