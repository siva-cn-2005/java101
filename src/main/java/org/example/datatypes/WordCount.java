package org.example.datatypes;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        HashMap<String, Integer> freqMap = new HashMap<>();
        String[] words = {"@", "#", "@", "%", "#", "@"};

        for (String word : words) {
            //freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            if(freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word)+1);
            } else {
                freqMap.put(word, 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (String key : freqMap.keySet()) {
            System.out.println(key + " → " + freqMap.get(key));
        }
    }
}

