package X;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: X.3JW  reason: invalid class name */
public final class AnonymousClass3JW extends Enum {
    public static final /* synthetic */ AnonymousClass3JW[] A00;
    public static final AnonymousClass3JW A01;
    public final int value = 1;

    static {
        AnonymousClass3JW r1 = new AnonymousClass3JW();
        A01 = r1;
        A00 = new AnonymousClass3JW[]{r1};
    }

    public static AnonymousClass3JW valueOf(String str) {
        return (AnonymousClass3JW) Enum.valueOf(AnonymousClass3JW.class, str);
    }

    public static AnonymousClass3JW[] values() {
        return (AnonymousClass3JW[]) A00.clone();
    }
}
