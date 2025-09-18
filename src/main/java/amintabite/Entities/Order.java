package amintabite.Entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Order {

    Supplier<Long> RandomIdsup = () -> {
        Random rndm = new Random();
        return rndm.nextLong(1, 100000);

    };
    private Long id;
    private String Status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Costumer customer;

    // Costruttore
    public Order(String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> prodotti, Costumer customer) {
        this.id = RandomIdsup.get();
        this.Status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = prodotti;
        this.customer = customer;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Costumer getCustomer() {
        return customer;
    }

    // Override toString per debug
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", customer=" + customer.getName() +
                ", products=" + products.size() +
                '}';
    }


}
