package X;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0jN  reason: invalid class name and case insensitive filesystem */
public class C12960jN {
    public long A00 = -1;
    public Interpolator A01;
    public AbstractC14990nD A02;
    public boolean A03;
    public final C30131am A04 = new AnonymousClass23L(this);
    public final ArrayList A05 = new ArrayList();

    public void A00() {
        if (this.A03) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((C06330Su) it.next()).A00();
            }
            this.A03 = false;
        }
    }

    public void A01() {
        View view;
        if (!this.A03) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                C06330Su r5 = (C06330Su) it.next();
                long j = this.A00;
                if (j >= 0) {
                    r5.A04(j);
                }
                Interpolator interpolator = this.A01;
                if (!(interpolator == null || (view = (View) r5.A01.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.A02 != null) {
                    r5.A06(this.A04);
                }
                r5.A01();
            }
            this.A03 = true;
        }
    }
}
