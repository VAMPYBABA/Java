import javax.swing.event.AncestorEvent;

public class minofarray {
    public static void main(String[] args) {
        int arr[] = {2,4,123,7,874,-5,-415,-55};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
            min = arr[i];
            System.out.println(min);
        }
    }
}
