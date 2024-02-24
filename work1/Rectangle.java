package QA_HomeWork_Sem6_OOP.work1;

/**
 * Класс Rectangle представляет собой подкласс GeometricFigure и является представлением прямоугольника.
 * Здесь определена дополнительная переменная a для хранения площади прямоугольника.
 */

public class Rectangle extends GeometricFigure{

    int a; // Площадь прямоугольника

    // Метод setArea() вычисляет площадь прямоугольника на основе заданных высоты и ширины.
    public void setArea(int height, int width) {
        a = height*width;
    }

}
