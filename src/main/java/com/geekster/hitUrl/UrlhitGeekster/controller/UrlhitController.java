package com.geekster.hitUrl.UrlhitGeekster.controller;

import com.geekster.hitUrl.UrlhitGeekster.model.Urlmodel;
import com.geekster.hitUrl.UrlhitGeekster.service.UrlhitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/visitor-count-app")

public class UrlhitController {
@Autowired
    UrlhitService urlhitService;
  @PostMapping ("/name")
    public String add(@RequestBody Urlmodel username){
      return urlhitService.add(username);
  }

  @GetMapping("Username/{username}/count")

    public Map<String,String>gethitbycounterusername(@PathVariable String username){
      return urlhitService.gethitbycounterusername(username);
  }


}
