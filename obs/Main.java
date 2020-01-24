
import java.util.*;

public class Main
{

public static void main(String[] args)
{

String str;
Scanner sc = new Scanner(System.in);
System.out.println("Enter String");
str = sc.nextLine();
int j = 0;
char temp = 0;

char[] chars = str.toCharArray();

for (int i = 0; i < chars.length; i++) {

for (j = 0; j < chars.length; j++) {

if (chars[j] > chars[i]) {
temp = chars[i];
chars[i] = chars[j];
chars[j] = temp;
}

}

}

for (int i = 0; i < chars.length; i++) {
System.out.print(chars[i]);
}

}
}