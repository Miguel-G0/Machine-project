
public class Player{
    
    private int Chips;
    private boolean Alive;
    private int Yaxis;
    private int Xaxis;
    private ArrayList<Items> Inventory;


    public Chip(int Chips, boolean Alive, int Yaxis, int Xaxis, ArrayList<Items> Inventory){
        this.Chips= 0;
        this.Alive = true;
        this.Yaxis = 0;
        this.Xaxis = 0;
        this.Inventory = new ArrayList<Items>();
    }

    public boolean movement(int x, int y, Levels location){
        int x = this.Xaxis + x;
        int y = this.Yaxis + y;
    }

    public void die(){
        this.Alive = false;
    }

    public class Item(){
        private String Name;
        private int Amount; 

        public Item(String Name, int Amount){
            this.Name = Name;
            this.Amount = 0
        }
        public void CollectChip(){
            this.Chips++;
        }
        public String getName(){
            return Name;
        }
        public int getAmount(){
            return Amount;
        }
        public void setAmount(int Amount){
            this.Amount = Amount;
        }
        public void addAmount(int Amount){
            this.Amount++;
        }
        public void minusAmount(int Amount){
            if(this.Amount > 0){
                this.Amount--;
            }
        }
        public void addInventory(String name){
            boolean itemExists = false;
            for(i=0; i< Inventory.size(); i++){
                Item instance = Inventory.get(i);
                if instance.getName().equals(name){
                instance.addAmount();
                itemExists = true;
                }
            }
            if(itemExists==false){
                Inventory.add(new Item(name, 1));
            }
        }
        public void removeInventory(String name){
            for(i=0; i< Inventory.size(); i++){
                Item instance = Inventory.get(i);
                if instance.getName().equals(name){
                    instance.minusAmount();
                    if(instance.getAmount()==0){
                        Inventory.remove(i);
                    }
                }
            }
        }
    }



}
