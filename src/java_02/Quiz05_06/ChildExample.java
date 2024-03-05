package java_02.Quiz05_06;

public class ChildExample {
    public static void main(String[] args) {
//        Parent parent = new Child();
        Child parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        parent.field2 ="data2"; //(불가능)
        parent.method3(); //불가능

        //불가능한 이유는  Parent parent = new Child()하면서 자동타입변환이 되었기때문에
        //child 클래스에 있는 필드와 메소드를 사용할수 없게된다.
    }
}
