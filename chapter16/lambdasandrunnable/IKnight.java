package gr.aueb.sev.chapter16.lambdasandrunnable;

@FunctionalInterface
public interface IKnight {
    IMission[] missions = {
            new SaveThePrincessMission(),
            new KillTheDragonMission(),
            new ExploreTheDungeonMission()
    };

    void embarkOnMission(IMission iMission);
}
