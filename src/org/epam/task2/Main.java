package org.epam.task2;

/*
приложение, которое предоставляет информацию об товарах бытовой техники в магазине
(холодильники, чайники и др.). Информация о товарах хранится в xml-файле, каждая
категория товаров отличается от другой свойствами. Напишите код, который позволяет
отыскать все чайники и самый дешевый товар.

Напоминание: Разделяйте код на отдельные части согласно назначению. Используйте Java Code Convention.
*/


public class Main {

    public static void main(String[] args) {

        Searcher searcher = new Searcher();

        System.out.println(searcher.searchTheCheapestAppliance());

        searcher.outputByName(Appliances.KETTLE.getApplianceNameToFile());
    }
}
