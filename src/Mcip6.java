


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando
 */
public class Mcip6 {
    /*
    throws ClassNotFoundException, SecurityException, NoSuchMethodException, InvocationTargetException, IllegalArgumentException, IllegalAccessException
    */
    public static void main(String ... args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "false");
        try {
            InetAddress.getByName("::1").isReachable(1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Class.forName("net.minecraft.client.main.Main").getDeclaredMethod("main", args.getClass()).invoke(null, (Object) args);
    }
}
