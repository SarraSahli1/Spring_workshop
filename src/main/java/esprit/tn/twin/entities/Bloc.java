package esprit.tn.twin.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="idBloc")
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
}
