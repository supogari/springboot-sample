package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloController {
  @RequestMapping(method=RequestMethod.GET)
  public String hello() {
      return "Hello Spring!";
  }
}

