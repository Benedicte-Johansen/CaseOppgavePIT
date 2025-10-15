package com.example.hentepolitibiler;

public class Bil {
    int id;
    String merke;
    String modell;
    int årsmodell;
    String regNr;
    String status;
    String oppdrag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOppdrag() {
        return oppdrag;
    }

    public void setOppdrag(String oppdrag) {
        this.oppdrag = oppdrag;
    }
}
