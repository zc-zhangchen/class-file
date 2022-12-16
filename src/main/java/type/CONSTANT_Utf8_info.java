package type;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class CONSTANT_Utf8_info extends CpInfo {

    private U2 length;

    private byte[] bytes;

    public CONSTANT_Utf8_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        length = new U2(codeBuffer.get(), codeBuffer.get());
        int len = length.toInt();
        bytes = new byte[len];
        codeBuffer.get(bytes, 0, len);
    }

    @Override
    public String toString() {
        return super.toString() + " ,length = " + length.toInt() + " ,str = " + new String(bytes, StandardCharsets.UTF_8);
    }
}
