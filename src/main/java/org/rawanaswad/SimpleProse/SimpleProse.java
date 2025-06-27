package org.rawanaswad.SimpleProse;

//import com.example.Prose;
//import com.example.Sentence;
import java.util.List;

public class SimpleProse implements Prose {
    private final List<Sentence> sentences;

    public SimpleProse(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(String.join(" ", sentence.getWords())).append(" ");
        }
        return sb.toString().trim();
    }
}