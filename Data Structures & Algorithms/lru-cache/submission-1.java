class LRUCache {

    HashMap<Integer,Node> cache;
    Node left;
    Node right;
    int cap;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.left=new Node(0,0);
        this.right=new Node(0,0);
        this.cache=new HashMap<>();
        this.left.next=right;
        this.right.prev=left;
    }
    
    public int get(int key) {

        if(cache.containsKey(key)){
            Node node=cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
            cache.remove(key); 
        }
        Node newNode=new Node(key,value);
        cache.put(key,newNode);
        
        if(cache.size()>cap){
            Node lru=this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
        insert(newNode);
        
    }

    public void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
        node.prev=null;
        node.next=null;
    }
    public void insert(Node node){
        Node prev=this.right.prev;
        prev.next=node;
        node.prev=prev;
        node.next=this.right;
        this.right.prev=node;
    }
}

class Node{
    int key;
    int val;
    Node  prev;
    Node  next;
    Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }

    
}