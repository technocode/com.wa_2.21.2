package X;

import com.whatsapp.util.Log;

/* renamed from: X.2j7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56742j7 implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0K8 A00;
    public final /* synthetic */ AbstractC007503q A01;

    public /* synthetic */ C56742j7(AnonymousClass0K8 r1, AbstractC007503q r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0K8 r5 = this.A00;
        AbstractC007503q r4 = this.A01;
        C49982Sy r7 = (C49982Sy) obj;
        StringBuilder A0S = AnonymousClass008.A0S("ThumbnailDownloadManager/generateThumbnail; message.key=");
        A0S.append(r4.A0n);
        Log.d(A0S.toString());
        if (r4.A0B() != null && r7.A0B() != null) {
            r5.A0U.A08(r4);
            r5.A0O.A03(r4.A0B(), new RunnableEBaseShape0S0300000_I0_0(r5, r4, r7, 44));
        }
    }
}
