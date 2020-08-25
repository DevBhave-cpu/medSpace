package com.devbhave.bluspace.Repository;

import com.devbhave.bluspace.Model.Patients;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientsRepository extends MongoRepository<Patients, String> {

}
