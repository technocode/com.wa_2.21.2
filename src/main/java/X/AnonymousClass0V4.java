package X;

import android.view.Window;

/* renamed from: X.0V4  reason: invalid class name */
public final class AnonymousClass0V4 implements AnonymousClass0TR {
    public boolean A00;
    public final /* synthetic */ AnonymousClass0TC A01;

    public AnonymousClass0V4(AnonymousClass0TC r1) {
        this.A01 = r1;
    }

    @Override // X.AnonymousClass0TR
    public void AEI(AnonymousClass0T8 r3, boolean z) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass0TC r1 = this.A01;
            r1.A01.A3o();
            Window.Callback callback = r1.A00;
            if (callback != null) {
                callback.onPanelClosed(AnonymousClass0PW.A03, r3);
            }
            this.A00 = false;
        }
    }

    @Override // X.AnonymousClass0TR
    public boolean AI7(AnonymousClass0T8 r3) {
        Window.Callback callback = this.A01.A00;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(AnonymousClass0PW.A03, r3);
        return true;
    }
}
