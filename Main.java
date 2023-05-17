public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        Fighter fighter = new Fighter();
        Witch witch = new Witch();  

        character.move(); 
        hero.move(); 
        hero.move("north"); 
        enemy.move(); 
        enemy.move(3); 
        fighter.move(); 
        witch.move();

        Character witch1 = (Fighter) new Witch();
    }
}
