package no211;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {
	private class PathNode {
		private boolean isTail;
		private Map<Character, PathNode> children = new HashMap<>();
		
		public PathNode(boolean isTail) {
			this.isTail = isTail;
		}
	}
	
	private PathNode root = new PathNode(false);

    // Adds a word into the data structure.
    public void addWord(String word) {
        PathNode curr = root;

        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if(curr.children.containsKey(c)) {
            	curr = curr.children.get(c);
                if (i == n -1) {
                    curr.isTail = true;
                }
            } else {
            	curr.children.put(c, new PathNode(i==n-1));
            	curr = curr.children.get(c);
            }
            
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return searchOne(word, root);
    }
    
    private boolean searchOne(String word, PathNode node) {
        if (word == null || (word.isEmpty()))
            return node.isTail;
        char c = word.charAt(0);
        if (c != '.') {
            if (!node.children.containsKey(c))
                return false;
            else
                return searchOne(word.substring(1), node.children.get(c));
        }
        else {
            for (PathNode child : node.children.values()) {
                if (searchOne(word.substring(1), child))
                    return true;
            }
            return false;
        }
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");