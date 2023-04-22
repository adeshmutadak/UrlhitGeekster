package com.geekster.hitUrl.UrlhitGeekster.dao;


import com.geekster.hitUrl.UrlhitGeekster.model.Urlmodel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Urlhitdao {

List<Urlmodel>list=new ArrayList<>();
   private  int count=0;


    public boolean add(Urlmodel username) {
    list.add(username);
   return true;

    }

    public int getHitCount() {
        return count++;
    }
}
