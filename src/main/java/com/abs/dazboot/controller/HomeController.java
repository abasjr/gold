package com.abs.dazboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HomeController{

  @RequestMapping("/")
  public String home() {
      return  "Test Abas";
  }
  
}