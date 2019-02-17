package com.abs.dazboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("app/v1/")
public class ShipwreckController {
  @RequestMapping(value="shipwrecks", method=RequestMethod.GET)
  public List<Shipwreck> list() {
      return ShipwreclStub.list();
  }
  
}