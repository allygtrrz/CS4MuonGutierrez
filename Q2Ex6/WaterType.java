public class WaterType extends Monster{
    public WaterType(String name, int hp, int base){
        super(name, "water", "fire", "grass", hp, base);
        atk *= 0.7;
        def *= 1.3;
    }

    @Override
    public void special(){
        def += 2;
        hp -= maxHP*0.1;
    }
}