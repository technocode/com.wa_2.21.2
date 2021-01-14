package X;

import com.whatsapp.util.Log;

/* renamed from: X.2j9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56762j9 implements AbstractC03150Ez {
    public final /* synthetic */ C60602pn A00;

    public /* synthetic */ C56762j9(C60602pn r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C60602pn r4 = this.A00;
        StringBuilder A0S = AnonymousClass008.A0S("MediaDownload/oncancelled; mediaHash=");
        A0S.append(r4.A0Z.A0C);
        A0S.append(" url=");
        A0S.append(r4.A03);
        Log.i(A0S.toString());
        r4.A0C(new AnonymousClass1W8(13, null, false));
    }
}
