package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.1qJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38701qJ implements AnonymousClass0SG {
    public final /* synthetic */ HomeActivity A00;

    public /* synthetic */ C38701qJ(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        HomeActivity homeActivity = this.A00;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            homeActivity.A0R.A0G(1);
            if (!homeActivity.isFinishing()) {
                homeActivity.A0l(bool.booleanValue());
            }
        }
    }
}
