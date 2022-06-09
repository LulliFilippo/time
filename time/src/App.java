public class App {
    public static void main(String[] args) throws Exception {
        Time t1 = new Time(10, 24, 12);
        Time t2 = new Time(95673);

        System.out.println(t1.toString());
        System.out.println(t1.convertiSecondi());


        t2.addSecondi(247);
        t2.normalize();
        System.out.println(t2.toString());
    }
}
