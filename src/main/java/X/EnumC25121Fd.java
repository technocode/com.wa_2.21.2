package X;

import java.util.List;

/* renamed from: X.1Fd  reason: invalid class name and case insensitive filesystem */
public enum EnumC25121Fd {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(AbstractC25181Fk.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    
    public final Class valueType;

    /* access modifiers changed from: public */
    EnumC25121Fd(Class cls) {
        this.valueType = cls;
    }
}
