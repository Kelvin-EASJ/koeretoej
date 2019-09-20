public class Main extends Koeretoej {
    public static void main(String[] args) {

        Bil farrari = new Bil();
        farrari.hastighed = 220;
        farrari.farve = "rød";
        farrari.hjul = 4;
        farrari.saede = true;
        farrari.lys = true;
        farrari.styretoej = "Bil styretøj";
        //disse nedarves fra superclassen Koeretoej
        farrari.nummerplade = "BORN2BEW11D";
        farrari.auto_Laas = true;
        farrari.soltag = true;
        farrari.sæder = 1;
        //disse hentes fra classen Bil
        System.out.println("Farrari");

        Cykel bmx_Cykel = new Cykel();
        bmx_Cykel.hastighed = 40;
        bmx_Cykel.farve = "Grøn og Sort";
        bmx_Cykel.hjul = 2;
        bmx_Cykel.saede = true;
        bmx_Cykel.lys = true;
        //disse er nedarvet fra superclassen Koeretoej
        bmx_Cykel.cykelKlokke = true;
        bmx_Cykel.baggagebaerer = true;
        bmx_Cykel.cykelStyre = 1;
        //disse bliver hentet fra classen Cykel
        System.out.println("BMX Cykel");

        Fly boeing_Fly = new Fly();
        boeing_Fly.hastighed = 300;
        boeing_Fly.farve = "Hvid med røde og blå strejer";
        boeing_Fly.hjul = 3;
        boeing_Fly.lys = true;
        //disse er nedarvet fra superclassen Koeretoej
        boeing_Fly.antalVinduer = 24;
        boeing_Fly.cockpit = true;
        boeing_Fly.passagersaeder = 200;
        //Fly er classen som dette kommer fra

    }
}
