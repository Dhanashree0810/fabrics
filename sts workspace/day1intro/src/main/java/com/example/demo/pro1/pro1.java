package com.example.demo.pro1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pro1 {
	@RequestMapping("\shree")
      public String hey()
      {
    	  return "heyy shree";
      }
}
