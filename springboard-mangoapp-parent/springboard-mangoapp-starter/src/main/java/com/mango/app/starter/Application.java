package com.mango.app.starter;

import com.mango.app.usermanagement.UserManagementController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(UserManagementController.class)
@SpringBootApplication
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}

