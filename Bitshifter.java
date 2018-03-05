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
            newSeed += 1;
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
            newSeed += 1;
        }
        return result;
    }

}
