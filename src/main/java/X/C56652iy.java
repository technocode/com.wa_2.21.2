package X;

import com.whatsapp.util.Log;

/* renamed from: X.2iy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56652iy implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0CH A00;
    public final /* synthetic */ AnonymousClass1WA A01;
    public final /* synthetic */ AnonymousClass0M3 A02;

    public /* synthetic */ C56652iy(AnonymousClass0CH r1, AnonymousClass0M3 r2, AnonymousClass1WA r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0CH r6 = this.A00;
        AnonymousClass0M3 r5 = this.A02;
        AnonymousClass1WA r4 = this.A01;
        StringBuilder A0S = AnonymousClass008.A0S("MediaDownloadManager/ProgressiveJpeg/Refresh thumbnail; message.key=");
        A0S.append(r5.A0n);
        A0S.append(", message.mediaHash=");
        A0S.append(r5.A06);
        Log.d(A0S.toString());
        if (!(r5.A0B() == null || obj == null)) {
            r6.A0Y.A03(r5.A0B(), new RunnableEBaseShape0S0300000_I0_0(r5, obj, r4, 43));
        }
        AnonymousClass02M r42 = r6.A04;
        r42.A02.post(new RunnableEBaseShape0S0201000_I0(r6.A0G, 12, r5, 16));
    }
}
