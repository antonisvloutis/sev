package gr.aueb.sev.chapter16.lambdasandrunnable;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
