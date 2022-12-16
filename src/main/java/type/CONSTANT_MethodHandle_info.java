package type;


import java.nio.ByteBuffer;

public class CONSTANT_MethodHandle_info extends CpInfo {
    private U1 reference_kind;

    private U2 reference_index;

    public CONSTANT_MethodHandle_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        this.reference_kind = new U1(codeBuffer.get());

        this.reference_index = new U2(codeBuffer.get(), codeBuffer.get());

    }
}
