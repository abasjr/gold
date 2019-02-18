package com.boot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
  @RequestMapping("/")
  public String home() {
      return "Abas Jr";
  }
  
}