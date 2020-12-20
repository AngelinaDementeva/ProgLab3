package com.company;
import java.util.ArrayList;

public class Child extends Creature {

    private ArrayList<Skill> skills = new ArrayList<Skill>();

    public Child(){
        System.out.println("Новый ребенок успешно создан");
    }


    public Child (String _name, ArrayList<Skill> _skills){
        super (_name);
        skills = _skills;
        System.out.println("Ребенок - " + _name + " " + surName + " успешно создан");
    }

    public Child (String _name, int _age){
        super (_name, _age);
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void delSkill(Skill skill){ skills.remove(skill);}

    public boolean addSkill(Skill skill){
        if (skills.add(skill)){
            System.out.println("Ребенку - \"" + this.GetName() + "\" успешно присвоено умение " + skill.getName()
                    + " (" + skill.getInfo()+ ")");
            return true;
        }
        else{
            System.out.println("При добавлении умения произошла ошибка...");
            return false;
        }
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
