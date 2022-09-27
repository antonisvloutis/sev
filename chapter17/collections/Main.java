package gr.aueb.sev.chapter17.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Athens", "London", "Paris"));
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apples",8.50D,10));
        products.add(new Product("Milk",2.20D,4));
        products.add(new Product("Honey",15D,2));

        List<Product> appleProducts = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());
        appleProducts.forEach(System.out::println);

        List<Double> priceProducts = products.stream()
                        .map(Product::getPrice)
                        .collect(Collectors.toList());
        priceProducts.forEach(System.out::println);

        List<Product> honeyProducts = products.stream()
                .filter(product -> product.getDescription().equals("Honey"))
                .map(e -> new Product(e.getDescription(),e.getPrice() + e.getPrice() * 0.1, e.getQuantity()))
                .collect(Collectors.toList());
        appleProducts.forEach(System.out::println);

        int applesCount = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .mapToInt(Product::getQuantity)
                .sum();
        appleProducts.forEach(System.out::println);

        /*products.sort(Comparator.comparing(Product::getDescription)
                .thenComparingInt(Product::getQuantity)
                .thenComparing(Product::getPrice, (a1,a2) -> Double.compare(a2,a1))
                .reversed());
        products.forEach(System.out::println);*/

        /*Collections.sort(products,Comparator.naturalOrder());
        products.forEach(System.out::println);

        Collections.sort(products,Comparator.reverseOrder());
        products.forEach(System.out::println);*/

        /*Collections.sort(products);
        products.forEach(System.out::println);

        Collections.reverse(products);
        products.forEach(System.out::println);*/

        Product myProduct = new Product("Apples",8.50D,10);

        if (products.contains(myProduct)) products.remove(0);

        products.set(1,new Product("Oranges",10D,35));

        for (int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        for (String city : cities){
            System.out.println(city);
        }

        Iterator<String> it = cities.iterator();
        while (it.hasNext()){
            String city = it.next();
            if(city.equals("Athens")) it.remove();
            System.out.println(city);
        }

        cities.forEach(System.out::println);

        cities.removeIf(s-> s.equals("London"));
    }
}
