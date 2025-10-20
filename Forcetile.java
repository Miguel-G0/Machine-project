public class Forcetile extends Tiles{
    private String forcedirection;


public Forcetile(String forcedirection,int x, int y){
    this.forcedirection = forcedirection;
}
    public int movePlayer(){
    if(occupied == true){
        switch(forcedirection){
            case "left":
                return x - 1;
                break;
            case "right":
                return x + 1;
                break;
            case "down":
                return y - 1;
                break;
            case "up":
                return y + 1;
                break;
            default:
                return 0;
        }
    }
}
}