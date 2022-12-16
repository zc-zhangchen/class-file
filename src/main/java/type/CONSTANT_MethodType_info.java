package type;


import java.nio.ByteBuffer;

public class CONSTANT_MethodType_info extends CpInfo {
    private U2 descriptor_index;

    public CONSTANT_MethodType_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        descriptor_index = new U2(codeBuffer.get(), codeBuffer.get());
    }
}
