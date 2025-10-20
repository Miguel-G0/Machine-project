public class Emptytile extends Tiles{

private Boolean hasItem;
private Item item;

public Emptytile(Boolean hasItem, Item item){
    this.hasItem = hasItem;
    this.item = item;
}

public Item Collect(){
        return item;
}


public void checkItem(){
    if(hasItem == true){
        Collect();
    }
}

}