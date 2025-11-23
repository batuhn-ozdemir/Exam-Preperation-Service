package com.batuhanozdemir.exam_prep_service.repository;

import com.batuhanozdemir.exam_prep_service.entity.ChatEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<ChatEntity , ObjectId> {

}

