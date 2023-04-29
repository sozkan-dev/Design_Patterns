import CreationalDesignPatterns.Builder.Product;
import CreationalDesignPatterns.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder().setProductName("Head First Java: A Brain-Friendly Guide")
                                               .setProductDescription("O'Reilly Media, Inc, USA").setPrice(100.0).build();


        System.out.println(product);

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton 1: "+ singleton1);
        System.out.println("Singleton 2: "+singleton2);
    }

}