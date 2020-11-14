package pl.pjatk.restservice;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.*;
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    //just for Git training comm

    private GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public ResponseEntity<List<Greeting>>findAllGreets(){
        return ResponseEntity.ok(greetingService.findAllGreets());
    }

}
