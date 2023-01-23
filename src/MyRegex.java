import java.util.regex.*;  
public class MyRegex 
{
    private String text;
    private String regex;
    private Pattern patron;
    private Matcher mat;
    public MyRegex() 
    {
        text = "";
        regex = "";
    }
    public void setText(String text) 
    {
        this.text = text;
        mat = patron.matcher(text);
    }
    public String getText() 
    {
        return text;
    }
    public void setRegex(String regex) 
    {
        this.regex = regex;
        patron = Pattern.compile(regex);
    }
    public String getRegex() 
    {
        return regex;
    }
}