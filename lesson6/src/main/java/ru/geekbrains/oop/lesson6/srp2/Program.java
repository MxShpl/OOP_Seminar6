package ru.geekbrains.oop.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        RequestData requestData = new RequestData();
        System.out.println("Укажите параметры заказа:");
        requestData.inputFromConsole(order);
        Saving saving = new Saving();
        saving.saveToJson(order);


    }

}
