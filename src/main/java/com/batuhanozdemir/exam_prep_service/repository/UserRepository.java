package com.batuhanozdemir.exam_prep_service.repository;

import com.batuhanozdemir.exam_prep_service.entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, ObjectId> {

    Users findByUserEmail(String userEmail);

}

