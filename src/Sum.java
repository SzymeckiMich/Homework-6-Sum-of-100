public class Sum {
    public static void main(String[] args) {
        int sum =0;
        for(int i=0; i<=100; i++,i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of all even numbers from 0 to 100 = " + sum);
    }
}
