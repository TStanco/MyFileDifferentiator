import org.apache.commons.io.filefilter.AbstractFileFilter;

import java.io.File;
import java.io.Serializable;

public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {

    File dir = new File(".");
    MagicNumberFileFilter javaClassFileFilter =
            MagicNumberFileFilter(new byte[] {(byte) 0xCA, (byte) 0xFE,
                    (byte) 0xBA, (byte) 0xBE});
    String[] javaClassFiles = dir.list(javaClassFileFilter);
 for (String javaClassFile : javaClassFiles) {
        System.out.println(javaClassFile);
    }
 MagicNumberFileFilter filter = new MagicNumberFileFilter(){
     public void main(String[] args) {


     }
 };


}
