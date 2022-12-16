package type;

import java.nio.ByteBuffer;

public class CONSTANT_NameAndType_info extends CpInfo {

    private U2 name_index;

    private U2 descriptor_index;

    public CONSTANT_NameAndType_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        this.name_index = new U2(codeBuffer.get(), codeBuffer.get());

        this.descriptor_index = new U2(codeBuffer.get(), codeBuffer.get());
    }
}
