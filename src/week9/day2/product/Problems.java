package week9.day2.product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problems {
    public static void main(String[] args) {
        Product product1 = new Product(1L, "abc", "Book", 15.12);
        Product product2 = new Product(2L, "abbc", "Book", 15.12);
        Product product3 = new Product(3L, "ab", "Toy", 122.12);
        Product product4 = new Product(4L, "ac", "Baby", 121.12);
        List<Product> products = Arrays.asList(product1, product2, product3, product4);


        Order order1 = new Order(1L, "delivered", LocalDate.of(2021, 2, 2), LocalDate.of(2021, 3, 14), products, new Customer());
        Order order2 = new Order(2L, "delivered", LocalDate.of(2021, 2, 2), LocalDate.of(2021, 3, 15), products, new Customer());
        Order order3 = new Order(3L, "delivered", LocalDate.of(2021, 2, 2), LocalDate.of(2021, 4, 13), products, new Customer());
        Order order4 = new Order(4L, "delivered", LocalDate.of(2021, 1, 2), LocalDate.of(2021, 3, 15), products, new Customer());
        Order order5 = new Order(5L, "delivered", LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 14), products, new Customer());
        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);

        //System.out.println(getBooks(products));
        //System.out.println(getToysAndApplyDiscount(products));
        System.out.println(getCheapestProducts(products));
        //System.out.println(getThreeRecentOrders(orders));
        //System.out.println(getProducts(orders,LocalDate.of(2021,3,15)));
        //System.out.println(averagePayment(orders, LocalDate.of(2021, 3, 14)));
        //System.out.println(customersOrders(orders));
        //System.out.println(categoryProducts(products));
    }

    public static List<Product> getBooks(List<Product> products) {
        Predicate<Product> predicate1 = product -> product.getCategory().equals("Book");
        Predicate<Product> predicate2 = product -> product.getPrice() > 100;
        return products.stream().filter(predicate1.and(predicate2))
                .collect(Collectors.toList());
    }

    public static List<Order> getOrdersOfBabyProduct(List<Order> orders) {
        List<Order> baby = orders.stream().filter(order -> order.getProducts()
                .stream().anyMatch(product -> product.getCategory().equals("Baby")))
                .collect(Collectors.toList());
        return baby;
    }

    public static List<Product> getToysAndApplyDiscount(List<Product> products) {
        return products.stream().filter(product -> product.getCategory().equals("Toy"))
                .map(product -> product.setPrice(product.getPrice() * 0.9))
                .collect(Collectors.toList());
    }

    public static List<Product> getCheapestProducts(List<Product> products) {
        List<Product> books = products.stream()
                .filter(product -> product.getCategory()
                        .equals("Book")).collect(Collectors.toList());
        Product product = books.stream().min(new PriceComparator()).orElse(null);
        Map<Boolean, List<Product>> collect = books.stream()
                .collect(Collectors.groupingBy(book1 -> book1.getPrice().equals(product.getPrice())));
        return collect.get(true);
    }

    public static List<Order> getThreeRecentOrders(List<Order> orders) {
        return orders.stream().sorted(new DateComparator()).limit(3)
                .collect(Collectors.toList());
    }

    public static List<List<Product>> getProducts(List<Order> orders, LocalDate date) {
        List<Order> orderList = orders.stream().filter(order -> order.getDeliveryDate().
                equals(date))
                .collect(Collectors.toList());

        orderList.stream().forEach(each -> System.out.println(each));
        return orderList.stream().map(order -> order.getProducts())
                .collect(Collectors.toList());

    }

    public static Double averagePayment(List<Order> orders, LocalDate date) {
        List<List<Product>> products = getProducts(orders, date);
        Stream<Product> productStream = products.stream().flatMap(products1 -> products1.stream());
        return productStream.collect(Collectors.averagingDouble(Product::getPrice));
    }

    public static Map<Customer, List<Order>> customersOrders(List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(order -> order.getCustomer()));
    }

    public static Map<String, List<String>> categoryProducts(List<Product> products) {
        Map<String, List<String>> collect = products.stream().collect(Collectors
                .groupingBy(product -> product.getCategory(), Collectors
                        .mapping(product -> product.getName(), Collectors.toList())));
        return collect;
    }
}
