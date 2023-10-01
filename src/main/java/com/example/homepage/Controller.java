package com.example.homepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    KalkRepository repResultat;

    ArrayList<Kalkulering> liste = new ArrayList<>();
    private int radius;
    @PostMapping("/leggTilRadius")
      public void nyRadius(int radius){
        this.radius = radius;
    }

    @GetMapping("/hentResultat")
        public List<Kalkulering> hentRes(){


    }

}
