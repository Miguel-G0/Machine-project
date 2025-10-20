public class BarrierTile extends Tiles {

    BarrierTile(String tileName){
        super(tileName, false, false);
    }

    public Tiles getBarrierTile() {
        return this;
    }
}