package X;

import android.view.MenuItem;

/* renamed from: X.0jV  reason: invalid class name and case insensitive filesystem */
public class MenuItem$OnMenuItemClickListenerC13040jV implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ AnonymousClass1ZW A01;

    public MenuItem$OnMenuItemClickListenerC13040jV(AnonymousClass1ZW r1, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A01 = r1;
        this.A00 = onMenuItemClickListener;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
