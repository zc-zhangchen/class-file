package handler;


import type.ClassFile;

import java.nio.ByteBuffer;

public interface BaseByteCodeHandler {
    int order();

    void read(ByteBuffer codeBuf, ClassFile classFile) throws Exception;
}
