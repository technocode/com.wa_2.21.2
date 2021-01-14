package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.0Rt  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06110Rt {
    public Object A00;
    public boolean A01;

    public void A00() {
        if (!(this instanceof AnonymousClass1ZM)) {
            AnonymousClass0V6 r4 = (AnonymousClass0V6) this;
            AnonymousClass0TA r3 = r4.A04;
            if (r3.A04 == r4) {
                boolean z = r3.A0G;
                boolean z2 = r3.A0H;
                if (z || z2) {
                    r3.A06 = r4;
                    r3.A05 = r4.A00;
                } else {
                    r4.A00.AEx(r4);
                }
                r4.A00 = null;
                r3.A0H(false);
                ActionBarContextView actionBarContextView = r3.A09;
                if (actionBarContextView.A03 == null) {
                    actionBarContextView.removeAllViews();
                    actionBarContextView.A04 = null;
                    ((AbstractC06350Sx) actionBarContextView).A02 = null;
                }
                r3.A0B.A9m().sendAccessibilityEvent(32);
                r3.A0A.setHideOnContentScrollEnabled(r3.A0I);
                r3.A04 = null;
                return;
            }
            return;
        }
        AnonymousClass1ZM r2 = (AnonymousClass1ZM) this;
        if (!r2.A05) {
            r2.A05 = true;
            r2.A03.sendAccessibilityEvent(32);
            r2.A01.AEx(r2);
        }
    }

    public void A01() {
        if (!(this instanceof AnonymousClass1ZM)) {
            AnonymousClass0V6 r2 = (AnonymousClass0V6) this;
            if (r2.A04.A04 == r2) {
                AnonymousClass0T8 r1 = r2.A03;
                r1.A07();
                try {
                    r2.A00.AIh(r2, r1);
                } finally {
                    r1.A06();
                }
            }
        } else {
            AnonymousClass1ZM r22 = (AnonymousClass1ZM) this;
            r22.A01.AIh(r22, r22.A02);
        }
    }

    public void A02(View view) {
        if (!(this instanceof AnonymousClass1ZM)) {
            AnonymousClass0V6 r1 = (AnonymousClass0V6) this;
            r1.A04.A09.setCustomView(view);
            r1.A01 = new WeakReference(view);
            return;
        }
        AnonymousClass1ZM r12 = (AnonymousClass1ZM) this;
        r12.A03.setCustomView(view);
        r12.A04 = view != null ? new WeakReference(view) : null;
    }

    public void A03(CharSequence charSequence) {
        if (!(this instanceof AnonymousClass1ZM)) {
            ((AnonymousClass0V6) this).A04.A09.setSubtitle(charSequence);
        } else {
            ((AnonymousClass1ZM) this).A03.setSubtitle(charSequence);
        }
    }

    public void A04(CharSequence charSequence) {
        if (!(this instanceof AnonymousClass1ZM)) {
            ((AnonymousClass0V6) this).A04.A09.setTitle(charSequence);
        } else {
            ((AnonymousClass1ZM) this).A03.setTitle(charSequence);
        }
    }
}
