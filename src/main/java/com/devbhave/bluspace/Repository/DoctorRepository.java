package com.devbhave.bluspace.Repository;

import com.devbhave.bluspace.Model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {

}
