class DynamicArray {
    int[] arr;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.arr=new int[capacity];
        this.size=0;
        this.capacity=capacity;
        
    }

    public int get(int i) {
        return this.arr[i];

    }

    public void set(int i, int n) {
        this.arr[i]=n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            resize();
        }
        this.arr[this.size] = n;
        this.size++;

    }

    public int popback() {
        int re = this.arr[this.size - 1];
        this.size--;
        return re;
    }

    private void resize() {
        int temp[]=new int[2*this.arr.length];
        for(int i=0;i<this.arr.length;i++){
            temp[i]=this.arr[i];
        }
        this.arr=temp;
        this.capacity=this.capacity*2;

    }

    public int getSize() {
        return this.size;
    

    }

    public int getCapacity() {
        return this.capacity;
    }

}
