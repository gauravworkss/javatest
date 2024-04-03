package com.mav.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class Employee {
    UUID id;
    String name;
    int sal;

    public Employee() {
        this(UUID.randomUUID(), "test-", 1000);
    }
    public Employee(UUID id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
public class Main1 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setName("ABC");
        e2.setName("ABC");
        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "first");
        map.put(e2, "second");
        System.out.println(map.size());
    }
}
