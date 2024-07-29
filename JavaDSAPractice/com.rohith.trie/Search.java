import java.util.*;

class TrieNodeS {
    private Map<Character, TrieNodeS> children;
    private boolean isEndOfWord; 

    public TrieNodeS() {
        children = new HashMap<>();
        isEndOfWord = false;
    }

    public Map<Character, TrieNodeS> getChildren() {
        return children;
    }

    public boolean isEndOfWord() { 
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endofWord) {
        isEndOfWord = endofWord;
    }
}

public class Search {
    private TrieNodeS root;

    public Search() {
        root = new TrieNodeS();
    }

    public void insert(String word) {
        TrieNodeS current = root;
        for (char ch : word.toCharArray()) {
            current.getChildren().putIfAbsent(ch, new TrieNodeS());
            current = current.getChildren().get(ch);
        }
        current.setEndOfWord(true);
    }

    public List<String> autoComplete(String prefix) {
        List<String> suggestions = new ArrayList<>();
        TrieNodeS node = findNode(prefix, root); 

        if (node != null) {
            collectWords(node, prefix, suggestions);
        }

        return suggestions;
    }

    private TrieNodeS findNode(String prefix, TrieNodeS current) { 
        for (char ch : prefix.toCharArray()) {
            if (!current.getChildren().containsKey(ch)) {
                return null;
            }

            current = current.getChildren().get(ch);
        }
        return current;
    }

    private void collectWords(TrieNodeS node, String currentWord, List<String> suggestions) {
        if (node.isEndOfWord()) {
            suggestions.add(currentWord);
        }

        for (char ch : node.getChildren().keySet()) {
            collectWords(node.getChildren().get(ch), currentWord + ch, suggestions);
        }
    }

    public static void main(String args[]) {
        Search trie = new Search();

        trie.insert("apple");
        trie.insert("appetizer");
        trie.insert("ape");
        trie.insert("appraisal");
        trie.insert("banana");
        trie.insert("bat");
        trie.insert("cat");
        trie.insert("dog");

        String prefix = "ap";
        List<String> suggestions = trie.autoComplete(prefix);

        System.out.println("Suggestions with auto are for prefix '" + prefix + "':");
        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }
}