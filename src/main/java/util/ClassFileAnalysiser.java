package util;

import handler.BaseByteCodeHandler;
import handler.ConstantPoolHandler;
import handler.MagicHandler;
import handler.VersionHandler;
import type.ClassFile;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassFileAnalysiser {
    private final static List<BaseByteCodeHandler> handlers=new ArrayList<>();
    static {
        handlers.add(new MagicHandler());
        handlers.add(new VersionHandler());
        handlers.add(new ConstantPoolHandler());
        handlers.sort(Comparator.comparingInt(BaseByteCodeHandler::order));
    }

    public static ClassFile analysis(ByteBuffer codeBuf) throws Exception {
        codeBuf.position(0);
        ClassFile classFile=new ClassFile();
        for (BaseByteCodeHandler handler : handlers) {
            handler.read(codeBuf,classFile);
        }
        return classFile;
    }
}
