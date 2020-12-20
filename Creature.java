public abstract class Creature implements ICreature {

    private String name;
    private int age;

    public Creature(){

    }

    public Creature (String _name){
        name = _name;

    }

    public Creature (String _name, int _age){
        name = _name;
        age = _age;
    }

    public String GetName(){
        return name;
    }

    public int GetAge() {
        return age;
    }

    public void SetAge(int _age) {
        age = _age;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void delSkill(Skill skill){ skills.remove(skill);}

    public boolean addSkill(Skill skill){
        if (skills.add(skill)){
            System.out.println("Объекту - \"" + this.GetName() + "\" успешно присвоено умение " + skill.getName()
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
