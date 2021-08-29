package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */
    public static void main(String[] args) {
        int maxNumb = 40;
        int prevNumb = 0;
        int nextNum = 1;
        System.out.print("Fibonacci of "+maxNumb+" Nums: ");

        for (int i = 1; i <= maxNumb; ++i){
            System.out.print(prevNumb+" ");
            int last = prevNumb + nextNum;
            prevNumb = nextNum;
            nextNum = last;
        }
    }




}
