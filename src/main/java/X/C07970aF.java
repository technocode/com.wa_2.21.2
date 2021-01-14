package X;

import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.0aF  reason: invalid class name and case insensitive filesystem */
public class C07970aF implements AnonymousClass0XW {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public C07970aF(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
        if (i == 0) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            PagerSlidingTabStrip.A00(pagerSlidingTabStrip, pagerSlidingTabStrip.A0N.getCurrentItem(), 0);
        }
        AnonymousClass0XW r0 = this.A00.A0M;
        if (r0 != null) {
            r0.AIF(i);
        }
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
        pagerSlidingTabStrip.A01 = i;
        pagerSlidingTabStrip.A00 = f;
        PagerSlidingTabStrip.A00(pagerSlidingTabStrip, i, (int) (((float) pagerSlidingTabStrip.A0L.getChildAt(i).getWidth()) * f));
        pagerSlidingTabStrip.invalidate();
        AnonymousClass0XW r0 = pagerSlidingTabStrip.A0M;
        if (r0 != null) {
            r0.AIG(i, f, i2);
        }
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        AnonymousClass0XW r0 = this.A00.A0M;
        if (r0 != null) {
            r0.AIH(i);
        }
    }
}
