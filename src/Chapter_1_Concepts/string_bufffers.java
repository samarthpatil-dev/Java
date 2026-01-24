package Chapter_1_Concepts;

public class string_bufffers {
    public static void main(String[] args) {
        String name = "samarth";
        StringBuffer sb = new StringBuffer(name);
        sb.append("syco");
        sb.insert(0,'q');
        System.out.println(sb);
        sb.replace(0,1,"s");
        System.out.println(sb);
    }
}
