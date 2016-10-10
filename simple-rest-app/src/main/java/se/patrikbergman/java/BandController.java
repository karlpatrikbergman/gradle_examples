package se.patrikbergman.java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bands")
public class BandController {

    @RequestMapping(method = RequestMethod.GET)
    public Band getBand() {
        return new Band("Judas Priest");
    }
}
