package Model;

public class Kofferslot {

    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        this.setCombinatie(eersteLetter, tweedeLetter, cijfer);

    }

    public Kofferslot() {
        this('A', 'A', 0);
    }

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
        this.eersteLetter = eersteLetter;
        this.tweedeLetter = tweedeLetter;
        this.cijfer = cijfer;
    }

    public char volgendeLetter(char letter) {
        final char LETTER_A = 65;
        final char LETTER_Z = 90;

        letter++;

        if (letter > LETTER_Z) {
            letter = LETTER_A;
        }

        return letter;
    }

    public int volgendeCijfer(int cijfer) {
        final int ONDERGRENS = 0;
        final int BOVENGRENS = 9;

        cijfer++;

        if (cijfer > BOVENGRENS) {
            cijfer = ONDERGRENS;
        }

        return cijfer;
    }

    public void volgende() {
        final int BOVENGRENS = 9;
        final char LETTER_Z = 90;

        if (this.cijfer == BOVENGRENS) {

            if (this.tweedeLetter == LETTER_Z) {

                this.eersteLetter = this.volgendeLetter(this.eersteLetter);

            }

            this.tweedeLetter = this.volgendeLetter(this.tweedeLetter);

        }

        this.cijfer = this.volgendeCijfer(this.cijfer);


        System.out.printf("%s%s%d  ", this.eersteLetter, this.tweedeLetter, this.cijfer);

    }

} // Kofferslot