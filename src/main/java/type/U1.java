package type;

public class U1 {

    private byte[] value = null;

    public U1(byte b1) {
        value = new byte[]{b1};
    }

    public Integer toInt() {
        return (value[0] & 0xff);
    }

    public String toHexString() {
        char[] hexChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder hexStr = new StringBuilder();
        int v = value[0] & 0xff;
        while (v > 0) {
            int c = v % 16;
            v = v >>> 4;
            hexStr.insert(0, hexChar[c]);
        }
        if ((hexStr.length() & 0x01) == 1) {
            hexStr.insert(0, '0');
        }
        return "0x" + (hexStr.length() == 0 ? "00" : hexStr.toString());
    }
}
