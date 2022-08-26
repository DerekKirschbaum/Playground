public class Riddle {
    public static void main(String[] args){
        //double num = 3.0;
        //double num = -3.0;
        double num = 5.5;
        //int num = 23;
        //int num = 4;
        //int num = 6;
        int newNum = (int) num;
        System.out.println(newNum);
        newNum *= 2;
        System.out.println(newNum);
        newNum += 6;
        System.out.println(newNum);
        newNum /= 2;
        System.out.println(newNum);
        newNum -= (int) num;
        System.out.println(newNum);
    }
}
