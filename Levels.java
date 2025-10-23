import java.util.*;

public class Levels{

private Tile[][] Map;
private Player Chip;
private int CollectChips;
private boolean Complete;
private int XArea;
private int YArea;

public Levels(int Xarea, int Yarea, int CollectChips){
    this.XArea = Xarea;
    this.YArea = Yarea;
    this.CollectChips = CollectChips;
    this.Complete = false;
    this.Map = new Tile[Xarea][Yarea];
    CreateMap():
}

private void CreateMap(){
    private int i;
    for(i=0; i<YArea; i++){
        ArrayList<Tiles> X = new ArrayList<Tiles>();
        for(j=0; j<YArea; j++){
            Y.add(new Tiles());
        }
        map.add(X)
    }
}


public boolean Movement(String WASD){
    int X = 0;
    int Y = 0;
    switch(WASD){
        case "W":
            Y = -1;
            break;
        case "w":
            Y = -1;
            break;
        case "S":
            Y = 1;
            break;
        case "s":
            Y = 1;
            break;
        case "A":
            X = -1;
            break;
        case "a":
            X = -1;
            break;
        case "D":
            X = 1;
            break;
        case "D":
            X = 1;
            break;
        default:
            return false;
    }

}


}

