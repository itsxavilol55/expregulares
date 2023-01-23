import java.util.regex.*;  
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        String text = "hola \"mundo me gusta\" programar";
        String regex = "\"\\w+( *\\w)*\"";
        Pattern patron = Pattern.compile(regex);
        Matcher mat = patron.matcher(text);
        System.out.println(mat.replaceAll("te gusta"));
    }
}
