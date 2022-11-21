public class Main {
    public static void main(String[] args){
        FireType dc = new FireType("DC", 100, 20);
        GrassType ally = new GrassType("Ally", 100, 20);
        WaterType claire = new WaterType("Claire", 100, 20);

        battle(dc, ally);
        battle(dc, claire);
        battle(ally, claire);
    }

    public static void battle(Monster m1, Monster m2){
        m1.resetHealth();
        m2.resetHealth();

        int counter = 0;
        while(m1.getHP() > 0 && m2.getHP() > 0){
            if(counter%2 == 0){
                m1.attack(m2);
            }
            else{
                m2.attack(m1);
            }
            counter++;
        }
    }
}
