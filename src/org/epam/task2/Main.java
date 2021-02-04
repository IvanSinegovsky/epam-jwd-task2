package org.epam.task2;

/*
Приложение, которое предоставляет информацию об товарах бытовой техники в магазине
(холодильники, чайники и др.). Информация о товарах хранится в xml-файле, каждая
категория товаров отличается от другой свойствами(enum Appliances). Напишите код,
который позволяет отыскать все чайники(searcher.outputByName('item`s name'))
и самый дешевый товар(searcher.searchTheCheapestAppliance()).
*/


public class Main {

    public static void main(String[] args) {
        Searcher searcher = new Searcher();

        searcher.theCheapestApplianceOutput();
        searcher.outputByName(Appliances.KETTLE.getApplianceNameToFile());
    }
}
