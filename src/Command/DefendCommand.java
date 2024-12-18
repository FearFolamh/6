package Command;

class DefendCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Player defends against the attack.");
    }
}