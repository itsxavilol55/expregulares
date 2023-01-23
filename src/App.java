public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Replacing the words between quotes with the word "te gusta"
        String text = "hola \"mundo me gusta\" programar";
        String regex = "\"\\w+( *\\w)*\"";
        
        System.out.println(mat.replaceAll("te gusta"));

        MyRegex regex1 = new MyRegex();
        regex1.setText(text);
        regex1.setRegex(regex);
    }
}
