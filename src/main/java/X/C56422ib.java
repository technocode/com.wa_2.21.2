package X;

import com.whatsapp.util.Log;

/* renamed from: X.2ib  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56422ib implements AbstractC03150Ez {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04420Kh A01;
    public final /* synthetic */ C56862jJ A02;

    public /* synthetic */ C56422ib(C04420Kh r1, C40531tQ r2, C56862jJ r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C04420Kh r4 = this.A01;
        C40531tQ r3 = this.A00;
        C56862jJ r2 = this.A02;
        StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/thumbnail for ");
        A0S.append(r3.A01.size());
        A0S.append(" messages ; job=");
        A0S.append(r2);
        Log.d(A0S.toString());
        C04430Ki.A01(obj, r3, new C56402iZ(r4.A08));
        AnonymousClass02M r22 = r4.A00;
        r22.A02.post(new RunnableEBaseShape3S0200000_I0_2(r4, r3, 19));
    }
}
