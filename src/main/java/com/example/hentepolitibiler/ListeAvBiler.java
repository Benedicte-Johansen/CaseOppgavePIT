package com.example.hentepolitibiler;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ListeAvBiler(@JsonProperty("data") List<Bil> biler) {
}
