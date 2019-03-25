public class Uncharted4 implements Command {
    private int gamenum= 3;

    public int getGamenum() {
        return gamenum;
    }

    @Override
    public void execute() {
        System.out.println("Unchardet 4 starts");
    }
}
