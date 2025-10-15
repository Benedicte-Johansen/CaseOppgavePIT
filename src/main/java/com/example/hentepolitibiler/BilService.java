package com.example.hentepolitibiler;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class BilService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://api.politiet.no/case/politibiler";

    public void hentAlleBiler() {
        var res = restTemplate.getForObject(apiUrl, ListeAvBiler.class);
        System.out.println(res);
    }

    public List<Bil> hentTilgjengeligeBiler(){
        List<Bil> tilgjengeligeBiler = new ArrayList<>();

        var res = restTemplate.getForObject(apiUrl, ListeAvBiler.class);

        for(Bil bil : res.biler()){
            if (bil.getStatus().equals("Tilgjengelig")){
                tilgjengeligeBiler.add(bil);
            }
        }

        tilgjengeligeBiler.sort(Comparator.comparing(Bil::getId));
        System.out.printf(tilgjengeligeBiler.toString());
        return tilgjengeligeBiler;
    }

    public Bil hentBilEtterId(Integer id){
        var res = restTemplate.getForObject(apiUrl, ListeAvBiler.class);

        for(Bil bil : res.biler()){
            if(bil.getId() == id){
                System.out.printf(bil.toString());
                return bil;
            }
        }
        return null;
    }

    public void endreStatus(Integer id, String nyttOppdrag) {
        var bil = hentBilEtterId(id);
        System.out.println(bil.toString());
        bil.setStatus("På oppdrag");
        bil.setOppdrag(nyttOppdrag);
        System.out.printf(bil.toString());
    }
}
