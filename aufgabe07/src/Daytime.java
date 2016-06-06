public class Daytime {
    private int hours;
    int minutes;
    int seconds;
            /// -249, 81, 68
    Daytime(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    Daytime(int hours, int minutes) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(0);
    }

    public void setHours(int hours) {
        if (hours >= 0) this.hours = hours;
        else this.hours = 0;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0) {
            if (minutes < 60) this.minutes = minutes % 24;
            else {
                this.hours += minutes / 60;
                this.minutes = minutes % 60;
            }
        } else  this.minutes = 0;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0) {
            if (seconds < 60) this.seconds = seconds;
            else {
                this.minutes += seconds / 60;
                this.seconds = seconds % 60;
            }
        } else  this.seconds = 0;
    }

    public int getHours() {
        return this.hours;
    }
}
