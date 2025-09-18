package amintabite;

import amintabite.Entities.Costumer;
import amintabite.Entities.Order;
import amintabite.Entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Costumer cliente1 = new Costumer("Gianni", 2);
        Costumer cliente2 = new Costumer("Claudia", 2);
        Costumer cliente3 = new Costumer("Chris", 1);
        Costumer cliente4 = new Costumer("Jill", 2);

        Product articolo1 = new Product("Xbox series x", "Electronics", 185.99);
        Product articolo2 = new Product("Lenovo legion laptop", "Electronics", 995.99);
        Product articolo3 = new Product("Gameboy color", "Electronics", 75.99);
        Product articolo4 = new Product("Iphone 250", "Electronics", 105.99);
        Product articolo5 = new Product("iliade", "Book", 25.99);
        Product articolo6 = new Product("Pandistelle", "Food", 5.99);
        Product articolo7 = new Product("Pizza", "Food", 5.99);
        Product articolo8 = new Product("Salmone", "Food", 5.99);
        Product articolo9 = new Product("Odissea", "Book", 15.99);
        Product articolo10 = new Product("The witcher", "Book", 205.99);
        Product articolo11 = new Product("Narnia ", "Book", 75.99);
        Product articolo12 = new Product("Harry potter", "Book", 199.99);
        Product articolo13 = new Product("Pannolini", "Baby", 5.99);
        Product articolo14 = new Product("Pijiama", "Baby", 7.99);
        Product articolo15 = new Product("backpack", "Boy", 49.99);
        Product articolo16 = new Product("shoes", "Boy", 25.99);
        Product articolo17 = new Product("socks", "Boy", 3.99);


        List<Product> Ordine1 = new ArrayList<>();

        Ordine1.add(articolo15);
        Ordine1.add(articolo17);
        Ordine1.add(articolo16);


        List<Product> Ordine2 = new ArrayList<>();

        Ordine2.add(articolo1);
        Ordine2.add(articolo2);
        Ordine2.add(articolo3);


        List<Product> Ordine3 = new ArrayList<>();

        Ordine3.add(articolo13);


        List<Product> Ordine4 = new ArrayList<>();

        Ordine4.add(articolo14);


        List<Product> Listaprodotti = new ArrayList<>();


        Order ordine1 = new Order("Done", LocalDate.of(2021, 01, 22), LocalDate.of(2021, 01, 25),
                Ordine1, cliente3);


        Order ordine2 = new Order("Done", LocalDate.of(2021, 01, 22), LocalDate.of(2021, 01, 25),
                Ordine2, cliente4);


        Order ordine3 = new Order("Done", LocalDate.of(2021, 01, 22), LocalDate.of(2021, 01, 25),
                Ordine3, cliente4);


        Order ordine4 = new Order("Done", LocalDate.of(2021, 01, 22), LocalDate.of(2021, 01, 25),
                Ordine4, cliente4);


        Listaprodotti.add(articolo1);
        Listaprodotti.add(articolo2);
        Listaprodotti.add(articolo3);
        Listaprodotti.add(articolo4);
        Listaprodotti.add(articolo5);
        Listaprodotti.add(articolo6);
        Listaprodotti.add(articolo7);
        Listaprodotti.add(articolo8);
        Listaprodotti.add(articolo9);
        Listaprodotti.add(articolo10);
        Listaprodotti.add(articolo11);
        Listaprodotti.add(articolo12);
        Listaprodotti.add(articolo13);
        Listaprodotti.add(articolo14);
        Listaprodotti.add(articolo15);
        Listaprodotti.add(articolo16);
        Listaprodotti.add(articolo17);


        //es1
        Listaprodotti.stream().filter(product -> product.getCategory().equals("Book") && product.getPrice() > 100);
        Listaprodotti.stream().toList();

        List<Product> libriCostosi = Listaprodotti.stream()
                .filter(product -> product.getCategory().equals("Book") && product.getPrice() > 100)
                .toList();

        libriCostosi.forEach(System.out::println);
        libriCostosi.stream().toList();


        //es2


        List<Order> orderbabyproducts = new ArrayList<>();


        orderbabyproducts.add(ordine1);
        orderbabyproducts.add(ordine2);
        orderbabyproducts.add(ordine3);
        orderbabyproducts.add(ordine4);


        List<Order> ordersWithBabyProducts = orderbabyproducts.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Baby"))
                )
                .toList();

        System.out.println(ordersWithBabyProducts);


        List<Product> Prodplusboydiscount = new ArrayList<>();

        Prodplusboydiscount = Listaprodotti.stream()
                .filter(product -> product.getCategory().equals("Boy")).toList();


        Prodplusboydiscount.stream().forEach(
                product -> product.setPrice(product.getPrice() * 0.90)
        );

        System.out.println(Prodplusboydiscount);


    }


}






