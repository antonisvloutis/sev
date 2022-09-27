package gr.aueb.sev.chapter10;

public class StarsWithMethod {
    public static void main(String[] args) {

    }
    public static void printStarsH(int n){
        for (int i =1; i <= n;i++){
            System.out.print("*");
        }
    }

    /**
     * Print nXm stars.
     *
     * @param n lines to print
     * @param m stars per each line
     */
    public static void printStarsHV(int n, int m){
        for(int i = 1;i <= n; i++){
            printStarsH(m);
            System.out.println();
        }
    }
}
