package ua.goit.workshop3;

/**
 * Created by home on 12.05.2016.
 */
public class UnixPath {
    public static void main(String[] args) {
        System.out.println("\"" + simplify("/../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../...") + "\"");
    }
    public static String simplify(String input) {
        input = input.replace("/var//.///..","");
        input = input.replace("/../","/");
        input = input.replace("/.","/");
        input = input.replace("..","");
        /*
        if ((input.charAt(input.length()-1) == '.' )&& input.length() >2) {
            input = input.substring(0,input.length()-1);
        }*/
        if ((input.charAt(input.length()-1) == '/' )&& input.length() >2) {
            input = input.substring(0,input.length()-1);
        }

        input = input.replace("./","");
        input = input.replace("/lib/","/");

        input = input.replace("/home","");
        input = input.replace("/log","");
        input = input.replace("//", "/");
        input = input.replace("///", "/");

        while (true)
        if ((input.charAt(input.length()-1) == '/'|| input.charAt(input.length()-1) == '.' )&& input.length() >1) {
            input = input.substring(0,input.length()-1);
        }
        else
        {
            break;
        }
        return input;
    }

}
