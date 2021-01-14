package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2mk  reason: invalid class name and case insensitive filesystem */
public final class C58912mk extends AbstractC30641bg {
    public static final TimeInterpolator A0B = new ValueAnimator().getInterpolator();
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();
    public List A02 = new ArrayList();
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();
    public List A05 = new ArrayList();
    public List A06 = new ArrayList();
    public List A07 = new ArrayList();
    public List A08 = new ArrayList();
    public List A09 = new ArrayList();
    public List A0A = new ArrayList();

    public C58912mk() {
        ((AbstractC16370ph) this).A00 = 240;
        super.A01 = 240;
        super.A02 = 240;
        super.A03 = 240;
        ((AbstractC30641bg) this).A00 = false;
    }

    public static final void A02(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass0Q7.A0E(((AbstractC11910hD) list.get(size)).A0H).A00();
        }
    }

    @Override // X.AbstractC16370ph
    public boolean A08(AbstractC11910hD r3, List list) {
        return !list.isEmpty() || super.A08(r3, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r1 != 0) goto L_0x002a;
     */
    @Override // X.AbstractC30641bg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(X.AbstractC11910hD r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r3 = r9
            android.view.View r2 = r9.A0H
            float r1 = (float) r10
            float r0 = r2.getTranslationX()
            float r0 = r0 + r1
            int r4 = (int) r0
            float r1 = (float) r11
            float r0 = r2.getTranslationY()
            float r0 = r0 + r1
            int r5 = (int) r0
            r8.A0A(r9)
            r6 = r12
            int r0 = r12 - r4
            r7 = r13
            int r1 = r13 - r5
            if (r0 != 0) goto L_0x0023
            if (r1 != 0) goto L_0x002a
            r8.A05(r9)
            r0 = 0
            return r0
        L_0x0023:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x002f:
            java.util.List r0 = r8.A08
            X.2Gf r2 = new X.2Gf
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58912mk.A09(X.0hD, int, int, int, int):boolean");
    }

    public final void A0A(AbstractC11910hD r3) {
        r3.A0H.animate().setInterpolator(A0B);
        A04(r3);
    }

    public final void A0B(List list, AbstractC11910hD r5) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C47032Ge r1 = (C47032Ge) list.get(size);
                if (A0C(r1, r5) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public final boolean A0C(C47032Ge r3, AbstractC11910hD r4) {
        if (r3.A04 == r4) {
            r3.A04 = null;
        } else if (r3.A05 != r4) {
            return false;
        } else {
            r3.A05 = null;
        }
        View view = r4.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A05(r4);
        return true;
    }
}
