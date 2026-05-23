class TimeMap {

    private HashMap<String,List<Pair<Integer,String>>> keystore;

    public TimeMap() {
        keystore=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        keystore.computeIfAbsent(key,k -> new ArrayList<>()).add(new Pair<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {

        List<Pair<Integer,String>> values=keystore.getOrDefault(key,new ArrayList<>());
        if(values.size()==0){
            return "";
        }
        int s=0;
        int e=values.size()-1;
        String ans="";

        while(s<=e){
            int m=s+(e-s)/2;
            if(values.get(m).getKey()<=timestamp){
                ans=values.get(m).getValue();
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return ans;
        
    }

    public static class Pair<K,V>{
        private K key;
        private V value;

        public Pair(K key,V value){
            this.key=key;
            this.value=value;
        }

        public K getKey(){
            return this.key;
        }

        public V getValue(){
            return this.value;
        }

    }
}
