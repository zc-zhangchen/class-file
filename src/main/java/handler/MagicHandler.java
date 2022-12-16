package handler;

import type.ClassFile;
import type.U4;

import java.nio.ByteBuffer;

public class MagicHandler implements BaseByteCodeHandler {
    private final static String CAFEBABE = "0xCAFEBABE";

    @Override
    public int order() {
        return 0;
    }

    @Override
    public void read(ByteBuffer codeBuf, ClassFile classFile) {
        U4 u4 = new U4(codeBuf.get(), codeBuf.get(), codeBuf.get(), codeBuf.get());
        classFile.setMagic(u4);
        if (!CAFEBABE.equals(u4.toHexString())) {
            throw new RuntimeException("this is not a class file");
        }
    }
}
