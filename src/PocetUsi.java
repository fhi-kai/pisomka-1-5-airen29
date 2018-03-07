public class PocetUsi implements ZajacieUsi {
    @Override
    public int zajacieUsi(int pocetZajacov) {
        int cislo = pocetZajacov % 2;
        int pocetusi = 0;

        if (cislo == 1) {
            pocetusi = pocetZajacov * 2 ;
        } else {
            pocetusi = pocetZajacov * 2; // + zistit neparny pocet zajacov ale nestiham  :(
        }

        return pocetusi;
    }
}
