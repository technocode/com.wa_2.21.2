package X;

import android.view.Window;

/* renamed from: X.0TV  reason: invalid class name */
public final class AnonymousClass0TV implements AnonymousClass0TR {
    public final /* synthetic */ AnonymousClass0MW A00;

    public AnonymousClass0TV(AnonymousClass0MW r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0TR
    public void AEI(AnonymousClass0T8 r2, boolean z) {
        this.A00.A0T(r2);
    }

    @Override // X.AnonymousClass0TR
    public boolean AI7(AnonymousClass0T8 r3) {
        Window.Callback callback = this.A00.A08.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(AnonymousClass0PW.A03, r3);
        return true;
    }
}
