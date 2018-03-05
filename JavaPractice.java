import java.util.*;


public class JavaPractice {

    public static void main(String[] args){
        String passcode = Bitshifter.encrypt("asdf", 123456);
        String decodedMessage = Bitshifter.decrypt(passcode, 123456);
        // asdf with static shift is k}np
        // asdfasdf with static shift is k}npk}np
        System.out.println("Encoded message is: " + passcode);
        System.out.println("Decoded message is: " + decodedMessage);
    }

}



