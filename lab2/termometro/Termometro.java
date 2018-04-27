import java.util.Random;

public class Termometro {

    private int temperatura=0;



    void inicio ()
    {
        temperatura=(int) ((Math.random()*10)+1);

    }
    int tomartemperatura()
    {
        temperatura= new Random().nextInt((40-35)+1)+35;
        return temperatura;
    }


    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = this.temperatura+temperatura;
    }


}
