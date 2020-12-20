import java.util.ArrayList;
package com.company;

public class Main {

    public static void main(String[] args) {

        Hat thisHat = new Hat("Шляпа", 100500);

        ArrayList<Skill> skills = new ArrayList<Skill>();
        skills.add(new Skill("Встать в один ряд", null));
        skills.add(new Skill("Шаг", "Только вперед"));
        skills.add(new Skill("Тронуть за плечо", "Ну типа позвать"));
        skills.add(new Skill("Обернуться", null));
        skills.add(new Skill("Протянуть шляпу", null));

        Child Neznayka = new Child("Незнайка", skills);
        Child Miga = new Child("Мига", skills);
            //Neznayka.setSkills(skills);
            //Miga.setSkills(skills);

       Place queue = new Main.Place("Один ряд", "Нужно рясчитаться по номерам");

        Neznayka.addSkill(new Skill("Встать в ряд", null));
        Neznayka.addSkill(new Skill("Сделать шаг вперед", null));
        Neznayka.addSkill(new Skill("Обернуться", null));

        Miga.addSkill(new Skill("Тронуть за плечо", null));
        Miga.addSkill(new Skill("Протянуть шляпу", null));

    }
}
