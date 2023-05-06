package araylist;

import java.util.ArrayList;

public class Room {
String name;
String position;
ArrayList<Person>listPeople;

    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.listPeople = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Person> getPeople() {
        return listPeople;
    }

    public void setPeople(ArrayList<Person> people) {
        this.listPeople = people;
    }
    public void addPerson(Person person) {
        this.listPeople.add(person);
    }
    public void removePerson(Person person) {
        this.listPeople.remove(person);
    }
}
