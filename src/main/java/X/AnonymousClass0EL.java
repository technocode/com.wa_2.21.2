package X;

import com.whatsapp.util.Log;

/* renamed from: X.0EL  reason: invalid class name */
public class AnonymousClass0EL extends AnonymousClass0EM {
    public static volatile AnonymousClass0EL A01;
    public final AnonymousClass0CP A00;

    public AnonymousClass0EL(AnonymousClass00T r4, AnonymousClass0CP r5) {
        super(new C02180Ay(new AnonymousClass2k2(r4), null));
        this.A00 = r5;
    }

    public static AnonymousClass0EL A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0EL.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0EL(C002101e.A00(), AnonymousClass0CP.A00());
                }
            }
        }
        return A01;
    }

    /* renamed from: A07 */
    public boolean A06(AnonymousClass2T4 r3) {
        StringBuilder sb = new StringBuilder("mediauploadqueue/cancel ");
        sb.append(r3);
        Log.i(sb.toString());
        return super.A06(r3);
    }
}
