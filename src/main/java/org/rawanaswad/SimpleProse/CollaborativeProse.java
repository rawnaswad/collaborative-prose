package org.rawanaswad.SimpleProse;

import java.util.Arrays;
import java.util.List;

public class CollaborativeProse {
    public static void main(String[] args) {
        Sentence s1 = new SimpleSentence("Hello from Rawan");
        Sentence s2 = new SimpleSentence("World from Rawan");
        Sentence s3 = new SimpleSentence("Additional sentence from Rawan");

        List<Sentence> sentences = Arrays.asList(s1, s2, s3);
        SimpleProse prose = new SimpleProse(sentences);

        System.out.println(prose.getText());
    }
}