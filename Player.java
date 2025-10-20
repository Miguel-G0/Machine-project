
public class Player{
    private int ChipsCollected;
    private boolean isAlive;
    private int Ypos;
    private int Xpos;
    private InventoryManagement Inventory;


    public Player(int ChipsCollected, boolean isAlive, int StartposX, int StartposY, InventoryManagement Inventory){
        this.ChipsCollected = 0;
        this.isAlive = true;
        this.Ypos = StartposY;
        this.Xpos = StartposX;
        this.Inventory = Inventory;
    }

    public boolean getLife(){
        return this.isAlive;
    }
    public int getXpos(){
        return this.Xpos;
    }
    public int getYpos(){
        return this.Ypos;
    }
    public InventoryManagement getInventory(){
        return this.Inventory;
    }
    public void collectChip(){
        this.ChipsCollected++;
    }

    public void CollectItem(Item item){
        Inventory.addItem(item);
    }

    public void die(){
        this.isAlive = false;
    }
    public void respawn(int StartingX, int StartingY){
        this.isAlive = true;
        this.Xpos = StartingX;
        this.Ypos = StartingY;
    }

    



}
