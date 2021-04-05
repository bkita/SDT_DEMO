package computerDemo;

public class Computer {

    private String name;
    ComputerType computerType;
    int ram;
    int hdd;
    boolean state;

    public Computer(String name, ComputerType computerType, int ram, int hdd, boolean state) {
        this.name = name;
        this.computerType = computerType;
        this.ram = ram;
        this.hdd = hdd;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", computerType=" + computerType +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", state=" + state +
                '}';
    }
}
