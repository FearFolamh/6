package Command;

class MoveCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Player moves forward.");
    }
}
