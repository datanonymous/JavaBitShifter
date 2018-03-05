public class Bitshifter {

    public static String encrypt(String key, int seed){
        String result = "";
        int len = key.length();
        char ch;
        int newSeed = seed % 101;
        for(int i = 0; i < len; i++){
            ch = key.charAt(i);
            ch += newSeed;
            result += ch;
            newSeed += i; // can also use 1 rather than i to see how it's put together
        }
        return result;
    }

    public static String decrypt(String key, int seed){
        String result = "";
        int len = key.length();
        char ch;
        int newSeed = seed % 101;
        for(int i = 0; i < len; i++){
            ch = key.charAt(i);
            ch -= newSeed;
            result += ch;
            newSeed += i;
        }
        return result;
    }

}
