package type;

import java.util.Arrays;

public class ClassFile {
    private U4 magic;
    private U2 minor_version;
    private U2 magor_version;
    private U2 constant_pool_count;
    private CpInfo[] constant_pool;
    private U2 access_flags;
    private U2 this_class;
    private U2 supper_class;
    private U2 interfaces_count;
    private U2[] interfaces;
    private U2 fields_count;
    private FieldInfo[] fields;
    private U2 methods_count;
    private MethodInfo[] methods;
    private U2 attributes_count;
    private AttributeInfo[] attributes;

    @Override
    public String toString() {
        return "ClassFile{" +
                "magic=" + magic +
                ", minor_version=" + minor_version +
                ", magor_version=" + magor_version +
                ", constant_pool_count=" + constant_pool_count +
                ", constant_pool=" + Arrays.toString(constant_pool) +
                ", access_flags=" + access_flags +
                ", this_class=" + this_class +
                ", supper_class=" + supper_class +
                ", interfaces_count=" + interfaces_count +
                ", interfaces=" + Arrays.toString(interfaces) +
                ", fields_count=" + fields_count +
                ", fields=" + Arrays.toString(fields) +
                ", methods_count=" + methods_count +
                ", methods=" + Arrays.toString(methods) +
                ", attributes_count=" + attributes_count +
                ", attributes=" + Arrays.toString(attributes) +
                '}';
    }

    public U4 getMagic() {
        return magic;
    }

    public void setMagic(U4 magic) {
        this.magic = magic;
    }

    public U2 getMinor_version() {
        return minor_version;
    }

    public void setMinor_version(U2 minor_version) {
        this.minor_version = minor_version;
    }

    public U2 getMagor_version() {
        return magor_version;
    }

    public void setMagor_version(U2 magor_version) {
        this.magor_version = magor_version;
    }

    public U2 getConstant_pool_count() {
        return constant_pool_count;
    }

    public void setConstant_pool_count(U2 constant_pool_count) {
        this.constant_pool_count = constant_pool_count;
    }

    public CpInfo[] getConstant_pool() {
        return constant_pool;
    }

    public void setConstant_pool(CpInfo[] constant_pool) {
        this.constant_pool = constant_pool;
    }

    public U2 getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(U2 access_flags) {
        this.access_flags = access_flags;
    }

    public U2 getThis_class() {
        return this_class;
    }

    public void setThis_class(U2 this_class) {
        this.this_class = this_class;
    }

    public U2 getSupper_class() {
        return supper_class;
    }

    public void setSupper_class(U2 supper_class) {
        this.supper_class = supper_class;
    }

    public U2 getInterfaces_count() {
        return interfaces_count;
    }

    public void setInterfaces_count(U2 interfaces_count) {
        this.interfaces_count = interfaces_count;
    }

    public U2[] getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(U2[] interfaces) {
        this.interfaces = interfaces;
    }

    public U2 getFields_count() {
        return fields_count;
    }

    public void setFields_count(U2 fields_count) {
        this.fields_count = fields_count;
    }

    public FieldInfo[] getFields() {
        return fields;
    }

    public void setFields(FieldInfo[] fields) {
        this.fields = fields;
    }

    public U2 getMethods_count() {
        return methods_count;
    }

    public void setMethods_count(U2 methods_count) {
        this.methods_count = methods_count;
    }

    public MethodInfo[] getMethods() {
        return methods;
    }

    public void setMethods(MethodInfo[] methods) {
        this.methods = methods;
    }

    public U2 getAttributes_count() {
        return attributes_count;
    }

    public void setAttributes_count(U2 attributes_count) {
        this.attributes_count = attributes_count;
    }

    public AttributeInfo[] getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeInfo[] attributes) {
        this.attributes = attributes;
    }
}
