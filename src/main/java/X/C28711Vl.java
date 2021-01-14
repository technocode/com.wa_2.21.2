package X;

/* renamed from: X.1Vl  reason: invalid class name and case insensitive filesystem */
public class C28711Vl {
    public static volatile C28711Vl A02;
    public final AnonymousClass01K A00;
    public final C28701Vk A01;

    public C28711Vl(AnonymousClass01K r1, C28701Vk r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C28711Vl A00() {
        if (A02 == null) {
            synchronized (C28711Vl.class) {
                if (A02 == null) {
                    A02 = new C28711Vl(AnonymousClass01K.A00(), C28701Vk.A00());
                }
            }
        }
        return A02;
    }
}
