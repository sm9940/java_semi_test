package java_02.Quiz03;

public class Marine {
    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
   static int weapon = 6; // 공격력
    static int armor = 0; // 방어력
    public static void weaponUp() {
        weapon++;
    } //공격력이 같이 올라가야되기 때문에 static을 붙였다
    static void armorUp() {
        armor++;
    } //방어력이 같이 올라가야되기 때문에
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }
}
