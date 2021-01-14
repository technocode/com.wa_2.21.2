package X;

import android.view.MenuItem;

/* renamed from: X.0jU  reason: invalid class name and case insensitive filesystem */
public class MenuItem$OnActionExpandListenerC13030jU implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ AnonymousClass1ZW A01;

    public MenuItem$OnActionExpandListenerC13030jU(AnonymousClass1ZW r1, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A01 = r1;
        this.A00 = onActionExpandListener;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
