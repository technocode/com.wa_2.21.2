package X;

import android.view.View;
import java.util.List;

/* renamed from: X.0pT  reason: invalid class name and case insensitive filesystem */
public class C16230pT {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public List A08 = null;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;

    public View A00(C16480ps r7) {
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((AbstractC11910hD) this.A08.get(i)).A0H;
                AbstractC11910hD r2 = ((C16410pl) view.getLayoutParams()).A00;
                if (!r2.A09() && this.A01 == r2.A01()) {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = r7.A01(this.A01, Long.MAX_VALUE).A0H;
        this.A01 += this.A03;
        return view2;
    }

    public void A01(View view) {
        int A012;
        int size = this.A08.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                View view3 = ((AbstractC11910hD) this.A08.get(i2)).A0H;
                C16410pl r0 = (C16410pl) view3.getLayoutParams();
                if (view3 != view) {
                    AbstractC11910hD r1 = r0.A00;
                    if (!r1.A09() && (A012 = (r1.A01() - this.A01) * this.A03) >= 0 && A012 < i) {
                        view2 = view3;
                        if (A012 == 0) {
                            break;
                        }
                        i = A012;
                    }
                }
                i2++;
            } else if (view2 == null) {
                this.A01 = -1;
                return;
            }
        }
        this.A01 = ((C16410pl) view2.getLayoutParams()).A00.A01();
    }
}
