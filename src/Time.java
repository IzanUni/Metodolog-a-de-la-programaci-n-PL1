
public class Time {
    // Zona de Atributos (Datos)
    private int hour; // Horas del tiempo
    private int minute; // Minutos del tiempo
    private int second; // Segundos del tiempo

    // Zona de Metodos (Constructores)
    public Time (int hour,int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Error, la hora que has  introducido no es valida");
        }
    }

    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        } else {
            System.out.println("Error, los minutos que has introducido no son validos");
        }
    }
    public void setSecond(int second){
        if (second >= 0 && second <= 59){
            this.second = second;
        } else {
            System.out.println("Error, los minutos que has introducido no son validos");
        }
    }
    public void setTime(int hour,int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString(){
        return getHour()+":"+getMinute()+":"+getSecond();
    }

    public Time nextSecond(){
        return new Time(getHour(),getMinute(),getSecond() + 1);
    }

    public Time previousSecond(){
        return new Time(getHour(),getMinute(),getSecond() - 1);
    }

}
