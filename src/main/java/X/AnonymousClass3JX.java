package X;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: X.3JX  reason: invalid class name */
public final class AnonymousClass3JX extends Enum {
    public static final /* synthetic */ AnonymousClass3JX[] A00;
    public static final AnonymousClass3JX A01;
    public final int value = 1;

    static {
        AnonymousClass3JX r1 = new AnonymousClass3JX();
        A01 = r1;
        A00 = new AnonymousClass3JX[]{r1};
    }

    public static AnonymousClass3JX valueOf(String str) {
        return (AnonymousClass3JX) Enum.valueOf(AnonymousClass3JX.class, str);
    }

    public static AnonymousClass3JX[] values() {
        return (AnonymousClass3JX[]) A00.clone();
    }
}
