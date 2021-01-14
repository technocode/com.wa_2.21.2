package X;

import com.whatsapp.util.Log;

/* renamed from: X.2iX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56382iX implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0EJ A00;
    public final /* synthetic */ C56862jJ A01;
    public final /* synthetic */ C60622pp A02;

    public /* synthetic */ C56382iX(AnonymousClass0EJ r1, C56862jJ r2, C60622pp r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0EJ r5 = this.A00;
        C56862jJ r4 = this.A01;
        C60622pp r3 = this.A02;
        Log.d("mediajobmanager/mediaupload/response");
        AnonymousClass2T3 A002 = r4.A00();
        synchronized (A002) {
            A002.A09 = true;
        }
        r5.A0J.ANF(new RunnableEBaseShape0S0300000_I0_0(r5, r4, obj, 42));
        r3.A02();
    }
}
