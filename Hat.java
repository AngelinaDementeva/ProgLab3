import org.omg.CORBA.StringHolder;

public class Hat extends Creature {
    class Hat implements IHat {


        public Hat() {

        }

        public Hat(String _name, int _age) {
            super(_name, _age);
            System.out.println("Головной убор - " + _name + " успешно создан");
        }

        @Override
        public int hashCode() {
            return GetAge() + GetName().hashCode();
        }
    }
}
