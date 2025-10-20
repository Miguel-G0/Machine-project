public class Inventory{

private int redKeys;
private int blueKeys;
private boolean hasFlipper;
private boolean hasFireboot;



public Inventory(){
    this.redKeys = 0;
    this.blueKeys = 0;
    this.hasFlipper = false;
    this.hasFireboot = false;
}



public void addItem(Item item){
if(item.getName().equals("redKey")){
    redKeys++;
}else if(item.getName().equals("blueKey")){
    blueKeys++;
}else if(item.getName().equals("flippers")){
    hasFlipper = true;
}else if(item.getName().equals("fire boots")){
    hasFireboot = true;
}
}

public boolean checkflipper(){
    return hasFlipper;
}

public boolean checkboot(){
    return hasFireboot;
}

public boolean checkred(){
    if(redKeys>0){
        redKeys--;
        return true;
    }
    return false;
}

public boolean checkblue(){
    if(blueKeys>0){
        blueKeys--;
        return true;
    }
    return false;
}
}