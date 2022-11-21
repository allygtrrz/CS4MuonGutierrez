public class GrassType extends Monster{
    public GrassType(String name, int hp, int base){
        super(name, "grass", "water", "fire", hp, base);
    }

    @Override
    public void rest(){
        hp += maxHP*0.35;
        super.rest();
    }

    @Override
    public void special(){
        hp += maxHP*0.2;
    }
}