package com.example.taskmanager.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection="tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    private ObjectId id;
    private String taskId;
    private TaskStatus status;
    private LocalDate dateOfCreation;
    private LocalDate dueDate;
    private String author;
    private String title;
    private String description;
    private TaskPriority priority;

}
