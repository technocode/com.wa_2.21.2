package X;

/* renamed from: X.0SF  reason: invalid class name */
public class AnonymousClass0SF implements AnonymousClass0O4 {
    @Override // X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass0SC.class)) {
            return new AnonymousClass0SC();
        }
        throw new IllegalArgumentException("Invalid UIModeViewModel for DialogActivity");
    }
}
