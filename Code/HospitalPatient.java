import java.util.ArrayList;
import java.util.List;

class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " is consulting " + patient.name);
    }
}

class Patient {
    String name;
    List<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}

public class HospitalPatient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Civil Hospital");
        Doctor doctor1 = new Doctor("Dr. Prashant");
        Doctor doctor2 = new Doctor("Dr. Shivangi");
        Patient patient1 = new Patient("Rohit");
        Patient patient2 = new Patient("Neelam");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
    }
}
