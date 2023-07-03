package org.example;


import java.util.HashMap;
import java.util.LinkedHashMap;

public class IntegraCharacterOccurrence
{
    public static HashMap findCharOccurrence(String find) {
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for(int i=0;i<find.length();i++){
            int count =1;
            if(Character.isUpperCase(find.charAt(i))){
                continue;
            }
            if(result.containsKey(String.valueOf(find.charAt(i)))){
            count = result.get(String.valueOf(find.charAt(i)))+count;
            result.put(String.valueOf(find.charAt(i)),count);
            }
            else{
                result.put(String.valueOf(find.charAt(i)),count);
            }
        }
        return result;
    }
}
