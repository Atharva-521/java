public class slip1 {
    public static void main(String[] args){
        int size = args.length;
        for(int i = 0 ; i < size ; i++){
            int flag = 0;
            int num = Integer.parseInt(args[i]);
            for(int j = 2 ; j < num ; j++){
                if(num % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(num);
            }

        }
    }
}
