public class NumarComplex {
    private double parteIntreaga;
    private double parteImaginara;

    public NumarComplex(double parteIntreaga, double parteImaginara) {
        this.parteIntreaga = parteIntreaga;
        this.parteImaginara = parteImaginara;
    }

    public String toString(){
        return parteIntreaga+" + "+parteImaginara+"i";
    }

    public NumarComplex sum(NumarComplex n){
        double rezParteIntreaga;
        double rezParteImaginara;
        rezParteIntreaga = parteIntreaga+n.parteIntreaga;
        rezParteImaginara=parteImaginara+n.parteImaginara;
        return new NumarComplex(rezParteIntreaga,rezParteImaginara);
    }
    public NumarComplex substract(NumarComplex n){
        return new NumarComplex(parteIntreaga-n.parteIntreaga,parteImaginara-n.parteImaginara);
    }

    public boolean isReal(){
        return parteImaginara == 0;
    }
}
