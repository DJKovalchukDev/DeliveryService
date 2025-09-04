DeliveryService

Учебный проект на Java. Работа с классами и объектами, моделирование службы доставки.

Реализовано:

Класс Dimensions
Хранит размеры посылки (длина, ширина, высота).
Метод cargoVolume() вычисляет объём посылки.
Методы setLength(), setWidth(), setHeight() возвращают новые экземпляры с изменёнными параметрами (иммутабельность).

Класс Goods
Хранит информацию о товаре: размеры, вес, адрес доставки, регистрационный номер, хрупкость, возможность переворачивания.
Методы для изменения веса и адреса доставки возвращают новые экземпляры.
Метод toString() выводит полное описание товара.

Класс Main
Демонстрация работы классов:
Создание объекта Dimensions и вывод его параметров.
Создание объекта Goods и печать характеристик.
Клонирование размеров и работа с изменёнными копиями.
Создание полной копии параметров.

---------------------------------

DeliveryService

Java training project. Working with classes and objects, modeling a delivery service.

Implemented features:

Dimensions class
Stores parcel dimensions (length, width, height).
Method cargoVolume() calculates the parcel volume.
Methods setLength(), setWidth(), setHeight() return new instances with updated values (immutability).

Goods class
Stores product information: dimensions, weight, delivery address, registration number, fragile flag, and flip allowance.
Methods for updating weight and delivery address return new instances.
Method toString() outputs a full description of the product.

Main class
Demonstrates the functionality:
Creating a Dimensions object and printing its parameters.
Creating a Goods object and printing details.
Cloning dimensions and working with modified copies.
Creating a full copy of the parameters.
