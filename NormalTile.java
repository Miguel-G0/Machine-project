public class NormalTile extends Tiles {

    private boolean hasItem;
    NormalTile(String tileName, boolean hasItem){
        super(tileName, true, false);
        this.hasItem = hasItem;
    }
}