import java.util.ArrayList;
package com.company;
public class Place {

    private String name;

    public Place(String _name){
        name = _name;
        location = null;
        System.out.println("Место - " + name + " (" + location.getName() + ") успешно создано");
    }

    public Place(String _name){
        name = _name;
        System.out.println("Место  " + name + " успешно создано");
    }

    public String getName() {
        return name == null ? "..." : name;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public  boolean addSkill(Skill _skill){
        return skills.add(_skill);
    }

}
