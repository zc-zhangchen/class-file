package type;

import java.nio.ByteBuffer;

public class CONSTANT_String_info extends CpInfo {

    private U2 string_index;


    public CONSTANT_String_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        this.string_index = new U2(codeBuffer.get(), codeBuffer.get());
    }

    @Override
    public String toString() {
        return super.toString() + " ,string_index = " + string_index.toInt();
    }
}
