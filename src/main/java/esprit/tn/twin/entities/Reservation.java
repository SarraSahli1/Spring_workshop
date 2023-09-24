package esprit.tn.twin.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name="idReservation")
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

}
