public class server {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kaif");
        //insert function
        sb.insert(1, 'a');
        System.out.println(sb);

        //delete function
        sb.delete(2, 3);
        System.out.println(sb);

    }
}