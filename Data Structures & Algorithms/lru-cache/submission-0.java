public class Node {
    int key, val;
    Node prev, next;
     public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class LRUCache {
    int c;
    HashMap<Integer, Node> cache;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.c = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        left.next = right;
        right.prev = left;
    }
    
    private void rmove(Node n) {
        Node p = n.prev;
        Node nx = n.next;
        p.next = nx;
        nx.prev = p;
    }
    private void add(Node n) {
        Node p = right.prev;
        p.next = n;
        n.prev = p;
        n.next = right;
        right.prev = n;
    }
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node n = cache.get(key);
            //remove this node and add at head
            rmove(n);
            add(n);
            return n.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
         if (cache.containsKey(key)) {
            rmove(cache.get(key));
         }
        Node nw = new Node(key, value);
        cache.put(key, nw);
        add(nw);

        if(cache.size() > c) {//remove first
            Node tmp = left.next;
            rmove(tmp);
            cache.remove(tmp.key);
        }
    }
}
