package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.1Zy  reason: invalid class name and case insensitive filesystem */
public class C29671Zy implements AnonymousClass0TO {
    public AnonymousClass0T8 A00;
    public AnonymousClass1ZT A01;
    public final /* synthetic */ Toolbar A02;

    @Override // X.AnonymousClass0TO
    public boolean A4H() {
        return false;
    }

    @Override // X.AnonymousClass0TO
    public void AEI(AnonymousClass0T8 r1, boolean z) {
    }

    @Override // X.AnonymousClass0TO
    public boolean AKe(AnonymousClass0TY r2) {
        return false;
    }

    @Override // X.AnonymousClass0TO
    public void AO1(AnonymousClass0TR r1) {
    }

    public C29671Zy(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    @Override // X.AnonymousClass0TO
    public boolean A2q(AnonymousClass0T8 r6, AnonymousClass1ZT r7) {
        Toolbar toolbar = this.A02;
        View view = toolbar.A0G;
        if (view instanceof AnonymousClass0YO) {
            ((AnonymousClass0YO) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A0G);
        toolbar.removeView(toolbar.A0H);
        toolbar.A0G = null;
        ArrayList arrayList = toolbar.A0b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                r7.A0N = false;
                r7.A0E.A0E(false);
                return true;
            }
        }
    }

    @Override // X.AnonymousClass0TO
    public boolean A4B(AnonymousClass0T8 r6, AnonymousClass1ZT r7) {
        Toolbar toolbar = this.A02;
        toolbar.A07();
        ViewParent parent = toolbar.A0H.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A0H);
            }
            toolbar.addView(toolbar.A0H);
        }
        View actionView = r7.getActionView();
        toolbar.A0G = actionView;
        this.A01 = r7;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A0G);
            }
            C08310ar r2 = new C08310ar();
            ((AnonymousClass0S5) r2).A00 = 8388611 | (toolbar.A00 & 112);
            r2.A00 = 2;
            toolbar.A0G.setLayoutParams(r2);
            toolbar.addView(toolbar.A0G);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (!(((C08310ar) childAt.getLayoutParams()).A00 == 2 || childAt == toolbar.A0O)) {
                toolbar.removeViewAt(childCount);
                toolbar.A0b.add(childAt);
            }
        }
        toolbar.requestLayout();
        r7.A0N = true;
        r7.A0E.A0E(false);
        View view = toolbar.A0G;
        if (view instanceof AnonymousClass0YO) {
            ((AnonymousClass0YO) view).onActionViewExpanded();
        }
        return true;
    }

    @Override // X.AnonymousClass0TO
    public void AAh(Context context, AnonymousClass0T8 r4) {
        AnonymousClass1ZT r0;
        AnonymousClass0T8 r1 = this.A00;
        if (!(r1 == null || (r0 = this.A01) == null)) {
            r1.A0L(r0);
        }
        this.A00 = r4;
    }

    @Override // X.AnonymousClass0TO
    public void AQr(boolean z) {
        AnonymousClass1ZT r4 = this.A01;
        if (r4 != null) {
            AnonymousClass0T8 r3 = this.A00;
            if (r3 != null) {
                int size = r3.size();
                for (int i = 0; i < size; i++) {
                    if (r3.getItem(i) == r4) {
                        return;
                    }
                }
            }
            A2q(r3, r4);
        }
    }
}
