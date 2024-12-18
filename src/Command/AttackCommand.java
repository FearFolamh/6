package Command;

class AttackCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Player attacks the enemy.");
    }
}