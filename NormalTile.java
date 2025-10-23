public class NormalTile extends Tiles {

    private boolean hasItem;
    private Item item;
    NormalTile(String tileName, boolean hasItem){
        super(tileName, true, false);
        this.hasItem = hasItem;
    }

}
