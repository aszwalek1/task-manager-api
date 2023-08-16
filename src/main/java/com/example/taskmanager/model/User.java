package com.example.taskmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private ObjectId userId;
    private String username;
    private String email;
    private String name;
    private UserRole userRole;
    private String password;

    //password hashing
    public void setPassword(String plainPassword) {
        this.password = BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }
    public boolean verifyPassword(String enteredPassword) {
        return BCrypt.checkpw(enteredPassword, this.password);
    }



}
