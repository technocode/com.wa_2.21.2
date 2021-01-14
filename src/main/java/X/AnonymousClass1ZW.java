package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.1ZW  reason: invalid class name */
public class AnonymousClass1ZW extends AbstractC12980jP implements MenuItem {
    public Method A00;
    public final AbstractMenuItemC07630Yu A01;

    public AnonymousClass1ZW(Context context, AbstractMenuItemC07630Yu r4) {
        super(context);
        if (r4 != null) {
            this.A01 = r4;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.A01.collapseActionView();
    }

    public boolean expandActionView() {
        return this.A01.expandActionView();
    }

    public ActionProvider getActionProvider() {
        AbstractC14860n0 A9F = this.A01.A9F();
        if (A9F instanceof AnonymousClass1ZU) {
            return ((AnonymousClass1ZU) A9F).A00;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.A01.getActionView();
        return actionView instanceof AnonymousClass1ZV ? (View) ((AnonymousClass1ZV) actionView).A00 : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.A01.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.A01.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.A01.getContentDescription();
    }

    public int getGroupId() {
        return this.A01.getGroupId();
    }

    public Drawable getIcon() {
        return this.A01.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.A01.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A01.getIconTintMode();
    }

    public Intent getIntent() {
        return this.A01.getIntent();
    }

    public int getItemId() {
        return this.A01.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.A01.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.A01.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.A01.getNumericShortcut();
    }

    public int getOrder() {
        return this.A01.getOrder();
    }

    public SubMenu getSubMenu() {
        return this.A01.getSubMenu();
    }

    public CharSequence getTitle() {
        return this.A01.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.A01.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.A01.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.A01.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.A01.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.A01.isCheckable();
    }

    public boolean isChecked() {
        return this.A01.isChecked();
    }

    public boolean isEnabled() {
        return this.A01.isEnabled();
    }

    public boolean isVisible() {
        return this.A01.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AnonymousClass23O r1 = new AnonymousClass23O(this, actionProvider);
        AbstractMenuItemC07630Yu r0 = this.A01;
        if (actionProvider == null) {
            r1 = null;
        }
        r0.AP8(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        AbstractMenuItemC07630Yu r2 = this.A01;
        r2.setActionView(i);
        View actionView = r2.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            r2.setActionView(new AnonymousClass1ZV(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new AnonymousClass1ZV(view);
        }
        this.A01.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.A01.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.A01.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.A01.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.A01.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.A01.AO5(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.A01.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A01.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A01.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A01.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.A01.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.A01.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A01.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC13030jU(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A01.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC13040jV(this, onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.A01.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.A01.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.A01.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.A01.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A01.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.A01.APE(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.A01.setVisible(z);
    }
}
