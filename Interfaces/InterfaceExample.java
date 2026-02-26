class Phone{
    public void call(){
        System.out.println("Phone calling");
    }
    public void sms(){
        System.out.println("Phone SMSsing");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void pause();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    public void videoCall(){System.out.println("SmartPhone is Video calling");}
    public void click(){System.out.println("SmartPhone is Clicking");}
    public void record(){System.out.println("SmartPhone is recording");}
    public void play(){System.out.println("SmartPhone is playing music");}
    public void pause(){System.out.println("SmartPhone stoped music");}

}

public class INterfaceExample {
    public static void main(String[] main){
        SmartPhone s = new SmartPhone();
        // s.videoCall();
        // s.call();
        // s.sms();
        // s.click();
        // s.record();
        // s.play();
        // s.pause();

        Phone sp = new SmartPhone();
        sp.call();
        sp.sms();

        ICamera c = new SmartPhone();
        c.click();
        c.record();

        IMusicPlayer m = new SmartPhone();
        m.play();
        m.pause();
    }
    
}
