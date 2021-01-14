package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.1ZT  reason: invalid class name */
public final class AnonymousClass1ZT implements AbstractMenuItemC07630Yu {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = 0;
    public int A04 = 4096;
    public int A05 = 4096;
    public int A06 = 0;
    public Intent A07;
    public ColorStateList A08 = null;
    public PorterDuff.Mode A09 = null;
    public Drawable A0A;
    public MenuItem.OnActionExpandListener A0B;
    public MenuItem.OnMenuItemClickListener A0C;
    public View A0D;
    public AnonymousClass0T8 A0E;
    public AnonymousClass0TY A0F;
    public AbstractC14860n0 A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;
    public boolean A0O = false;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;

    public AnonymousClass1ZT(AnonymousClass0T8 r3, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.A0E = r3;
        this.A0R = i2;
        this.A0Q = i;
        this.A0P = i3;
        this.A0S = i4;
        this.A0I = charSequence;
        this.A06 = i5;
    }

    public final Drawable A00(Drawable drawable) {
        if (drawable != null && this.A0O && (this.A0L || this.A0M)) {
            drawable = C002001d.A0d(drawable).mutate();
            if (this.A0L) {
                C002001d.A2b(drawable, this.A08);
            }
            if (this.A0M) {
                C002001d.A2c(drawable, this.A09);
            }
            this.A0O = false;
        }
        return drawable;
    }

    public void A01(View view) {
        int i;
        this.A0D = view;
        this.A0G = null;
        if (view != null && view.getId() == -1 && (i = this.A0R) > 0) {
            view.setId(i);
        }
        AnonymousClass0T8 r1 = this.A0E;
        r1.A0D = true;
        r1.A0E(true);
    }

    public boolean A02() {
        AbstractC14860n0 r2;
        if ((this.A06 & 8) == 0) {
            return false;
        }
        View view = this.A0D;
        if (view == null && (r2 = this.A0G) != null) {
            if (!(r2 instanceof AnonymousClass23O)) {
                view = ((AnonymousClass1ZU) r2).A00.onCreateActionView();
            } else {
                view = ((AnonymousClass1ZU) r2).A00.onCreateActionView(this);
            }
            this.A0D = view;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractC14860n0 A9F() {
        return this.A0G;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractMenuItemC07630Yu AO5(CharSequence charSequence) {
        this.A0H = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractMenuItemC07630Yu AP8(AbstractC14860n0 r5) {
        AbstractC14860n0 r1 = this.A0G;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A0D = null;
        this.A0G = r5;
        this.A0E.A0E(true);
        AbstractC14860n0 r3 = this.A0G;
        if (r3 != null) {
            AnonymousClass1ZS r2 = new AnonymousClass1ZS(this);
            if (!(r3 instanceof AnonymousClass23O)) {
                if (r3.A00 != null) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
                    A0S2.append(r3.getClass().getSimpleName());
                    A0S2.append(" instance while it is still in use somewhere else?");
                    Log.w("ActionProvider(support)", A0S2.toString());
                }
                r3.A00 = r2;
            } else {
                AnonymousClass23O r32 = (AnonymousClass23O) r3;
                r32.A00 = r2;
                ((AnonymousClass1ZU) r32).A00.setVisibilityListener(r32);
                return this;
            }
        }
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public AbstractMenuItemC07630Yu APE(CharSequence charSequence) {
        this.A0K = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public boolean collapseActionView() {
        if ((this.A06 & 8) == 0) {
            return false;
        }
        if (this.A0D == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.A0E.A0L(this);
        }
        return false;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public boolean expandActionView() {
        if (!A02()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.A0E.A0M(this);
        }
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // X.AbstractMenuItemC07630Yu
    public View getActionView() {
        View onCreateActionView;
        View view = this.A0D;
        if (view != null) {
            return view;
        }
        AbstractC14860n0 r2 = this.A0G;
        if (r2 == null) {
            return null;
        }
        if (!(r2 instanceof AnonymousClass23O)) {
            onCreateActionView = ((AnonymousClass1ZU) r2).A00.onCreateActionView();
        } else {
            onCreateActionView = ((AnonymousClass1ZU) r2).A00.onCreateActionView(this);
        }
        this.A0D = onCreateActionView;
        return onCreateActionView;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public int getAlphabeticModifiers() {
        return this.A04;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public CharSequence getContentDescription() {
        return this.A0H;
    }

    public int getGroupId() {
        return this.A0Q;
    }

    public Drawable getIcon() {
        Drawable drawable = this.A0A;
        if (drawable != null) {
            return A00(drawable);
        }
        int i = this.A03;
        if (i == 0) {
            return null;
        }
        Drawable A012 = AnonymousClass05p.A01(this.A0E.A0M, i);
        this.A03 = 0;
        this.A0A = A012;
        return A00(A012);
    }

    @Override // X.AbstractMenuItemC07630Yu
    public ColorStateList getIconTintList() {
        return this.A08;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public PorterDuff.Mode getIconTintMode() {
        return this.A09;
    }

    public Intent getIntent() {
        return this.A07;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.A0R;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public int getNumericModifiers() {
        return this.A05;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return this.A0P;
    }

    public SubMenu getSubMenu() {
        return this.A0F;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.A0I;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0J;
        if (charSequence == null) {
            charSequence = this.A0I;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // X.AbstractMenuItemC07630Yu
    public CharSequence getTooltipText() {
        return this.A0K;
    }

    public boolean hasSubMenu() {
        return this.A0F != null;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public boolean isActionViewExpanded() {
        return this.A0N;
    }

    public boolean isCheckable() {
        return (this.A02 & 1) == 1;
    }

    public boolean isChecked() {
        return (this.A02 & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.A02 & 16) != 0;
    }

    public boolean isVisible() {
        boolean overridesItemVisibility;
        boolean isVisible;
        AbstractC14860n0 r1 = this.A0G;
        if (r1 != null) {
            if (!(r1 instanceof AnonymousClass23O)) {
                overridesItemVisibility = false;
            } else {
                overridesItemVisibility = ((AnonymousClass1ZU) r1).A00.overridesItemVisibility();
            }
            if (overridesItemVisibility) {
                if ((this.A02 & 8) != 0) {
                    return false;
                }
                AbstractC14860n0 r12 = this.A0G;
                if (!(r12 instanceof AnonymousClass23O)) {
                    isVisible = true;
                } else {
                    isVisible = ((AnonymousClass1ZU) r12).A00.isVisible();
                }
                if (isVisible) {
                    return true;
                }
                return false;
            }
        }
        if ((this.A02 & 8) != 0) {
            return false;
        }
        return true;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // X.AbstractMenuItemC07630Yu, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.A0E.A0M;
        A01(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A01(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 == c) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A04 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A0E.A0E(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.A02;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.A02 = i2;
        if (i != i2) {
            this.A0E.A0E(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i = this.A02;
        if ((i & 4) != 0) {
            AnonymousClass0T8 r9 = this.A0E;
            if (r9 != null) {
                int groupId = getGroupId();
                int size = r9.A07.size();
                r9.A07();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass1ZT r5 = (AnonymousClass1ZT) r9.A07.get(i2);
                    if (r5.A0Q == groupId) {
                        int i3 = r5.A02;
                        if ((i3 & 4) != 0 && r5.isCheckable()) {
                            boolean z2 = false;
                            if (r5 == this) {
                                z2 = true;
                            }
                            int i4 = i3 & -3;
                            int i5 = 0;
                            if (z2) {
                                i5 = 2;
                            }
                            int i6 = i5 | i4;
                            r5.A02 = i6;
                            if (i3 != i6) {
                                r5.A0E.A0E(false);
                            }
                        }
                    }
                }
                r9.A06();
                return this;
            }
            throw null;
        }
        int i7 = i & -3;
        int i8 = 0;
        if (z) {
            i8 = 2;
        }
        int i9 = i8 | i7;
        this.A02 = i9;
        if (i != i9) {
            this.A0E.A0E(false);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.A0H = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.A02 |= 16;
        } else {
            this.A02 &= -17;
        }
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.A0A = null;
        this.A03 = i;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.A03 = 0;
        this.A0A = drawable;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A08 = colorStateList;
        this.A0L = true;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A09 = mode;
        this.A0M = true;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A07 = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.A01 == c) {
            return this;
        }
        this.A01 = c;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A05 == i) {
            return this;
        }
        this.A01 = c;
        this.A05 = KeyEvent.normalizeMetaState(i);
        this.A0E.A0E(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0C = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A05 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A04 = KeyEvent.normalizeMetaState(i2);
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.AbstractMenuItemC07630Yu
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.A06 = i;
            AnonymousClass0T8 r1 = this.A0E;
            r1.A0D = true;
            r1.A0E(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // X.AbstractMenuItemC07630Yu
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.A0E.A0M.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.A0I = charSequence;
        this.A0E.A0E(false);
        AnonymousClass0TY r0 = this.A0F;
        if (r0 != null) {
            r0.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0J = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.A0K = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = this.A02;
        int i2 = i & -9;
        int i3 = 8;
        if (z) {
            i3 = 0;
        }
        int i4 = i3 | i2;
        this.A02 = i4;
        if (i != i4) {
            AnonymousClass0T8 r1 = this.A0E;
            r1.A0F = true;
            r1.A0E(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
