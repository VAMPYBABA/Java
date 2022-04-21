import java.util.Arrays;

public class linearsearch {

public static void main(String[] args) {
    int arr[] = {18,12,9,14,77,50};

    int check=0;
    for(int i = 0;i<arr.length;i++){
        if (arr[i]==8)
        {
           System.out.println(i);
           check++;
        }
        }
        if (check==0){
            System.out.println("Not Found");
        }
}
}


