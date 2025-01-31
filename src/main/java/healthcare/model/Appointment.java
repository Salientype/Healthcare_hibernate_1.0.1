package healthcare.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppointmentID")
    private int appointmentId;

    @Column(name = "DoctorID")
    private int doctorId;

    @Column(name = "PatientID")
    private int patientId;

    @Column(name = "AppointmentDate")
    private String appointmentDate;

    @Column(name = "Notes")
    private String notes;

    public Appointment() {
    }

    public Appointment(int appointmentId, int doctorId, int patientId, String appointmentDate, String notes) {
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.notes = notes;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getDoctorID() {
        return doctorId;
    }

    public void setDoctorID(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientID() {
        return patientId;
    }

    public void setPatientID(int patientId) {
        this.patientId = patientId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", doctorId='" + doctorId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

}
