public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        performActions("Knight", knight);

        Character wizard = new Character(new Wizard());
        performActions("Wizard", wizard);

        Character archer = new Character(new Archer());
        performActions("Archer", archer);
    }
    private static void performActions(String characterType, Character character) {
        System.out.println("Actions for " + characterType + ":");
        character.attack();
        character.defend();
        System.out.println();
    }
}
