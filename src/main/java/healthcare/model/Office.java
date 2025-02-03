package healthcare.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Offices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OfficeID")
    private int officeId;

    @Column(name = "Location")
    private String location;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "DoctorID")
    private Doctor doctor;
}
