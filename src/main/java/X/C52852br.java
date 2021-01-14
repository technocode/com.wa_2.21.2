package X;

import com.whatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.2br  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52852br implements AbstractC03150Ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DeepLinkActivity A01;

    public /* synthetic */ C52852br(DeepLinkActivity deepLinkActivity, int i) {
        this.A01 = deepLinkActivity;
        this.A00 = i;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        DeepLinkActivity deepLinkActivity = this.A01;
        int i = this.A00;
        deepLinkActivity.A00.removeMessages(1);
        deepLinkActivity.AMi();
        if (((Boolean) obj).booleanValue()) {
            deepLinkActivity.finish();
        } else {
            deepLinkActivity.APo(i);
        }
    }
}
