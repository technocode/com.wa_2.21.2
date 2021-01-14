package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0pc  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16320pc {
    public void A00(int i, int i2) {
        if (this instanceof C71203Nz) {
            C71203Nz r0 = (C71203Nz) this;
            int i3 = i - 1;
            if (i3 > 0) {
                r0.A00.A02(i3);
            }
        } else if (this instanceof C40831tu) {
            C40841tv.A00(((C40831tu) this).A00, i, i2);
        } else if (this instanceof C30611bd) {
            C30611bd r4 = (C30611bd) this;
            RecyclerView recyclerView = r4.A00;
            recyclerView.A0r(null);
            C30391bH r3 = recyclerView.A0J;
            if (r3 == null) {
                throw null;
            } else if (i2 >= 1) {
                r3.A04.add(r3.A02(1, i, i2, null));
                r3.A00 |= 1;
                if (r3.A04.size() == 1) {
                    r4.A01();
                }
            }
        }
    }
}
