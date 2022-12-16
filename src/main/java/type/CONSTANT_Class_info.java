package type;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class CONSTANT_Class_info extends CpInfo {

    private U2 name_index;


    public CONSTANT_Class_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        this.name_index = new U2(codeBuffer.get(), codeBuffer.get());
    }

    @Override
    public String toString() {
        return super.toString() + " ,name_index = " + name_index.toInt();
    }
}
