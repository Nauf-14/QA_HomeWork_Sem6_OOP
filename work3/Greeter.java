package QA_HomeWork_Sem6_OOP.work3;

/**
 * Класс Greeter является наследником класса HowSey и представляет собой приветственный генератор.
 * Здесь присвоение "formality" вынесено в отдельный класс.
 */ 

public class Greeter extends HowSey{
    private String formality;

    /**
     * Метод greet() возвращает приветствие в зависимости от уровня формальности.
     *
     * @return Строка с приветствием в соответствии с уровнем формальности.
     */

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }
}