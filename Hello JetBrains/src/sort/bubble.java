package sort;

public class bubble {
    public static void Main (String[] args) {
        int[] list= new int[]{3,24,15,6,67,54,11};
        System.out.print(list);

        int tmp;
        for(int i=0; i<list.length; i++){
            if(list[i]>list[i+1]){
                tmp=list[i+1];
                list[i]=tmp;
                list[i+1]=list[i];
            }
        }
        System.out.print(list);
    }
}
