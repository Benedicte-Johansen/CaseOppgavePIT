package com.example.hentepolitibiler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BilController {
    private final BilService bilService;
    private Integer id;

    public BilController(BilService bilService) {
        this.bilService = bilService;
    }

    @GetMapping("/hentAlleBiler")
    public void hentAlleBiler(){
       bilService.hentAlleBiler();
    }

    @GetMapping("/{id}")
    public Bil hentEnBil(@PathVariable("id") Integer id) {
        return bilService.hentBilEtterId(id);
    }

    @GetMapping("/alleTilgjengeligeBiler")
    public List<Bil> hentAlleTilgjengeligeBiler() {
        List<Bil> alleBiler = bilService.hentTilgjengeligeBiler();
        return alleBiler;
    }

    @PostMapping("/endreStatus/{id}")
    public void endreStatus(@PathVariable("id") Integer id) {
        bilService.endreStatus(id, "BANKRAN");
    }
}
