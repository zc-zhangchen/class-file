package type;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class CONSTANT_Fieldref_info extends CpInfo {

    private U2 class_index;

    private U2 name_and_type_index;

    public CONSTANT_Fieldref_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuffer) {
        class_index = new U2(codeBuffer.get(), codeBuffer.get());
        name_and_type_index = new U2(codeBuffer.get(), codeBuffer.get());
    }

    @Override
    public String toString() {
        return super.toString() + " ,class_index = " + class_index.toInt() + " ,name_and_type_index = " + name_and_type_index.toInt();
    }
}
