package livesession.L21;
class Volt{
    private int volt;

    public Volt(int volt) {
        this.volt = volt;
    }

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }
}
class Socket{
    public static Volt getVolt(){
        return new Volt(120);
    }
}
interface SocketAdapter{
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
class SocketAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volt() {
        return Socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v =
    }

    @Override
    public Volt get3Volt() {

    }
    private Volt modify(Volt v, int val){
        return v.setVolt();
    }
}
public class AdapterExample {
}
