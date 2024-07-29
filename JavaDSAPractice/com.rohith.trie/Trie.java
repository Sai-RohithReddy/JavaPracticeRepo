public class Trie {
    TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    }
    public int getIndex(char letter) {
        return letter - 'a';
    }
    public void insert(String word) {
        TrieNode cur = this.root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = getIndex(c);
            if (cur.children[idx] == null) {
                TrieNode node = new TrieNode();
                cur.children[idx] = node;
                cur = node;
            } else {
                cur = cur.children[idx];
            }
        }
        cur.isWord = true;
    }
}
