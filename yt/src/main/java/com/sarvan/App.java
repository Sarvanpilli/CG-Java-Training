package com.sarvan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Spring Container
        ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");

//        Customer customer = (Customer) context.getBean("cus");
//        System.out.println("Customer Name: " + customer.getName());
//        System.out.println("Customer Contact: " + customer.getContact());
//        System.out.println("Customer Address: " + customer.getAddress());

        Order order = (Order) context.getBean("ord");
        System.out.println("Product ID: " + order.getProductId());
        System.out.println("Product Name: " + order.getProductName());
        System.out.println("Customer Name:" + order.getCustomer().getName());
    }
}
