package pattern_implementation.structural_pattern;

import pattern_implementation.structural_pattern.adapter.*;
import pattern_implementation.structural_pattern.bridge.*;
import pattern_implementation.structural_pattern.composite.*;
import pattern_implementation.structural_pattern.decorator.*;
import pattern_implementation.structural_pattern.facade.*;

public class Main {
    public static void main(String[] args) {
        //adapter
        Socket adapter = new Adapter(new TV());
        adapter.connectWithCable();
        //bridge
        Device dev = new PC(new StaticDevice());
        dev.inform();
        Device dev2 = new Phone(new PortableDevice());
        dev2.inform();
        //composite
        PcComponents comp = new CPU();
        PcComponents comp2 = new GraphicCard();
        PcComponents comp3 = new RAM();
        PcComponents comp4 = new HDD();
        PcComponents comp5 = new Motherboard();
        PcComponents comp6 = new PowerSupply();

        Composite com = new Composite();
        Composite com2 = new Composite();

        com.addComponent(comp);
        com.addComponent(comp2);
        com.addComponent(comp3);
        com.addComponent(comp6);
        com2.addComponent(comp4);
        com2.addComponent(comp5);
        com.info();
        System.out.println();
        com2.info();
        //decorator
        LocalDisk disk1 = new DiskA();
        System.out.println(disk1.getName());
        System.out.println(disk1.getSize());
        disk1 = new Games(disk1);
        System.out.println(disk1.getSize());

        //facade
        PcPower power = new PcPower();
        NetAutoConnection autoConnection = new NetAutoConnection();
        NetSearching searching = new NetSearching();

        NetService service = new NetService(power, searching, autoConnection);
        service.auto();
        power.powerOff();

    }
}
