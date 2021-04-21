public class Main {
  public static void main(String[] args) {
    Monster[] monsters = new monsters[3];
    monsters[0] = Slime();
    monsters[3] = Goblin();
    monsters[2] = DeathBat();
    for (Monster m : monsters){
      m.run();
    }
  }
}
