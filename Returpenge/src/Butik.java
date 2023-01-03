public class Butik {
    public static int køb(int pris, int betalt) throws Exception{
        if (pris<0){
            throw new Exception("Pris er for lav");
        }
        if (betalt<0){
            throw new Exception("Ikke betalt");
        }
        int retur = betalt - pris;
        if (retur<0){
            throw new Exception("Ikke nok penge brors");
        }
        return retur;
    }
}
