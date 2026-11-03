package com.example;

import java.util.Comparator;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List <Product> products = ProductRepository.getFakeProducts();
        
        System.out.println("по возврастанию" );
        products.stream()
                
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);
        
        System.out.println("\n без описания");
        products.stream()
                .filter(p -> p.getDescription() == null || p.getDescription().trim().isEmpty())
                // .trim().isEmpty() отловит и пустые строки "", и строки из одних пробелов "   "
                .forEach(System.out::println);

        System.out.println("\n рейтинг >4");
        products.stream()
                .filter(p -> p.getRating() > 4.0)
                .forEach(System.out::println);
    }
}