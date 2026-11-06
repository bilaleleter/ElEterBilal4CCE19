package tn.esprit.eleterbilal4cce19.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idVehicule;
     String immatriculation;
     String marque;
     String modele;
     @Enumerated(EnumType.STRING)
     CategorieVehicule categorie;
     BigDecimal tarifJournalier;
     @Enumerated(EnumType.STRING)
     StatutVehicule statut ;
     @JsonIgnore
     @ManyToOne
     Agence agence;
     @JsonIgnore
     @OneToMany (mappedBy = "vehicule")
     List<Reservation> reservations;
     @JsonIgnore
     @ManyToMany
     Set<Equipement> equipements ;

}

