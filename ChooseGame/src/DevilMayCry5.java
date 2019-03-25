public class DevilMayCry5 implements Command {
    private int gamenum = 1;

    public int getGamenum() {
        return gamenum;
    }

    @Override
    public void execute() {
        System.out.println("Devil May Cry 5 starts");
    }
}
