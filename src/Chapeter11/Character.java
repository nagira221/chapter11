package Chapeter11;

public abstract class Character {
    String name;
    int hp;

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }
    public void dance() {
        System.out.println(this.name + "は情熱的に踊った");
    }

    //　戦う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に3ポイントのダメージをあたえた！");
        m.hp -= 3;
    }
}
