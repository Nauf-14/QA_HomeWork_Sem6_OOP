package QA_HomeWork_Sem6_OOP.work1;

// Квадрат так же стал наследником Фигуры и вычесление площади
// сделано так,чтобы не было проблем, т.к. в прямоугольнике задается 2 стороны,а в квадрате достаточно одной
public class Square extends Rectangle {

    int a;
    public void setArea(int height, int width) {
        a = height*width;
        
    }
}