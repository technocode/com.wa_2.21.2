package X;

import android.view.MenuItem;

/* renamed from: X.1Zw  reason: invalid class name and case insensitive filesystem */
public class C29651Zw implements AnonymousClass0MX {
    public final /* synthetic */ C13380k9 A00;

    @Override // X.AnonymousClass0MX
    public void AHk(AnonymousClass0T8 r1) {
    }

    public C29651Zw(C13380k9 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0MX
    public boolean AHj(AnonymousClass0T8 r2, MenuItem menuItem) {
        AbstractC13370k8 r0 = this.A00.A01;
        if (r0 != null) {
            return r0.onMenuItemClick(menuItem);
        }
        return false;
    }
}
