package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TaskRepository extends MongoRepository<Task, ObjectId> {

    Optional<Task> findTaskByTaskId(String taskId);
}
