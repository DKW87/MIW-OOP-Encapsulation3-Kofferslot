package Controller;

import Model.Kofferslot;

public class KofferslotMainLauncher {

    public static void main(String[] args) {

        Kofferslot goudenKoffer = new Kofferslot('Z','Z',9);
        for (int i = 0; i < 6760; i++) {

            if (i % 10 == 0 && i > 0) {
                System.out.println(" ");
            }

            goudenKoffer.volgende();

        }


    }

}
