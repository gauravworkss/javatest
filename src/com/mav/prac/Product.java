package com.mav.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    static int id = 1;
    List<Customer> list = new ArrayList<>();
    public static void main(String[] args) {
        Customer c1 = new Customer(id, "test-"+id, id,"Male", "Tax", 2005, 5000d );
        Customer c2 = new Customer(id++, "test-"+id++, id++,"Male", "Tax", 2005, 5000d );
        Customer c3 = new Customer(id++, "test-"+id++, id++,"Female", "Tax", 2005, 5000d );
        Customer c4 = new Customer(id++, "test-"+id++, id++,"Male", "Tax", 2005, 5000d );
        Customer c5 = new Customer(id++, "test-"+id++, id++,"Female", "Tax", 2005, 5000d );

        Product p = new Product();
        p.list.add(c1);
        p.list.add(c2);
        p.list.add(c3);
        p.list.add(c4);
        p.list.add(c5);

        Map<String, List<Customer>> collected = p.list.stream()
                .collect(Collectors.groupingBy(Customer::gender));

        collected.forEach((gen, listdata) -> System.out.println(gen+", "+listdata.size()));
    }


}
