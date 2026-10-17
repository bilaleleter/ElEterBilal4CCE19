package tn.esprit.eleterbilal4cce19.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;
    LocalDate dateSignature;
    BigDecimal montantTotal;
    boolean valide ;
    @OneToOne (mappedBy = "contrat")
    Reservation reservation;
    @OneToMany (mappedBy = "contrat", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    List<Paiement> paiements;
}
