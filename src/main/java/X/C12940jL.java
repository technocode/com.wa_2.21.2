package X;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.0jL  reason: invalid class name and case insensitive filesystem */
public class C12940jL {
    public char A00;
    public char A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public ColorStateList A0E = null;
    public PorterDuff.Mode A0F = null;
    public Menu A0G;
    public AbstractC14860n0 A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public CharSequence A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final /* synthetic */ C12950jM A0V;

    public C12940jL(C12950jM r2, Menu menu) {
        this.A0V = r2;
        this.A0G = menu;
        this.A04 = 0;
        this.A02 = 0;
        this.A05 = 0;
        this.A03 = 0;
        this.A0Q = true;
        this.A0P = true;
    }

    public final Object A00(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.A0V.A00.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Cannot instantiate class: ");
            sb.append(str);
            Log.w("SupportMenuInflater", sb.toString(), e);
            return null;
        }
    }

    public final void A01(MenuItem menuItem) {
        MenuItem enabled = menuItem.setChecked(this.A0S).setVisible(this.A0U).setEnabled(this.A0T);
        boolean z = false;
        boolean z2 = false;
        if (this.A09 >= 1) {
            z2 = true;
        }
        enabled.setCheckable(z2).setTitleCondensed(this.A0K).setIcon(this.A0A);
        int i = this.A0D;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.A0O != null) {
            C12950jM r1 = this.A0V;
            if (!r1.A00.isRestricted()) {
                Object obj = r1.A01;
                if (obj == null) {
                    obj = r1.A00;
                    if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                        obj = ((ContextWrapper) obj).getBaseContext();
                        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                            obj = ((ContextWrapper) obj).getBaseContext();
                            if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                                obj = r1.A00(((ContextWrapper) obj).getBaseContext());
                            }
                        }
                    }
                    r1.A01 = obj;
                }
                menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC12930jK(obj, this.A0O));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        boolean z3 = menuItem instanceof AnonymousClass1ZT;
        if (this.A09 >= 2) {
            if (z3) {
                AnonymousClass1ZT r12 = (AnonymousClass1ZT) menuItem;
                r12.A02 = (r12.A02 & -5) | 4;
            } else if (menuItem instanceof AnonymousClass1ZW) {
                AnonymousClass1ZW r5 = (AnonymousClass1ZW) menuItem;
                try {
                    Method method = r5.A00;
                    if (method == null) {
                        method = r5.A01.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        r5.A00 = method;
                    }
                    method.invoke(r5.A01, Boolean.TRUE);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.A0N;
        if (str != null) {
            menuItem.setActionView((View) A00(str, C12950jM.A05, this.A0V.A03));
            z = true;
        }
        int i2 = this.A06;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        AbstractC14860n0 r13 = this.A0H;
        if (r13 != null) {
            if (menuItem instanceof AbstractMenuItemC07630Yu) {
                ((AbstractMenuItemC07630Yu) menuItem).AP8(r13);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A0I;
        boolean z4 = menuItem instanceof AbstractMenuItemC07630Yu;
        if (z4) {
            ((AbstractMenuItemC07630Yu) menuItem).AO5(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.A0L;
        if (z4) {
            ((AbstractMenuItemC07630Yu) menuItem).APE(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.A00;
        int i3 = this.A07;
        if (z4) {
            ((AbstractMenuItemC07630Yu) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.A01;
        int i4 = this.A0C;
        if (z4) {
            ((AbstractMenuItemC07630Yu) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.A0F;
        if (mode != null) {
            if (z4) {
                ((AbstractMenuItemC07630Yu) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.A0E;
        if (colorStateList == null) {
            return;
        }
        if (z4) {
            ((AbstractMenuItemC07630Yu) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
