public class ArrayMinMax {
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static int MinValue(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={5,9,4,2,6};
        printArray(arr);
        int min=MinValue(arr);
        System.out.println(min);          
    }
}
