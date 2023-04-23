import CreationalDesignPatterns.Builder.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder().setProductName("Head First Java: A Brain-Friendly Guide")
                                               .setProductDescription("O'Reilly Media, Inc, USA").setPrice(100.0).build();


        System.out.println(product);
    }
}