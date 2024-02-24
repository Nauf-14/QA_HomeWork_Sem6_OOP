package QA_HomeWork_Sem6_OOP.work3;

/**
 * Класс HowSey представляет собой базовый класс для установки уровня формальности приветствий.
 */

public class HowSey {
    @SuppressWarnings("unused")
    private String formality;

    /**
     * Метод setFormality() устанавливает уровень формальности приветствий.
     *
     * @param formality Уровень формальности (например, "formal", "casual", "intimate").
     */
    
    public void setFormality(String formality) {
        this.formality = formality;
    }
    
}
