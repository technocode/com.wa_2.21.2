package X;

import android.view.MenuItem;

/* renamed from: X.1Kt  reason: invalid class name and case insensitive filesystem */
public class MenuItem$OnActionExpandListenerC26411Kt implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ AnonymousClass2DH A00;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    public MenuItem$OnActionExpandListenerC26411Kt(AnonymousClass2DH r1) {
        this.A00 = r1;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        AnonymousClass2DH r1 = this.A00;
        r1.A08 = null;
        AnonymousClass2DH.A04(r1);
        return true;
    }
}
