package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.0aq  reason: invalid class name and case insensitive filesystem */
public class C08300aq implements AbstractMenuItemC07630Yu {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = 4096;
    public int A04 = 4096;
    public Context A05;
    public Intent A06;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public Drawable A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public final int A0G;

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractC14860n0 A9F() {
        return null;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public boolean collapseActionView() {
        return false;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public boolean expandActionView() {
        return false;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public View getActionView() {
        return null;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public void setShowAsAction(int i) {
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public C08300aq(Context context, CharSequence charSequence) {
        this.A05 = context;
        this.A0G = 16908332;
        this.A0B = charSequence;
    }

    public final void A00() {
        Drawable drawable = this.A09;
        if (drawable == null) {
            return;
        }
        if (this.A0E || this.A0F) {
            Drawable A0d = C002001d.A0d(drawable);
            this.A09 = A0d;
            Drawable mutate = A0d.mutate();
            this.A09 = mutate;
            if (this.A0E) {
                C002001d.A2b(mutate, this.A07);
            }
            if (this.A0F) {
                C002001d.A2c(this.A09, this.A08);
            }
        }
    }

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractMenuItemC07630Yu AO5(CharSequence charSequence) {
        this.A0A = charSequence;
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractMenuItemC07630Yu AP8(AbstractC14860n0 r2) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractMenuItemC07630Yu APE(CharSequence charSequence) {
        this.A0D = charSequence;
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractMenuItemC07630Yu
    public int getAlphabeticModifiers() {
        return this.A03;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public CharSequence getContentDescription() {
        return this.A0A;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.A09;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public ColorStateList getIconTintList() {
        return this.A07;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public Intent getIntent() {
        return this.A06;
    }

    public int getItemId() {
        return this.A0G;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public int getNumericModifiers() {
        return this.A04;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return 0;
    }

    public CharSequence getTitle() {
        return this.A0B;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0C;
        return charSequence == null ? this.A0B : charSequence;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public CharSequence getTooltipText() {
        return this.A0D;
    }

    public boolean isCheckable() {
        return (this.A02 & 1) != 0;
    }

    public boolean isChecked() {
        return (this.A02 & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.A02 & 16) != 0;
    }

    public boolean isVisible() {
        return (this.A02 & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractMenuItemC07630Yu, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractMenuItemC07630Yu, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.A00 = Character.toLowerCase(c);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.A00 = Character.toLowerCase(c);
        this.A03 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.A02 = (z ? 1 : 0) | (this.A02 & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i = this.A02 & -3;
        int i2 = 0;
        if (z) {
            i2 = 2;
        }
        this.A02 = i2 | i;
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.A0A = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i = this.A02 & -17;
        int i2 = 0;
        if (z) {
            i2 = 16;
        }
        this.A02 = i2 | i;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.A09 = C004302a.A03(this.A05, i);
        A00();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.A09 = drawable;
        A00();
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0E = true;
        A00();
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A08 = mode;
        this.A0F = true;
        A00();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A06 = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.A01 = c;
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setNumericShortcut(char c, int i) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A03 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.A0B = this.A05.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.A0B = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0C = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.A0D = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.A02 & 8;
        if (z) {
            i = 0;
        }
        this.A02 = i2 | i;
        return this;
    }
}
