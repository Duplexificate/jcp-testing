package src;

class genericworld<T, V> {
    
    private T obj1;
    private V obj2;

    genericworld(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
