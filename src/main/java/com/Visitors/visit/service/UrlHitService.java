package com.Visitors.visit.service;

import com.Visitors.visit.model.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
int c=0;


    public int countHit(){return c++;}

    static Map<String, Integer> map=new HashMap<>();
    public static Visit getVisits(String username){
        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);
        Visit visit=new Visit(username,count);
        return visit;
    }
}
