public class NormalTile extends Tiles {

    private boolean hasItem;
    private Item item;
    NormalTile(String tileName, boolean hasItem, String itemName){
        super(tileName, true, false);
        this.hasItem = hasItem;
        item = new Item(itemName);
    }

}

