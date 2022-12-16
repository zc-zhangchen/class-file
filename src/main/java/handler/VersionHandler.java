package handler;

import type.ClassFile;
import type.U2;

import java.nio.ByteBuffer;

public class VersionHandler implements BaseByteCodeHandler {
    @Override
    public int order() {
        return 1;
    }

    @Override
    public void read(ByteBuffer codeBuf, ClassFile classFile) {
        //副版本号
        U2 minorVersion=new U2(codeBuf.get(), codeBuf.get());
        classFile.setMinor_version(minorVersion);

        //主版本号
        U2 majorVersion=new U2(codeBuf.get(), codeBuf.get());
        classFile.setMagor_version(majorVersion);
    }

}
