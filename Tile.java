

public class Tiles{

private int x
private int y
private boolean occupied;

public Tile(int x, int y){
    this.x=x;
    this.y=y;
    this.occupied = false;
}


public void occupy(){
    this.occupied = true;
}

public void unoccupied(){
    this.occupied = false;
    }

}