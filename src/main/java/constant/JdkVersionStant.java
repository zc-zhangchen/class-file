package constant;

public enum JdkVersionStant {
    Jdk1(45, "0x2D", "Jdk 1.1"),
    Jdk2(46, "0x2E", "Jdk 1.2"),
    Jdk3(47, "0x2F", "Jdk 1.3"),
    Jdk4(48, "0x30", "Jdk 1.4"),
    Jdk5(49, "0x31", "Jdk 1.5"),
    Jdk6(50, "0x32", "Jdk 1.6"),
    Jdk7(51, "0x33", "Jdk 1.7"),
    Jdk8(52, "0x34", "Jdk 1.8");

    private final Integer classVersion;
    private final String hexString;
    private final String jdkVersion;


    JdkVersionStant(Integer classVersion, String hexString, String jdkVersion) {
        this.classVersion = classVersion;
        this.hexString = hexString;
        this.jdkVersion = jdkVersion;
    }

    public Integer getClassVersion() {
        return classVersion;
    }

    public String getHexString() {
        return hexString;
    }


    public String getJdkVersion() {
        return jdkVersion;
    }


}
