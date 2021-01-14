package X;

import android.util.Pair;

/* renamed from: X.3NE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NE implements AnonymousClass0SG {
    public final /* synthetic */ C08740bd A00;

    public /* synthetic */ AnonymousClass3NE(C08740bd r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        C08740bd r4 = this.A00;
        Pair pair = (Pair) obj;
        Object obj2 = pair.second;
        if (obj2 != null) {
            Object obj3 = pair.first;
            if (obj3 != null) {
                r4.A0G.A08 = Boolean.valueOf(((Boolean) obj3).booleanValue());
            }
            C08680bX r2 = r4.A0G;
            r2.A00 = ((Number) obj2).intValue();
            r4.A01.set(true);
            r4.A0B.A07(Boolean.TRUE);
            r4.A04.A08(r2);
        }
    }
}
