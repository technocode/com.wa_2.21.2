package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.0Yp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07600Yp implements AnonymousClass0SG {
    public final /* synthetic */ HomeActivity A00;

    public /* synthetic */ C07600Yp(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        HomeActivity homeActivity = this.A00;
        Number number = (Number) obj;
        if (number != null && !homeActivity.isFinishing()) {
            int intValue = number.intValue();
            if (intValue == 0) {
                homeActivity.A0C(homeActivity.A0I);
            } else if (intValue == 1) {
                homeActivity.A0C(homeActivity.A0I);
            }
        }
    }
}
