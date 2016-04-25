public class Aufgabe05 {
    public static void main(String[] args) {

        Circle a = new Circle(1);
        Circle b = new Circle(341.435234);
        Circle c = new Circle();

        System.out.println(a.surface());
        System.out.println(b.surface());
        System.out.println(c.surface());
        System.out.println(a == c);


        /*Human.scream();

        Human human = new Human();
        Human human2 = new Human();
        human.gender = true;
        human2.gender = false;
        System.out.println(human.hasPeriod());
        System.out.println(human2.hasPeriod());
        human.printHeads();
        human2.printHeads();
        //System.out.println(human.legs);
        //System.out.println(human2.legs);


        Human.head = 2;
        human.printHeads();
        human2.printHeads();
        //human.legs = 4;

        //System.out.println(human.legs);
        //System.out.println(human2.legs);
        */
    }
}
