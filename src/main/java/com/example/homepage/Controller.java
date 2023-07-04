package com.example.homepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    SirkelRepository repSirkel;

    @PostMapping("/leggTilRadius")
      public void nyRadius(@RequestBody Sirkel radius){
        repSirkel.save(radius);

    }

    double arial = Sirkel.areal(23.5);
    double omkrets = Sirkel.omkrets(23.5);
    double diameter = Sirkel.diameter(23.5);

}
