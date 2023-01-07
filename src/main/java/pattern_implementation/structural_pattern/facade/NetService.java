package pattern_implementation.structural_pattern.facade;

public class NetService {
    private PcPower power;
    private NetSearching searching;
    private NetAutoConnection autoConnection;

    public NetService(PcPower power, NetSearching searching, NetAutoConnection autoConnection) {
        this.power = power;
        this.searching = searching;
        this.autoConnection = autoConnection;
    }

    public void auto(){
        power.powerOn();
        searching.connection();
        autoConnection.connection();
    }
}

