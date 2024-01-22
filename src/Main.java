public class Main {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz(){
        for(int i = 1; i < 101; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                print("\nfizzbuzz");
            }else if (i % 3 == 0){
                print("\nfizz");
            }else if (i % 5 == 0) {
                print("\nbuzz");
            } else
                print("\n" + i);
        }
    }

    public static void print(String string){
        System.out.println(string);
    }
}