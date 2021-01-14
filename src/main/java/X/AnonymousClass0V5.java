package X;

import android.view.MenuItem;

/* renamed from: X.0V5  reason: invalid class name */
public final class AnonymousClass0V5 implements AnonymousClass0MX {
    public final /* synthetic */ AnonymousClass0TC A00;

    @Override // X.AnonymousClass0MX
    public boolean AHj(AnonymousClass0T8 r2, MenuItem menuItem) {
        return false;
    }

    public AnonymousClass0V5(AnonymousClass0TC r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0MX
    public void AHk(AnonymousClass0T8 r6) {
        AnonymousClass0TC r4 = this.A00;
        if (r4.A00 == null) {
            return;
        }
        if (r4.A01.ABO()) {
            r4.A00.onPanelClosed(AnonymousClass0PW.A03, r6);
        } else if (r4.A00.onPreparePanel(0, null, r6)) {
            r4.A00.onMenuOpened(AnonymousClass0PW.A03, r6);
        }
    }
}
