package gr.aueb.sev.chapter16.lambdasandrunnable;

public class PlayTheGame {

    public static void main(String[] args) {
        Runnable joa = new Knight("JOA");
        Runnable saintGeorge = new Knight("SAINT GEORGE");
        Runnable arthur = new Knight("ARTHUR");


        (new Thread(joa)).start();
        (new Thread(saintGeorge)).start();
        (new Thread(arthur)).start();

        /*IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

        joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess!");
            }
        });
        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Kill the dragon!");
            }
        });

       joa.embarkOnMission(() -> System.out.println("Save the princess!"));
        saintGeorge.embarkOnMission(() -> System.out.println("Kill the dragon!"));

        joa.embarkOnMission(() -> saveThePrincess());
        joa.embarkOnMission(PlayTheGame::saveThePrincess);
        saintGeorge.embarkOnMission(PlayTheGame::killTheDragon);*/
    }
    public static void saveThePrincess(){
        System.out.println("Save the princess!");
    }
    public static void killTheDragon(){
        System.out.println("Kill the dragon!");
    }
}
