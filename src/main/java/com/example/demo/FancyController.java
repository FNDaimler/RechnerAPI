package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FancyController {
    @GetMapping("/")
    public String strangefunction(){
        return "Juhu, hier ist meine erste API";
    }
    @GetMapping("/myAPI")
    public String coolfunction(@RequestParam("name")String name){
        return name+" hat diese API gebaut";

    }
    @GetMapping("/mySuperAPI")
    public String supercoolfunction(@RequestParam("name1")String name1, @RequestParam("name2")String name2){
        return name1+" hat diese API gebaut und "+name2 + " ist super!";

    }
    @GetMapping("/rechnen")
    public String rechnenfunction(@RequestParam("zahl1")int zahl1, @RequestParam("zahl2")int zahl2){
        int ergebnis=zahl1+zahl2;
            return "Das Ergebnis ist " + ergebnis;
    }
    @GetMapping("/geteilt")
    public String geteitltfunction(@RequestParam("zahl")float zahl, @RequestParam("zahl0")float zahl0) {
        if(zahl0==0){
            return "Man kann nicht durch 0 teilen!";
            }
        float ergebnis = zahl/zahl0;
        return "Das Ergebnis ist " + ergebnis;
    }
}
