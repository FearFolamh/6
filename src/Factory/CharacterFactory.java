package Factory;

class CharacterFactory {
    public Character createCharacter(String type) {
        if (type.equalsIgnoreCase("warrior")) {
            return new Warrior();
        } else if (type.equalsIgnoreCase("mage")) {
            return new Mage();
        } else {
            throw new IllegalArgumentException("Unknown character type: " + type);
        }
    }
}
