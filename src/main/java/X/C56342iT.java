package X;

import com.whatsapp.util.Log;

/* renamed from: X.2iT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56342iT implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0EJ A00;
    public final /* synthetic */ C56862jJ A01;

    public /* synthetic */ C56342iT(AnonymousClass0EJ r1, C56862jJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0EJ r1 = this.A00;
        Number number = (Number) obj;
        if (this.A01.A0S == null) {
            Log.d("mediajobmanager/mediaprocessjob transcoding error message suppressed");
        } else {
            r1.A01.A03(number.intValue());
        }
    }
}
