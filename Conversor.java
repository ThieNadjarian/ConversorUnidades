public class Conversor {

    // KM -> Metros
    public double kmParaMetros(double km) {
        double m = km * 1000;
        return m;
    }

    // Metros -> KM
    public double metroParaKm(double m){
        double km = m / 1000;
        return km;
    }

    // Celsius -> Farenheint
    public double celsiusParaFahr(double c){
        double fahr = c * 9 / 5  + 32;
        return fahr;
    }

    // Fahrenheit -> Celsius
    public double fahrParaCelsius(double fahr){
        double cels = (fahr - 32) * 5 / 9;
        return cels;
    }

    //
}
