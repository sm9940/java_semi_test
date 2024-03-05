package java_02;

public class Quiz04 {

    long add(int a, int b) { return a+b;}

// long add(int x, int y) { return x+y;} 매개변수의 타입도 같고 순서도 같기때문에 에러가 난다.

 long add(long a, long b) { return a+b;}
 int add(byte a, byte b) { return a+b;}
int add(long a, int b) { return (int)(a+b);}
}
