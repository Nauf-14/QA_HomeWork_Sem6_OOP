package QA_HomeWork_Sem6_OOP.work1;

// Прямоугольник переопределил как наследника от Фигуры и логика получения площади
public class Rectangle extends GeometricFigure{

    int a;
    public void setArea(int height, int width) {
        a = height*width;
    }

}
