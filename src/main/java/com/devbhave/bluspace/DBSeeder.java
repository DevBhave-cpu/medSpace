package com.devbhave.bluspace;

import com.devbhave.bluspace.Model.*;
import com.devbhave.bluspace.Repository.*;
import com.mongodb.internal.connection.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
    private AppointmentsRepository appointmentsRepository;

    @Autowired
    public DBSeeder(AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }


    //    private PatientsRepository patientsRepository;
//    private HospitalsRepository hospitalsRepository;
//    private DoctorRepository doctorRepository;
//    private DepartmentRepository departmentRepository;
//
//    @Autowired
//    public DBSeeder(
//            PatientsRepository patientsRepository,
//            HospitalsRepository hospitalsRepository,
//            DoctorRepository doctorRepository,
//            DepartmentRepository departmentRepository) {
//        this.patientsRepository = patientsRepository;
//        this.hospitalsRepository = hospitalsRepository;
//        this.doctorRepository = doctorRepository;
//        this.departmentRepository = departmentRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        System.out.println("The application has started");
//
//        Doctor doctor1 = new Doctor(
//                "Dr. Mittal",
//                "GastroEneroLogy",
//                "HOD");
//
//        Doctor doctor2 = new Doctor(
//                "Dr. Hussain",
//                "Neurology",
//                "HOD");
//
//        Doctor doctor3 = new Doctor(
//                "Dr. Chabbra",
//                "Pulomonolgy",
//                "HOD");
//
//        Department department1 = new Department(
//                "Cardiology",
//                Arrays.asList(
//                        doctor1
//                ));
//        Department department2 = new Department(
//                "Neurology",
//                Arrays.asList(
//                        doctor2,
//                        doctor3
//                ));
//        Department department3 = new Department(
//                "Gastroenterology",
//                Arrays.asList(
//                        doctor1,
//                        doctor3
//                ));
//
//        Hospitals hospital1 = new Hospitals(
//                "Max Hospital",
//                "Vaishali, Ghaziabad",
//                "Ghaziabad",
//                99999999,
//                Arrays.asList(
//                        department1,
//                        department2,
//                        department3
//                )
//        );
//
//        Hospitals hospital2 = new Hospitals(
//                "Max Hospital",
//                "Patparganj, Delhi",
//                "Delhi",
//                99988999,
//                Arrays.asList(
//                        department1,
//                        department2,
//                        department3
//                )
//        );
//
//        Hospitals hospital3 = new Hospitals(
//                "Max Hospital",
//                "Dehradun, Uttrakhand",
//                "Dehradun",
//                99977779,
//                Arrays.asList(
//                        department1,
//                        department2,
//                        department3
//                )
//        );
//
//        Patients patient1 = new Patients("Martin Thomas",
//                "martinthomas@email.com",
//                987654323);
//
//        Patients patient2 = new Patients("Mary Thomas",
//                "marythomas@email.com",
//                987654344);
//
//        Patients patient3 = new Patients("Oggy",
//                "oggy@email.com",
//                987644344);
//
//        Patients patient4 = new Patients("Jack Sparrow",
//                "sparrowJack@email.com",
//                987654355);
//
//
//        // Drop all patients
//        this.patientsRepository.deleteAll();
//
//        // add patients to the database
//        List<Patients> patientsList = Arrays.asList(
//                patient1,
//                patient2,
//                patient3,
//                patient4);
//        this.patientsRepository.saveAll(patientsList);
//
//        // Drop all hospitals
//        this.hospitalsRepository.deleteAll();
//
//        // add our hospitals to the db
//        List<Hospitals> hospitalsList = Arrays.asList(
//                hospital1, hospital2, hospital3);
//        this.hospitalsRepository.saveAll(hospitalsList);
//
//        this.departmentRepository.deleteAll();
//
//        List<Department> departmentList = Arrays.asList(
//                department1, department2, department3
//        );
//
//        this.departmentRepository.saveAll(departmentList);
//
//        this.doctorRepository.deleteAll();
//
//        List<Doctor> doctorList = Arrays.asList(
//                doctor1, doctor2, doctor3
//        );
//
//        this.doctorRepository.saveAll(doctorList);
//    }
}


