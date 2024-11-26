package units;

public class unit3_2 {
    public static void main(String[] args) {
        String word = "Sometimes";
        System.out.println(word.charAt(3));

        String a = "Иван Иванов";
        String b = "Саня";
        String aCopy = a.replace(" ", "");
        checkUserName(a, b);
        Boolean eq = a.equalsIgnoreCase(b);
        System.out.println("Bez registra - " + a.equalsIgnoreCase(b));
        System.out.println("S registrom - " + a.equals(b));

        System.out.println("Ваше имя имеет длину: " + a.length() +" символов" );
        System.out.println("Без пробелов ваше имя имеет длину: " + aCopy.length() +" символов" );


    }

    private static void checkUserName(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2) == true)
            System.out.println("Имена совпадают!");
        else
            System.out.println("Допустимое значение!");

    }


}
