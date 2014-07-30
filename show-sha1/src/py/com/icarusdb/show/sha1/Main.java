/**
 * 
 */
package py.com.icarusdb.show.sha1;

import java.security.NoSuchAlgorithmException;

import py.org.pti.encryption.SHA1;

/**
 * @author rgamarra
 *
 */
public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
//        if (args.length == 0) 
//        {
//            System.out.println("ne re moiri ningo mba'eve");
//            return;
//        }
        
        String string = "nati";//args[0];
        
        try
        {
            String hash = SHA1.getHash(string);
            System.out.println("re moi : " + string);
            System.out.println("sha1 ovaleva : " + hash);
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        
    }

}
