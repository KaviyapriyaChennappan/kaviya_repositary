public class MultioMOMain {
    public static void main(String[] args) {
        int result;
        MultiMO multimomain = new MultiMO();
        result = multimomain.multi(10,20);
        System.out.println(result);
       result = multimomain.multi(10,20,30);
        System.out.println(result);
    }
}
