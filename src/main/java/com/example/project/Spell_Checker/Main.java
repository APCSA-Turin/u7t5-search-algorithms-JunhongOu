package com.example.project.Spell_Checker;

public class Main{
public static void main (String[] args) {
    String word = "a";
    SpellChecker test = new SpellChecker();
    System.out.println(test.linearSpellCheck(word));
}
}