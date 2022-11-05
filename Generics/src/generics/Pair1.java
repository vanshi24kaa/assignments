class Pair<K,V> {
    private K Key;
    private V Value;
    public Pair(K Key, V Value) {
        this.Key = Key;
        this.Value = Value;
    }

    public K setKey() {
        System.out.println(Key);
        return Key;
    }

    public V setValue() {
        System.out.println(Value);
        return Value;
    }
}

class Pair1
{
    public static void main(String[] args)
    {
        Pair<String, String> p = new Pair<>("Today is", "new java.util.date");
        p.setKey();
        p.setValue();
        Pair<String, Integer> q = new Pair<>("hello", 1);
        q.setKey();
        q.setValue();
    }
}
