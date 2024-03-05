package java_01;

public class Quiz07 {
    public static void main(String[] args) {
        int[]arrays = {90,87,50,65,20};
        int min = arrays[1];
        for (int i = 0 ; i< arrays.length;i++){
            if(min>arrays[i]){min = arrays[i];}
           else {min = arrays[1];}
        }
        System.out.println(min);
        }
    }

