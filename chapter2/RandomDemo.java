package gr.aueb.sev.chapter2;

/**
 * Χρησιμοποιεί την Math.random() που
 * παράγει τυχαίους δεκαδικούς μεταξύ 0-0.9
 * δηλαδή 0<= randomNum <1 για να μας
 * δώσει τυχαίες τιμές μεταξύ 1-6, όπως
 * δηλαδή ένα ζάρι.
 */
public class RandomDemo {
    public static void main(String[] args) {
        int die= (int) (Math.random()*6)+1;
        System.out.println(die);
    }
}
