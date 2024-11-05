package com.KOT.KOTOrganization.Controller;

import com.KOT.KOTOrganization.Model.KotUser;
import com.KOT.KOTOrganization.Service.KotUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    KotUserService kotUserService;
    @PostMapping
    public KotUser createUser(@RequestBody KotUser user){
        System.out.println(user);
        return kotUserService.save(user);
    }
}
