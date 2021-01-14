package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* renamed from: X.23R  reason: invalid class name */
public class AnonymousClass23R extends AnonymousClass1ZO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public AnonymousClass1Za A06;
    public AnonymousClass1Zb A07;
    public AnonymousClass23Q A08;
    public C29531Zd A09;
    public RunnableEBaseShape5S0200000_I1_0 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final SparseBooleanArray A0F = new SparseBooleanArray();
    public final C29541Ze A0G = new C29541Ze(this);

    public AnonymousClass23R(Context context) {
        super(context);
    }

    @Override // X.AnonymousClass1ZO
    public View A00(AnonymousClass1ZT r4, View view, ViewGroup viewGroup) {
        View actionView = r4.getActionView();
        if (actionView == null || r4.A02()) {
            actionView = super.A00(r4, view, viewGroup);
        }
        int i = 0;
        if (r4.A0N) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean A01() {
        AnonymousClass0TU r0;
        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = this.A0A;
        if (runnableEBaseShape5S0200000_I1_0 == null || (r0 = super.A07) == null) {
            C29531Zd r02 = this.A09;
            if (r02 == null) {
                return false;
            }
            r02.A01();
            return true;
        }
        ((View) r0).removeCallbacks(runnableEBaseShape5S0200000_I1_0);
        this.A0A = null;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0.ABa() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r2 = this;
            X.1Zd r0 = r2.A09
            if (r0 == 0) goto L_0x0013
            X.1ZX r0 = r0.A03
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.ABa()
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23R.A02():boolean");
    }

    public boolean A03() {
        AnonymousClass0T8 r1;
        if (!this.A0D || A02() || (r1 = super.A05) == null || super.A07 == null || this.A0A != null) {
            return false;
        }
        r1.A05();
        if (r1.A08.isEmpty()) {
            return false;
        }
        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = new RunnableEBaseShape5S0200000_I1_0(new C29531Zd(this, super.A02, super.A05, this.A08), this, 0);
        this.A0A = runnableEBaseShape5S0200000_I1_0;
        ((View) super.A07).post(runnableEBaseShape5S0200000_I1_0);
        super.AKe(null);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ed, code lost:
        if (r15 != 0) goto L_0x00be;
     */
    @Override // X.AnonymousClass0TO
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A4H() {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23R.A4H():boolean");
    }

    @Override // X.AnonymousClass0TO
    public void AAh(Context context, AnonymousClass0T8 r8) {
        super.A02 = context;
        LayoutInflater.from(context);
        super.A05 = r8;
        Resources resources = context.getResources();
        if (!this.A0E) {
            boolean z = true;
            if (Build.VERSION.SDK_INT < 19) {
                z = true ^ ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            this.A0D = z;
        }
        int i = 2;
        this.A04 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.A01 = i;
        int i4 = this.A04;
        if (this.A0D) {
            if (this.A08 == null) {
                AnonymousClass23Q r2 = new AnonymousClass23Q(this, super.A03);
                this.A08 = r2;
                if (this.A0C) {
                    r2.setImageDrawable(this.A05);
                    this.A05 = null;
                    this.A0C = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A08.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.A08.getMeasuredWidth();
        } else {
            this.A08 = null;
        }
        this.A00 = i4;
        this.A02 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // X.AnonymousClass0TO
    public void AEI(AnonymousClass0T8 r2, boolean z) {
        A01();
        AnonymousClass1Za r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass0TR r02 = super.A06;
        if (r02 != null) {
            r02.AEI(r2, z);
        }
    }

    @Override // X.AnonymousClass0TO, X.AnonymousClass1ZO
    public boolean AKe(AnonymousClass0TY r8) {
        boolean z = false;
        if (!r8.hasVisibleItems()) {
            return false;
        }
        AnonymousClass0TY r2 = r8;
        while (true) {
            AnonymousClass0T8 r1 = r2.A00;
            if (r1 == super.A05) {
                break;
            }
            r2 = (AnonymousClass0TY) r1;
        }
        AnonymousClass1ZT r4 = r2.A01;
        ViewGroup viewGroup = (ViewGroup) super.A07;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof AbstractC13070jY) || ((AbstractC13070jY) childAt).getItemData() != r4) {
                    i++;
                } else if (childAt != null) {
                    int size = r8.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        MenuItem item = r8.getItem(i2);
                        if (item.isVisible() && item.getIcon() != null) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    AnonymousClass1Za r12 = new AnonymousClass1Za(this, super.A02, r8, childAt);
                    this.A06 = r12;
                    r12.A05 = z;
                    AnonymousClass1ZX r0 = r12.A03;
                    if (r0 != null) {
                        r0.A01(z);
                    }
                    if (r12.A04()) {
                        AnonymousClass0TR r02 = super.A06;
                        if (r02 != null) {
                            r02.AI7(r8);
                        }
                        return true;
                    }
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
            }
        }
        return false;
    }

    @Override // X.AnonymousClass0TO, X.AnonymousClass1ZO
    public void AQr(boolean z) {
        ArrayList arrayList;
        AnonymousClass0TU r1;
        int size;
        super.AQr(z);
        ((View) super.A07).requestLayout();
        AnonymousClass0T8 r0 = super.A05;
        if (r0 != null) {
            r0.A05();
            ArrayList arrayList2 = r0.A06;
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                arrayList2.get(i);
            }
        }
        AnonymousClass0T8 r02 = super.A05;
        if (r02 != null) {
            r02.A05();
            arrayList = r02.A08;
        } else {
            arrayList = null;
        }
        if (!this.A0D || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((AnonymousClass1ZT) arrayList.get(0)).A0N))) {
            AnonymousClass23Q r03 = this.A08;
            if (r03 != null && r03.getParent() == (r1 = super.A07)) {
                ((ViewGroup) r1).removeView(this.A08);
            }
        } else {
            AnonymousClass23Q r12 = this.A08;
            if (r12 == null) {
                r12 = new AnonymousClass23Q(this, super.A03);
                this.A08 = r12;
            }
            ViewGroup viewGroup = (ViewGroup) r12.getParent();
            if (viewGroup != super.A07) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.A08);
                }
                AnonymousClass23Q r2 = this.A08;
                C29561Zg r13 = new C29561Zg();
                ((C13310k0) r13).A01 = 16;
                r13.A04 = true;
                ((ViewGroup) super.A07).addView(r2, r13);
            }
        }
        ((ActionMenuView) super.A07).A0B = this.A0D;
    }
}
