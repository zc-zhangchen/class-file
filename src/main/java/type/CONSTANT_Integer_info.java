package type;

import java.nio.ByteBuffer;

public class CONSTANT_Integer_info extends CpInfo {

    private U4 bytes;


    public CONSTANT_Integer_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        this.bytes = new U4(codeBuffer.get(), codeBuffer.get(), codeBuffer.get(), codeBuffer.get());
    }
}
