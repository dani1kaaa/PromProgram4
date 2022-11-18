package edk6_lab4;

public class Animals {

    private Integer id;
    private Classifications classifications;
    private String temperatyre;
    private String weatherNight;

    public Animals() {
    }

    public Animals(Integer id) {
        this.id = id;
    }

    public Animals(Integer id, Classifications classifications, String name, String color) {
        this.id = id;
        this.classifications = classifications;
        this.temperatyre = name;
        this.weatherNight = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClassifications(Classifications classifications) {
        this.classifications = classifications;
    }

    public void setTemperatyre(String temperatyre) {
        this.temperatyre = temperatyre;
    }

    public void setWeatherNight(String weatherNight) {
        this.weatherNight = weatherNight;
    }

    public Classifications getClassifications() {
        return classifications;
    }

    public String getTemperatyre() {
        return temperatyre;
    }

    public String getWeatherNight() {
        return weatherNight;
    }

    public String toString() {
        return "CityID=" + id + ", " + classifications + ", temperatyreNight=" + temperatyre + ", weatherNight=" + weatherNight;
    }

}
