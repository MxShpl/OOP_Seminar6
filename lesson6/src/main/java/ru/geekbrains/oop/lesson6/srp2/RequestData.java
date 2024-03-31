package ru.geekbrains.oop.lesson6.srp2;

import java.util.Scanner;

public class RequestData {
    private Scanner scanner = new Scanner(System.in);

    private String clientName;
    private String product;
    private int qnt;
    private int price;



    public void inputFromConsole(Order order){
        clientName = prompt("Имя клиента: ");
        order.setClientName(clientName);
        product = prompt("Продукт: ");
        order.setProduct(product);
        qnt = Integer.parseInt(prompt("Кол-во: "));
        order.setQnt(qnt);
        price = Integer.parseInt(prompt("Цена: "));
        order.setPrice(price);

    }


    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
