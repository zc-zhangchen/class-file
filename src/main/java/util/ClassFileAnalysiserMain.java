package util;

import type.ClassFile;
import type.CpInfo;

import java.io.*;
import java.nio.ByteBuffer;

public class ClassFileAnalysiserMain {
    public static ByteBuffer readFile(String classPath) throws FileNotFoundException {
        File file=new File(classPath);
        if (!file.isFile()){
            throw new FileNotFoundException("file not exists");
        }
        byte[] byteCodeBuf=new byte[4096];
        int length = 0;
        try (InputStream in =new FileInputStream(file)){
            length=in.read(byteCodeBuf);
            if (length<1){
                throw new Exception("not read byte code");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ByteBuffer.wrap(byteCodeBuf,0,length).asReadOnlyBuffer();
    }

    public static void main(String[] args) throws Exception {
        String classPath="D:\\mycode\\class-file\\target\\classes\\test\\Test.class";
        ByteBuffer byteBuffer = readFile(classPath);
        ClassFile analysis = ClassFileAnalysiser.analysis(byteBuffer);
        Integer poolCount = analysis.getConstant_pool_count().toInt();
        System.err.println("常量池总数量: "+poolCount);
        CpInfo[] constant_pool = analysis.getConstant_pool();
        for (CpInfo cpInfo : constant_pool) {
            System.err.println(cpInfo.toString());
        }
    }
}
