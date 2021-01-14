package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.0TY  reason: invalid class name */
public class AnonymousClass0TY extends AnonymousClass0T8 implements SubMenu {
    public AnonymousClass0T8 A00;
    public AnonymousClass1ZT A01;

    public AnonymousClass0TY(Context context, AnonymousClass0T8 r2, AnonymousClass1ZT r3) {
        super(context);
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0T8
    public boolean A0K(AnonymousClass0T8 r3, MenuItem menuItem) {
        return super.A0K(r3, menuItem) || this.A00.A0K(r3, menuItem);
    }

    public MenuItem getItem() {
        return this.A01;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        A08(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        A08(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        A08(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        A08(0, charSequence, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        A08(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }
}
