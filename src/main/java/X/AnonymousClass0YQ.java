package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.0YQ  reason: invalid class name */
public class AnonymousClass0YQ implements AnonymousClass0YR {
    public final /* synthetic */ HomeActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public AnonymousClass0YQ(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        HomeActivity homeActivity = this.A00;
        AbstractC07520Xz A0a = homeActivity.A0a(HomeActivity.A04(((AnonymousClass2C0) homeActivity).A01, homeActivity.A03));
        if (A0a == null) {
            return false;
        }
        AnonymousClass0XB r0 = homeActivity.A0b;
        r0.A01 = str;
        A0a.A23(r0);
        return false;
    }
}
