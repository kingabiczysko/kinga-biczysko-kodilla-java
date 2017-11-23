package com.kodilla.stream.beautifier;
import java.lang.String;



public class PoemBeautifier {

    public void beautify (String text, PoemDecorator poemDecorator)
    {
        String textAfterBeatifier = poemDecorator.decorate(text);
        System.out.println("Text after beautify: " + textAfterBeatifier);
    }


}
