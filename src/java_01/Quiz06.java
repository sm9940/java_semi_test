package java_01;

public class Quiz06 {
    public static void main(String[] args) {
        int totalscore = 0;
        int[] scores = {83,90,87};
        for(int score:scores){
           totalscore+=score;
        }
        double avg = totalscore/scores.length;
        System.out.println(totalscore);
        System.out.println(avg);
    }
}
