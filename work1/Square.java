package QA_HomeWork_Sem6_OOP.work1;

/**
 * Класс Square представляет собой подкласс Rectangle и является представлением квадрата.
 * Здесь определена дополнительная переменная a для хранения площади квадрата.
 * Переопределен метод setArea() так, чтобы для квадрата можно было задать площадь
 * с учетом только одной стороны, поскольку у квадрата все стороны равны.
 */ 

public class Square extends Rectangle {

    int a; // Площадь квадрата

    public void setArea(int height, int width) {
        a = height*width;
        
    }
}