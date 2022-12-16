package type;

import handler.ConstantInfoHandler;


public abstract class CpInfo implements ConstantInfoHandler {
    private U1 tag;

    public CpInfo(U1 tag) {
        this.tag = tag;
    }

    public static CpInfo newCpInfo(U1 tag) throws Exception {
        int tagValue = tag.toInt();
        CpInfo cpInfo = null;
        switch (tagValue) {
            case 1:
                cpInfo = new CONSTANT_Utf8_info(tag);
                break;
            case 3:
                cpInfo = new CONSTANT_Integer_info(tag);
                break;
            case 4:
                cpInfo = new CONSTANT_Float_info(tag);
                break;
            case 5:
                cpInfo = new CONSTANT_Long_info(tag);
                break;
            case 6:
                cpInfo = new CONSTANT_Double_info(tag);
                break;
            case 7:
                cpInfo = new CONSTANT_Class_info(tag);
                break;
            case 8:
                cpInfo = new CONSTANT_String_info(tag);
                break;
            case 9:
                cpInfo = new CONSTANT_Fieldref_info(tag);
                break;
            case 10:
                cpInfo = new CONSTANT_Methodref_info(tag);
                break;
            case 11:
                cpInfo = new CONSTANT_InterfaceMethodref_info(tag);
                break;
            case 12:
                cpInfo = new CONSTANT_NameAndType_info(tag);
                break;
            case 15:
                cpInfo = new CONSTANT_MethodHandle_info(tag);
                break;
            case 16:
                cpInfo = new CONSTANT_MethodType_info(tag);
                break;
            case 18:
                cpInfo = new CONSTANT_InvokeDynamic_info(tag);
                break;
            default:
                throw new Exception("没有找到该TAG=" + tagValue + "对应的常量类型");
        }
        return cpInfo;
    }

    @Override
    public String toString() {
        return "tag = " + this.tag.toHexString();
    }
}
