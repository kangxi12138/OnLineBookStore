package test.user_moudle.io;

import test.global.ResourceWriter;
import test.user_moudle.user.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: BookResourceWriter
 * Package: test.entity.io
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
public class UserResourceWriter extends ResourceWriter {

    public static void write(File file, User user){
        if(!file.exists()){
            throw new RuntimeException("文件不存在");
        }
        BufferedWriter bufferedWriter = null;
        try {
            if(fileMap.get(file.getName())==null){
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                fileMap.put(file.getName(),bufferedWriter);
            }else{
                bufferedWriter=fileMap.get(file.getName());
            }
            bufferedWriter.write(UserResource.NORMAL_PREFIX+user.toString()+UserResource.NORMAL_SUFFIX);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<File> scanFiles(String configLocation){
        List<File> files=new ArrayList<>();
        File file = new File(configLocation);
        if(!file.isDirectory()){
            throw new RuntimeException("不是目录");
        }
        File[] currentfiles = file.listFiles();
        for (int i = 0; i < currentfiles.length; i++) {
            String currentfileName = currentfiles[i].getName();
            //做资源的辨认
            if(currentfileName.endsWith(UserResource.NORMAL_FILE_SUFFIX)
                    &&currentfileName.startsWith(UserResource.USER_PREFIX)){
                files.add(currentfiles[i]);
            }
        }
        return files;
    }
}
