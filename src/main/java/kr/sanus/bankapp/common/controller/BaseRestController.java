package kr.sanus.bankapp.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseRestController {

  @GetMapping("/test")
  public String test() {
    return "ok";
  }

}
