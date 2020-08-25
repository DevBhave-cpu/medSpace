package com.devbhave.bluspace.Repository;

import com.devbhave.bluspace.Model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String> {

}
