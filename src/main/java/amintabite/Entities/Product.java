package amintabite.Entities;

import java.util.Random;
import java.util.function.Supplier;

public class Product {

    Supplier<Long> RandomIdsup = () -> {
        Random rndm = new Random();
        return rndm.nextLong(1, 100000);

    };
    // attributi
    private Long id;
    private String name;
    private String category;
    private double price;

    //costruttori

    public Product(String name, String category, double price) {

        this.id = RandomIdsup.get();
        this.name = name;
        this.category = category;
        this.price = price;

    }


    //metodi


    public Long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double v) {
        this.price = v;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;


    }

    @Override
    public String toString() {
        return "Product{" +
                "RandomIdsup=" + RandomIdsup +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}


