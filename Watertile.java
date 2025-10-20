public class Watertile extends Tiles{
    public boolean killPlayer(){
    if(occupied == true){
        return true;
    }else{
        return false;
    }
}

public void step(){
   
    if(!Chip.Inventory.checkflipper()){
        System.out.println("oops! Chip burned to death...");
        killPlayer();
    }


}
}