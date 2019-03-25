public class SekiroShadowsDieTwice implements Command {
    private int gamenum = 2;

    public int getGamenum() {
        return gamenum;
    }

    @Override
    public void execute(){
        System.out.println("SEKIRO : Shadows die twice starts");
    }
}
