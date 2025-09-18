package amintabite.Entities;

import java.util.Random;
import java.util.function.Supplier;

public class Costumer {

    Supplier<Long> RandomIdsup = () -> {
        Random rndm = new Random();
        return rndm.nextLong(1, 100000);

    };
    //attributi
    private Long id;
    private String name;
    private Integer tier;


    //costruttori
    public Costumer(String name, Integer tier) {
        this.id = RandomIdsup.get();
        this.name = name;
        this.tier = tier;


    }

    //metodi


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;


    }

    public Integer getTier() {
        return tier;
    }
}


