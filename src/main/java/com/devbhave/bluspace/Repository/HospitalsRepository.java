package com.devbhave.bluspace.Repository;

import com.devbhave.bluspace.Model.Hospitals;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface HospitalsRepository extends MongoRepository<Hospitals, String> {

    Optional<Hospitals> findById(String id);
}
