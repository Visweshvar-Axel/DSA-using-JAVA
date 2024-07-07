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

    @Override
    public String toString() {
        return "Volt{" +
                "volt=" + volt +
                '}';
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
        return modify(Socket.getVolt(),12);
    }

    @Override
    public Volt get3Volt() {
        return modify(Socket.getVolt(),3);
    }
    private Volt modify(Volt v, int val){
        v.setVolt(val);
        return v;
    }
}
// Socket -> 120 SocketAdapterImpl -> (120,12,3)
public class AdapterExample {
    public static void main(String[] args) {
        SocketAdapterImpl socketAdapter = new SocketAdapterImpl();
        System.out.println(socketAdapter.get120Volt());
        System.out.println(socketAdapter.get12Volt());
        System.out.println(socketAdapter.get3Volt());
    }
}
