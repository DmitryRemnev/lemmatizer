import org.apache.lucene.morphology.LuceneMorphology;
import org.apache.lucene.morphology.russian.RussianLuceneMorphology;

import java.io.IOException;
import java.util.List;

public class Main {
    public static LuceneMorphology luceneMorph;

    public static void main(String[] args) {
        try {
            luceneMorph = new RussianLuceneMorphology();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> wordBaseForms = luceneMorph.getNormalForms("осетии");
        //List<String> wordBaseForms = luceneMorph.getMorphInfo("лес");

        wordBaseForms.forEach(System.out::println);
    }
}