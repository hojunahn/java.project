package test;

public class Lotto {
    public static void main(String[] args) {
        int lotto[] = new int[6];
        int random = 0;

        for (int i = 0; i < 6; i++){
            while (true){
                random = (int)(Math.random()*45+1);

                if (random == 0){
                    continue;
                }
                for (int j = 0; j<5;j++){
                    if (random == lotto[i]);
                }
                break;
            }
            lotto[i]=random;
        }
        for(int k = 0; k<6; k++){
            System.out.print(lotto[k] + " ");
        }
    }
}
