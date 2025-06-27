package org.rawanaswad.prosebuilder;

//import com.example.Sentence;
import java.util.ArrayList;
import java.util.List;

import org.rawanaswad.SimpleProse.Sentence;

public class ProseBuilder {
    private final List<Sentence> sentences = new ArrayList<>();

    public void register(Sentence sentence) {
        sentences.add(sentence);
    }
    public String get() {
    return sentences.stream()
        .map(sentence -> String.join(" ", sentence.getWords()))
        .reduce((a, b) -> a + " " + b)
        .orElse("");
}
}