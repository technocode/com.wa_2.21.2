package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Ul  reason: invalid class name and case insensitive filesystem */
public enum EnumC50372Ul {
    OBJECT(2, 0),
    BOOLEAN(4, 1),
    CHAR(5, 2),
    FLOAT(6, 4),
    DOUBLE(7, 8),
    BYTE(8, 1),
    SHORT(9, 2),
    INT(10, 4),
    LONG(11, 8);
    
    public static final Map A00 = new HashMap();
    public final int size;
    public final int typeId;

    /* access modifiers changed from: public */
    static {
        EnumC50372Ul[] values = values();
        for (EnumC50372Ul r2 : values) {
            A00.put(Integer.valueOf(r2.typeId), r2);
        }
    }

    /* access modifiers changed from: public */
    EnumC50372Ul(int i, int i2) {
        this.typeId = i;
        this.size = i2;
    }

    public static EnumC50372Ul A00(int i) {
        return (EnumC50372Ul) A00.get(Integer.valueOf(i));
    }
}
