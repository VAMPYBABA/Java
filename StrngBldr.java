public class Strngbldr{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sumit");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(1,'o');
        System.out.println(sb);

        //add char at index
        sb.insert(0, 'O');
        System.out.println(sb);

        //delete from string builer
        sb.delete(1, 3);
        System.out.println(sb);

        //append
        sb.append(" ");
        sb.append("A");
        sb.append("l");
        sb.append("l");
        System.out.println(sb);

        System.out.println(sb.length());

    }
}
