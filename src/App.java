public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Creating a new instance of the MyRegex class and setting the text and regex variables.
        String text = "hola \"mundo me gusta\" programar";
        String regex = "\"\\w+( *\\w)*\"";
        MyRegex regex1 = new MyRegex();
        regex1.setText(text);
        regex1.setRegex(regex);
        System.out.println(regex1.Remplazar("holaaaa"));
        System.out.println(regex1.Buscar(0));
    }
}
