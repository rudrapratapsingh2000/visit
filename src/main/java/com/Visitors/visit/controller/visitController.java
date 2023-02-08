package com.Visitors.visit.controller;

import com.Visitors.visit.model.Visit;
import com.Visitors.visit.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class visitController {
    @Autowired
    public UrlHitService urlHitService;
    public visitController(UrlHitService urlHitService){
        this.urlHitService=urlHitService;
    }
    @GetMapping("/count")
    public int getHitCount() {
return urlHitService.countHit();
    }




    //http://localhost:8080/api/v1/visitor-count-app/username/{yourusername}/count
    @GetMapping("/username/{username}/count")
    public Visit getHitCount(@PathVariable String username){
        Visit visit=UrlHitService.getVisits(username);
        return  visit;
    }
}
