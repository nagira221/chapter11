package kadai2;

public class Wizard extends Character {
String name;
    public void attack(Matango m) {
        System.out.println("アサカの攻撃！");
        System.out.println("魔法使いは火の玉を放った！");
        System.out.println("敵に7のダメージを与えた");
        m.hp -= 7;
    }
    public void run(){
     System.out.println("アサカは逃げ出した！");
    }
}
