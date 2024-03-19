public class Zakaznik {
    private int radek;
    private String jmeno;
    private int pocetPismenVeJmene;

    public Zakaznik(int radek, String jmeno, int pocetPismenVeJmene) {
        this.radek = radek;
        this.jmeno = jmeno;
        this.pocetPismenVeJmene = pocetPismenVeJmene;
    }

    public int getRadek() {
        return radek;
    }

    public void setRadek(int radek) {
        this.radek = radek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetPismenVeJmene() {
        return pocetPismenVeJmene;
    }

    public void setPocetPismenVeJmene(int pocetPismenVeJmene) {
        this.pocetPismenVeJmene = pocetPismenVeJmene;
    }
}
