package StructuralPatterns.Adapter;

public class AdapterClient {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        // Client không cần biết về Adaptee, chỉ gọi phương thức request của Target
        adapter.request();
    }
}
