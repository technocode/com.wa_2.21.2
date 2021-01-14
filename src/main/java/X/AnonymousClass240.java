package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.240  reason: invalid class name */
public class AnonymousClass240 extends AbstractC30641bg {
    public static TimeInterpolator A0B;
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A = new ArrayList();

    public static void A02(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AbstractC11910hD) list.get(size)).A0H.animate().cancel();
            } else {
                return;
            }
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
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r4 = r10 + r0
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r5 = r11 + r0
            r8.A0B(r9)
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
            java.util.ArrayList r0 = r8.A08
            X.0p6 r2 = new X.0p6
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass240.A09(X.0hD, int, int, int, int):boolean");
    }

    public void A0A() {
        if (!A06()) {
            A03();
        }
    }

    public final void A0B(AbstractC11910hD r3) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0B);
        A04(r3);
    }

    public final void A0C(List list, AbstractC11910hD r5) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C16000p5 r1 = (C16000p5) list.get(size);
                if (A0D(r1, r5) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public final boolean A0D(C16000p5 r3, AbstractC11910hD r4) {
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
