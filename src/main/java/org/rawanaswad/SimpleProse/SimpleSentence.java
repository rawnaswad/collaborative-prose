package org.rawanaswad.SimpleProse;

import java.util.Arrays;
import java.util.List;

public class SimpleSentence implements Sentence {
    private final String content;

    public SimpleSentence(String content) {
        this.content = content;
    }

    @Override
    public List<String> getWords() {
        return Arrays.asList(content.split("\\s+"));
    }
}