package test.book_moudle.io;

import test.global.ResourceLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * ClassName: BookResourceLoader
 * Package: test.entity.io
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
public class BookResourceLoader extends ResourceLoader {
    public static void  scanRescources(String configLocation){
        File files = new File(configLocation);
        if(!files.isDirectory()){
            throw new RuntimeException("不是目录");
        }
        File[] currentfiles = files.listFiles();
        for (int i = 0; i < currentfiles.length; i++) {
            String currentfileName = currentfiles[i].getName();
            if(currentfileName.endsWith(BookResource.NORMAL_FILE_SUFFIX)
                    &&currentfileName.startsWith(BookResource.BOOK_PREFIX)){
                loadResources(currentfiles[i]);
            }
        }
    }
    public static void loadResources(File resource){
        try {
            FileInputStream fileInputStream = new FileInputStream(resource);
            loadResource(new BookResource(fileInputStream));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
