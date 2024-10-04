package org.acme.spring.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.QueryParam;

@RestController
@RequestMapping("/unbuildable")
public class UnbuildableController {

    @PostMapping("/hello")
    public String hello(@RequestParam(required = false) @QueryParam("dung") String params) {
        return params.toString();
    }
    
}
