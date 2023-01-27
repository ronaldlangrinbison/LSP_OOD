package org.howard.edu.hw2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) throws IOException {
        // Get the file path
        String filePath = WordCounter.class.getClassLoader().getResource("resources/words.txt").getPath();
        
        // Create a map to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();
        
        // Read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" ");
                
                // Iterate through the words
                for (String word : words) {
                    // Remove any punctuation from the word
                    word = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                    
                    // Check if the word is already in the map
                    if (wordCounts.containsKey(word)) {
                        // If it is, increment the count
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    } else {
                        // If it isn't, add it to the map with a count of 1
                        wordCounts.put(word, 1);
                    }
                }
            }
        }
        
        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
