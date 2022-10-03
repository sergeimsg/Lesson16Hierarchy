package bean;

import java.util.Objects;

public class Computer extends HomeAppliance{

    public boolean personal;
    public boolean laptop;
    public int screenSize;
    public int CPU;
    public int memorySize;

    public Computer(String placeToUseAtHome, boolean laptop, int screenSize) {
        super(placeToUseAtHome);
        this.laptop = laptop;
        this.screenSize = screenSize;
    }

    public Computer(String placeToUseAtHome, boolean personal, boolean laptop, int screenSize, int CPU, int memorySize) {
        super(placeToUseAtHome);
        this.personal = personal;
        this.laptop = laptop;
        this.screenSize = screenSize;
        this.CPU = CPU;
        this.memorySize = memorySize;
    }

    public Computer(String producer, int productionYear, double price, double powerConsumption, String placeToUseAtHome, boolean personal, boolean laptop, int screenSize, int CPU, int memorySize) {
        super(producer, productionYear, price, powerConsumption, placeToUseAtHome);
        this.personal = personal;
        this.laptop = laptop;
        this.screenSize = screenSize;
        this.CPU = CPU;
        this.memorySize = memorySize;
    }

    public boolean isPersonal() {
        return personal;
    }

    public void setPersonal(boolean personal) {
        this.personal = personal;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        if (!super.equals(o)) return false;
        Computer computer = (Computer) o;
        return isPersonal() == computer.isPersonal() && isLaptop() == computer.isLaptop() && getScreenSize() == computer.getScreenSize() && getCPU() == computer.getCPU() && getMemorySize() == computer.getMemorySize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPersonal(), isLaptop(), getScreenSize(), getCPU(), getMemorySize());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "personal=" + personal +
                ", laptop=" + laptop +
                ", screenSize=" + screenSize +
                ", CPU=" + CPU +
                ", memorySize=" + memorySize +
                '}';
    }
}
