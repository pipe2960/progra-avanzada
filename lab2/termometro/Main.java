public class Main {


    public static void main(String agrs[])
    {

        Termometro n= new Termometro ();
        Persona a = new Persona("Carlos");
        int temperatura1=0,temperatura2=0;


        System.out.println("T ini: "+n.getTemperatura());
                a.agitar(n);



            System.out.println(" "+a.getNombre()+ " agito y la temperatura del termometro es de: "+n.getTemperatura());
             a.tomartemperatura(n);
             temperatura1=n.tomartemperatura();
                System.out.println(" se toma la temperatura y su temperatura es de  : " +n.getTemperatura());
                a.agitar(n);
            System.out.println(" "+a.getNombre()+ " lo vuelve agitar y la temperatura del termometro es de: "+n.getTemperatura());
                a.tomartemperatura(n);
                temperatura2=n.tomartemperatura();
            System.out.println(" se vuelve a tomar la temperatura y su temperatura es de  : " +n.getTemperatura());
        System.out.println("El promedio de la temperatura es de   : " +(temperatura1+temperatura2)/2 );




    }




}
