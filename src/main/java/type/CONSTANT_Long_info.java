package type;

import java.nio.ByteBuffer;

public class CONSTANT_Long_info extends CpInfo {

    private U4 height_bytes;

    private U4 low_bytes;


    public CONSTANT_Long_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        this.height_bytes = new U4(codeBuffer.get(), codeBuffer.get(), codeBuffer.get(), codeBuffer.get());

        this.low_bytes = new U4(codeBuffer.get(), codeBuffer.get(), codeBuffer.get(), codeBuffer.get());
    }
}
