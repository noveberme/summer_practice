package entities;

import enums.PerfomanceName;

public class Perfomance {
    private PerfomanceName name;

    public Perfomance(PerfomanceName name) {
        this.name = name;
    }

    public PerfomanceName getName() {
        return name;
    }
}
