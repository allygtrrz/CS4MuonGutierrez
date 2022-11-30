public class FireType extends Monster{
    public FireType(String name, int hp, int base){
        super(name, "fire", "grass", "water", hp, base);
        atk *= 1.3;
        def *= 0.7;
    }

    @Override
    public void special(){
        atk += 2;
        hp -= maxHP*0.1;
    }
}