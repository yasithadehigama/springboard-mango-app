package com.mango.app.usermanagement;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/user/management")
public class UserManagementController {

    @RequestMapping(value = "/login")
    public String userLogin() {
        //Need to write Service Class in future implementation
        return "success";
    }
}
