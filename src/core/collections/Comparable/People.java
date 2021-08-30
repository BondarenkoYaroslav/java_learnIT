package core.collections.Comparable;

import java.util.Objects;

public class People implements Comparable<People> {
    private final long id;
    private final String name;
    private final String surname;

    public People(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id && Objects.equals(name, people.name) && Objects.equals(surname, people.surname);
    }

    @Override
    public int compareTo(People o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
//          natural order sort first by name and then by surname
            return this.name.compareTo(o.getName()) != 0 ?
                    this.name.compareTo(o.getName()) :
                    this.surname.compareTo(o.getSurname());
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
