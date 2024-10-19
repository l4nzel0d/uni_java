package bikeproject;

public interface BikeParts {
    String make = "Oracle Cycles";

    void printDescription();
    String getHandleBars();
    String getFrame();
    String getTyres();
    String getSeatType();
    String getMake();
    int getNumGears();

    void setHandleBars(String newValue);
    void setFrame(String newValue);
    void setTyres(String newValue);
    void setSeatType(String newValue);
    void setNumGears(int newValue);
}
