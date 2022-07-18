
<<<<<<< HEAD
class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    public boolean isIsPowerOn() {
        return this.isPowerOn;
    }

    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;


    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
    
}

public class Main {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());

    }
}


=======

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.new Inner();
        inner.method1();
        
        
    }
}
class Outer{
    int value = 10;
    class Inner {
        int value = 20;
        void method1() {
            int value = 30;
            
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    }
}
>>>>>>> cb62a787bd98a51bd4efe7eec9f4b715af7e2f5a
