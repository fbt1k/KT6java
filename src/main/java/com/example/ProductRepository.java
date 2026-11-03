package com.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

 //сгенерированные 15 продуктов 

    public static List<Product> getFakeProducts() {
        List<Product> products = new ArrayList<>();

        // 1. Продукты с описанием и разным рейтингом/ценой
        products.add(new Product("Смартфон", 59990.0, "Флагман с отличной камерой", 4.8));
        products.add(new Product("Ноутбук", 84990.0, "Мощный рабочий инструмент", 4.5));
        products.add(new Product("Наушники", 12500.0, "Беспроводные с шумоподавлением", 4.2));
        products.add(new Product("Умные часы", 19990.0, "Защита от воды и трекер пульса", 3.9)); // рейтинг < 4
        products.add(new Product("Кофемашина", 34500.0, "Автоматический капучинатор", 4.7));

        // 2. Продукты БЕЗ описания (пустая строка или пробелы)
        products.add(new Product("Чайник", 2990.0, "", 4.1));
        products.add(new Product("Тостер", 3490.0, "   ", 3.8));
        products.add(new Product("Блендер", 5400.0, "", 4.6));

        // 3. Продукты БЕЗ описания (значение null — частый случай в реальной разработке)
        products.add(new Product("Микроволновка", 8900.0, null, 4.3));
        products.add(new Product("Утюг", 4200.0, null, 4.0));

        // 4. Оставшиеся товары для ровного счета (15 штук)
        products.add(new Product("Пылесос", 15600.0, "Мощное всасывание, циклонный фильтр", 4.4));
        products.add(new Product("Фен", 2100.0, "Компактный, со складной ручкой", 3.5));
        products.add(new Product("Геймпад", 4990.0, "Беспроводной для ПК и консолей", 4.9));
        products.add(new Product("Монитор", 23500.0, "27 дюймов, IPS матрица, 144 Гц", 4.6));
        products.add(new Product("Клавиатура", 6800.0, "Механическая с RGB подсветкой", 3.7));

        return products;
    }
}
