package kadai2;

public class Hero extends Character {
String name;
    public void attack(Matango m) {
        System.out.println("ミナトの攻撃！");
        System.out.println("敵に10のダメージを与えた！");
        m.hp -= 10;
    }
    public void run(){
        System.out.println("ミナトは逃げ出した！");
    }
}