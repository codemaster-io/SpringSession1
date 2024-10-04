package io.codemaster.demo.custom_annotation;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Customer customer = new Customer.CustomerBuilder()
                .name("Shakil")
                .balance(10)
                .build();
        System.out.println("customer = " + customer);

        // Process annotations to modify the original object
        Customer updatedCustomer = (Customer) AnnotationProcessor.processAnnotations(customer);

        System.out.println("updatedCustomer = " + updatedCustomer);


        Product product = new Product.ProductBuilder()
                .name("iPhone 16")
                .price(11)
                .build();

        Product updatedProduct = (Product) AnnotationProcessor.processAnnotations(product);
        System.out.println("updatedProduct = " + updatedProduct);
    }
}
