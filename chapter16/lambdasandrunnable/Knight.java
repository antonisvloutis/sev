package gr.aueb.sev.chapter16.lambdasandrunnable;

public class Knight implements IKnight, Runnable{
    private final String name;
    public Knight(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void embarkOnMission(IMission iMission)
    {
        System.out.println("Knight name: " + getName() + " mission started!");
        iMission.embark();
        iMission.setStatus(MissionStatus.STARTED);
    }

    @Override
    public void run() {
        synchronized (IKnight.missions) {
            for (IMission mission : IKnight.missions) {
                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }
    }
}
