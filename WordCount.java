import java.util.TreeMap;

public class WordCount {

	public static TreeMap<String, Integer> countWords(String[] words){
		
		 TreeMap<String, Integer> wordCount = new TreeMap<>();
		 for (String word : words) {
			 wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		 }
		 
		 return wordCount;
	}
	public static void main(String[] args) {
		
		String[] inputWords = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
		System.out.println(countWords(inputWords));

	}

}
