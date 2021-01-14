package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.optin.OptInActivity;

/* renamed from: X.2Xh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51092Xh implements AnonymousClass0SG {
    public final /* synthetic */ OptInActivity A00;

    public /* synthetic */ C51092Xh(OptInActivity optInActivity) {
        this.A00 = optInActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        OptInActivity optInActivity = this.A00;
        AnonymousClass2FQ r5 = (AnonymousClass2FQ) obj;
        if (r5 != null) {
            AnonymousClass0MB r2 = new AnonymousClass0MB(optInActivity);
            r2.A01(r5.A00);
            r2.A05(optInActivity.getString(R.string.cancel), null);
            r2.A07(optInActivity.getString(R.string.btn_continue), new AnonymousClass2FP(optInActivity, r5));
            r2.A00().show();
        }
    }
}
