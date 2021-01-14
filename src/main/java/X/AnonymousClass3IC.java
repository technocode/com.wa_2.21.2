package X;

import android.text.TextUtils;

/* renamed from: X.3IC  reason: invalid class name */
public class AnonymousClass3IC implements AbstractC29091Wz {
    public final /* synthetic */ AnonymousClass3IE A00;

    public AnonymousClass3IC(AnonymousClass3IE r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass0MH r4) {
        if (!TextUtils.isEmpty(r4.A0G)) {
            String str = r4.A0G;
            AnonymousClass3IE r1 = this.A00;
            if (str.equals(r1.A08)) {
                r1.A05();
                return;
            }
        }
        if (!TextUtils.isEmpty(r4.A0H)) {
            String str2 = r4.A0H;
            AnonymousClass3IE r12 = this.A00;
            if (str2.equals(r12.A05.A01)) {
                r12.A05();
                return;
            }
        }
        if (!TextUtils.isEmpty(r4.A0I)) {
            String str3 = r4.A0I;
            AnonymousClass3IE r13 = this.A00;
            if (str3.equals(r13.A05.A01)) {
                r13.A05();
            }
        }
    }

    @Override // X.AbstractC29091Wz
    public void AIP(AnonymousClass0MH r1) {
        A00(r1);
    }

    @Override // X.AbstractC29091Wz
    public void AIQ(AnonymousClass0MH r1) {
        A00(r1);
    }
}
