public class Firetile extends Tiles{


public boolean killPlayer(){
    if(occupied == true){
        return true;
    }else{
        return false;
    }
}

public void step(){
   
    if(!Chip.Inventory.checkboot()){
        System.out.println("oops! Chip burned to death...");
        killPlayer();
    }


}

}