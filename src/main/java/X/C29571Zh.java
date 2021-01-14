package X;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: X.1Zh  reason: invalid class name and case insensitive filesystem */
public class C29571Zh implements AnonymousClass0MX {
    public final /* synthetic */ ActionMenuView A00;

    public C29571Zh(ActionMenuView actionMenuView) {
        this.A00 = actionMenuView;
    }

    @Override // X.AnonymousClass0MX
    public boolean AHj(AnonymousClass0T8 r3, MenuItem menuItem) {
        AbstractC08280an r0;
        AbstractC07950aC r02 = this.A00.A09;
        if (r02 == null || (r0 = ((C07940aB) r02).A00.A0R) == null || !r0.onMenuItemClick(menuItem)) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0MX
    public void AHk(AnonymousClass0T8 r2) {
        AnonymousClass0MX r0 = this.A00.A05;
        if (r0 != null) {
            r0.AHk(r2);
        }
    }
}
