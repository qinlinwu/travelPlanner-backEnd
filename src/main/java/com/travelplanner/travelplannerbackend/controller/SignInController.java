package com.travelplanner.travelplannerbackend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SignInController {
    private final ObjectMapper objectMapper=new ObjectMapper();

  //  @RequestMapping("/login")
  //  public void login(@RequestParam(value = "error") String error, HttpServletResponse response) throws IOException {
  //      response.setStatus(HttpStatus.UNAUTHORIZED.value());
   //     Map<String, Object> data = new HashMap<>();
   //     data.put("message", "bad credentials");
  //      response.getOutputStream()
   //             .println(objectMapper.writeValueAsString(data));
   // }
}
