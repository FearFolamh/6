package Factory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // Создание воина
        Character warrior = factory.createCharacter("warrior");
        warrior.attack();

        // Создание мага
        Character mage = factory.createCharacter("mage");
        mage.attack();
    }
}

