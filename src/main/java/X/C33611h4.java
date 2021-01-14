package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1h4  reason: invalid class name and case insensitive filesystem */
public class C33611h4 implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass25I r6 = (AnonymousClass25I) obj2;
        if (obj3 != null) {
            AnonymousClass276 r2 = r6.A06;
            AnonymousClass11G r7 = (AnonymousClass11G) obj3;
            if (r2 != null) {
                r2.A01 = r7.A01;
                r2.A00 = r7.A00;
                List list = r2.A04;
                r2.A04 = r7.A02;
                AnonymousClass0pD.A00(new C33651h8(r2, list)).A02(new C30401bI(r2));
                return;
            }
            throw null;
        }
        throw new IllegalStateException("List data was not computed during layout");
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass11G r5 = (AnonymousClass11G) obj3;
        AnonymousClass11G r6 = (AnonymousClass11G) obj4;
        return (r5.A01 == r6.A01 && r5.A00 == r6.A00 && r5.A02.equals(r6.A02)) ? false : true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
    }
}
