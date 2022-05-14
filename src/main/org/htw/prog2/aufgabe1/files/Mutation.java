package org.htw.prog2.aufgabe1.files;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mutation {
    String variant;
    HashMap<String, Double> gsScores;

    public Mutation(String variant, HashMap<String, Double> gsScores) {
        this.variant = variant;
        this.gsScores = gsScores;
    }

    public String getVariant() {
        return variant;
    }

    public HashMap<String, Double> getGSScores() {
        return gsScores;
    }

    public String getSequence(String reference) {
        return null;
    }
}
