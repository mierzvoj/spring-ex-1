package pl.pjatk.restservice;

import org.springframework.stereotype.*;

import java.io.*;
import java.util.*;
@Service
public class GreetingService {



    public List<Greeting> findAllGreets(){
        List<Greeting> greetings = new ArrayList<>();

        return List.of(
                new Greeting(11111, "for u1"),
                new Greeting(11112, "for u2"),
                new Greeting(11113, "for u3"),
                new Greeting(11114, "for u4"),
                new Greeting(11115, "for u5"));

    }

}
