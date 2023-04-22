package com.geekster.hitUrl.UrlhitGeekster.service;

import com.geekster.hitUrl.UrlhitGeekster.dao.Urlhitdao;
import com.geekster.hitUrl.UrlhitGeekster.model.Urlmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service


public class UrlhitService {
@Autowired
Urlhitdao urlhitdao;

    public String add(Urlmodel username) {

        boolean status= urlhitdao.add(username);
    if(status) {
         return "Added";
    }else {
        return "Not Added";
    }
    }
    Map<String,String>response1=new HashMap<String ,String>();
    public Map<String, String> gethitbycounterusername(String username) {
        int count1=urlhitdao.getHitCount();
        response1.put("userName",username);
        response1.put("count", String.valueOf(count1));
        return response1;
    }

}
