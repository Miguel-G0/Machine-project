public class Tiles {
    private String tileName;
    private boolean canWalk;
    private boolean canKill;


    public Tiles(String tileName, boolean canWalk,boolean canKill){
        this.tileName = tileName;
        this.canWalk = canWalk;
        this.canKill = canKill;
    }

    public String getTileName() {
        return tileName;
    }
    public boolean isCanWalk() {
        return canWalk;
    }
    public boolean isCanKill() {
        return canKill;
    }
}
