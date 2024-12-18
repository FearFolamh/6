package Command;

public class Main {
    public static void main(String[] args) {
        PlayerController controller = new PlayerController();

        Command move = new MoveCommand();
        Command attack = new AttackCommand();
        Command defend = new DefendCommand();

        controller.setCommand(move);
        controller.executeCommand();

        controller.setCommand(attack);
        controller.executeCommand();

        controller.setCommand(defend);
        controller.executeCommand();
    }
}
