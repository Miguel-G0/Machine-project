public class Item{
    private String itemName;
    private String Symbol;

    public Item(String itemName){
        this.itemName=itemName;
        switch(itemName){
            case "RedKey":
                Symbol = "RK";
                break;
            case "BlueKey":
                Symbol = "BK";
                break;
            case "Flippers":
                Symbol = "F";
                break;
            case "FireBoots":
                Symbol = "FB";
                break;
        }
    }
    public String getName(){
        return itemName;
    }

    public String getSymbol(){
        return Symbol;
    }
}