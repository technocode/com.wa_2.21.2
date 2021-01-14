package X;

import com.whatsapp.util.Log;

/* renamed from: X.2j5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56722j5 implements AbstractC03150Ez {
    public final /* synthetic */ C60602pn A00;

    public /* synthetic */ C56722j5(C60602pn r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C60602pn r2 = this.A00;
        AnonymousClass1W8 r4 = (AnonymousClass1W8) obj;
        StringBuilder A0S = AnonymousClass008.A0S("MediaDownload/onPostExecute; mediaHash=");
        A0S.append(r2.A0Z.A0C);
        A0S.append(" status=");
        A0S.append(r4);
        Log.i(A0S.toString());
        r2.A0C(r4);
        r2.A0D(r4);
    }
}
