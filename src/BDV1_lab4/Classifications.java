package edk6_lab4;

public class Classifications {
    
    private Integer id;
    private String animal_class;
    private String squad;
    private String family;

    public Classifications() {
    }

    public Classifications(String animal_class, String squad, String family) {
        this.animal_class = animal_class;
        this.squad = squad;
        this.family = family;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAnimal_class(String animal_class) {
        this.animal_class = animal_class;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAnimal_class() {
        return animal_class;
    }

    public String getSquad() {
        return squad;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "WeatherTable{" + "id=" + id + ", City=" + animal_class + ", region=" + squad + ",weather=" + family + '}';
    }
}
