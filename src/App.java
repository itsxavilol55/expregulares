import java.util.regex.*;  
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        String text = "hola mundo";
        String regex = "[Javier]";
        Pattern patron = Pattern.compile(regex);
        Matcher mat = patron.matcher(text);
        System.out.println(mat.find());
    }
}
