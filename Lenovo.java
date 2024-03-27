public class Lenovo implements Laptop {
    private int volume;
    private boolean is_power_on;

    public Lenovo() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is on");
        System.out.println("Lenovo ThinkPad");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is process....");

    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == 100) { // Assuming maximum volume is 100
                System.out.println("Volume is full");
            } else {
                this.volume += 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == 0) {
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isIs_power_on() {
        return is_power_on;
    }

    public void setIs_power_on(boolean is_power_on) {
        this.is_power_on = is_power_on;
    }
}
