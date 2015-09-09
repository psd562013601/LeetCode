package no208;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    // Initialize your data structure here.
	public boolean isTail;
	public Map<Character, TrieNode> children = new HashMap<>();
	
	public TrieNode(boolean isTail) {
		this.isTail = isTail;
	}
    public TrieNode() {
    	this(false);
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
    	TrieNode curr = root;

        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if(curr.children.containsKey(c)) {
            	curr = curr.children.get(c);
                if (i == n -1) {
                    curr.isTail = true;
                }
            } else {
            	curr.children.put(c, new TrieNode(i==n-1));
            	curr = curr.children.get(c);
            }
            
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        return searchOne(word, root);
        
    }

    private boolean searchOne(String word, TrieNode node) {
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
            for (TrieNode child : node.children.values()) {
                if (searchOne(word.substring(1), child))
                    return true;
            }
            return false;
        }
    }

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		TrieNode curr = root;
		if (prefix == null || (prefix.isEmpty()))
			return curr.isTail;

		for (char c : prefix.toCharArray()) {
			if (!curr.children.containsKey(c))
				return false;
			else
				curr = curr.children.get(c);
		}
		return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");