package com.kodilla.stream.beautifier;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("something", (a) -> a.toUpperCase() ));
        System.out.println(poemBeautifier.beautify("something", (a) -> a.concat("ELSE") ));
        System.out.println(poemBeautifier.beautify("JAVA", (a) -> a.toLowerCase() ));
        System.out.println(poemBeautifier.beautify("Sth", (a) -> a.replace("t","R") ));
        System.out.println(poemBeautifier.beautify("alsa", (a) -> a.substring(0,3)));


    }


}
