public class MyString {
    public String str;
    public MyString(){
        this.str = "";
    }
    public MyString(String str){
        this.str = str;
    }
    int getLength() {
        return this.str.length();
    }

    char getChar(int n){
        try{
            if (n>=this.getLength() || n < 0){
                throw new IllegalArgumentException();
            }
            return this.str.charAt(n);
        } catch (IllegalArgumentException e){
            System.out.println("Index provided is too high! Try another one!");
        }
        return 0;
    }

    void append(String str){
        this.str += str;
    }

    void append(int rep, String str){
        for (int i = 0; i < rep; i++) {
            this.str += str;
        }
    }

    void prepend(String str){
        this.str = str + this.str;
    }

    void insert(int pos, String str){
        if (pos>=this.getLength() || pos < 0){
            throw new IllegalArgumentException();
        }
        String firstPart = this.str.substring(0, pos);
        String secondPart = this.str.substring(pos);
        this.str = firstPart + str + secondPart;
    }

    void reset(String str){
        this.str = str;
    }

    @Override
    public String toString(){
        return this.str;
    }

}
