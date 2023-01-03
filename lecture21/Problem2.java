public class Problem2 {
    public static String norm(String name){
        char firstChar = name.charAt(0);
        String restName = name.substring(1).toLowerCase();
        return Character.toString(firstChar).toUpperCase() + restName;
    }

    public static String init(String name){
        String[] separateName = name.split("\\s+");
        MyString result = new MyString();
        for (int i = 0; i < 2; i++) {
            result.append(Character.toString(separateName[i].toUpperCase().charAt(0)) + ". ");
        }
        result.append(norm(separateName[2]));
        return result.toString();
    }

    public static String tr(String str, String from, String to){
        char[] fromArr = from.toCharArray();
        char[] toArr = to.toCharArray();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < fromArr.length; j++) {
                if(charArr[i] == fromArr[j]){
                    charArr[i] = toArr[j];
                }
            }
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        String name = "aNTON";
        String otherName = "john richard doe";
        System.out.println(norm(name));
        System.out.println(init(otherName));
        System.out.println(tr("November 2016","abcdefghijklmnopqrstuvwyz","ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }
}
