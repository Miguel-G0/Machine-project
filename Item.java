public class Item{
    private String name;
    private char symbol;

    public Item(String name){
        this.name=name;
        switch(name){
            case "redKey":
                symbol = 'R';
                break;
            case "blueKey":
                symbol = 'B';
                break;
            case "flippers":
                symbol = 'F';
                break;
            case "fire boots":
                symbol = 'B';
                break;
        }
    }


    public String getName(){
        return name;
    }

    public char getSymbol(){
        return symbol;
    }
}