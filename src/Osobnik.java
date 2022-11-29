public class Osobnik {
    private String name;
    private double stanUpojenia;
    public Osobnik(String name, double stanUpojenia){
        this.name = name;
        this.stanUpojenia = stanUpojenia;
    }

    public double getStanUpojenia() {
        return stanUpojenia;
    }

    public void setStanUpojenia(double stanUpojenia) {
        this.stanUpojenia = stanUpojenia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
