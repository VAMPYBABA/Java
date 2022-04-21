public class countx {
    public static void move_all_x(String str, int idx, int count, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x'){
            count++;
            move_all_x(str, idx+1,count,newstring);
        }
        else{
            newstring += currChar;
            move_all_x(str, idx+1,count,newstring);
        }
    }
    public static void main (String args[]){
        String str = "axbccxxd";
        move_all_x(str, 0, 0, "");
    }
}
