package X;

import com.whatsapp.util.Log;

/* renamed from: X.2iQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56312iQ implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0EJ A00;
    public final /* synthetic */ C56862jJ A01;

    public /* synthetic */ C56312iQ(AnonymousClass0EJ r1, C56862jJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0EJ r4 = this.A00;
        C56862jJ r3 = this.A01;
        Number number = (Number) obj;
        StringBuilder sb = new StringBuilder("mediajobmanager/optimistic/job finished; result=");
        sb.append(number);
        sb.append("; job=");
        sb.append(r3);
        Log.d(sb.toString());
        if (r3.A0S == null) {
            r4.A07.A07(r4.A04(r3, number.intValue(), 1));
            r3.A03();
        }
    }
}
