public class Tiles {
    private String tileName;
    private boolean canWalk;
    private boolean occupied;
    private char sign;


    public char getsign(){
		return sign;
	}
	
	public void occupy(){
        occupied = true;
		sign = 'c';
    }
    public Tiles(String tileName, boolean canWalk){
        this.tileName = tileName;
        this.canWalk = canWalk;
        occupied = false;
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

