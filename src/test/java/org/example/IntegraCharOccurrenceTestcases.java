package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.LinkedHashMap;


public class IntegraCharOccurrenceTestcases
{
    @ParameterizedTest
    @ValueSource(strings = {"apple","integra connect","DAD","engineering","Technology@1122"})
    public void upperCaseShouldBeIgnoredFindCharOccurrence(String input)
    {
        LinkedHashMap<String,Integer> occurence=new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            int count =1;
            if(Character.isUpperCase(input.charAt(i))||!Character.isAlphabetic(input.charAt(i))){
                continue;
            }
            if(occurence.containsKey(String.valueOf(input.charAt(i)))){
                count = occurence.get(String.valueOf(input.charAt(i)))+count;
                occurence.put(String.valueOf(input.charAt(i)),count);
            }
            else{
                occurence.put(String.valueOf(input.charAt(i)),count);
            }
        }
        System.out.println(IntegraCharacterOccurrence.findCharOccurrence(input));
        Assert.assertEquals(occurence, IntegraCharacterOccurrence.findCharOccurrence(input));
    }

}
