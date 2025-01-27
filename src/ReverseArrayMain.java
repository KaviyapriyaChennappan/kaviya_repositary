public class ReverseArrayMain {
    public static void main(String[] args) {
        int[] tmp;
        ReverseArray r = new ReverseArray();
       tmp= r.input();
       tmp= r.reverse(tmp);
       r.output(tmp);
    }
}
