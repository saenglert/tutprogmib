package liste;

public class ListeTester {
    public static void main(String[] args) {
        Liste x = new Liste(3);
        x.append(5);
        x.append(4);
        x.append(7);
        //x.remove();
        x.add(0);
        System.out.println(x.summ());
    }
}
