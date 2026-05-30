public class Conversor {

    public double kmParaMetros(double km) {
        double m = km * 1000;
        return m;
    }

    public double metroParaKm(double m){
        double km = kmParaMetros(m);
        return km;
    }
}
