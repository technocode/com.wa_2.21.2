package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1bX  reason: invalid class name and case insensitive filesystem */
public class C30551bX implements AbstractC16660qA {
    public final /* synthetic */ RecyclerView A00;

    public C30551bX(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(AbstractC11910hD r10, C16360pg r11, C16360pg r12) {
        boolean z;
        int i;
        int i2;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            r10.A07(false);
            AbstractC30641bg r3 = (AbstractC30641bg) recyclerView.A0R;
            if (r3 != null) {
                if (r11 != null && ((i = r11.A00) != (i2 = r12.A00) || r11.A01 != r12.A01)) {
                    z = r3.A09(r10, i, r11.A01, i2, r12.A01);
                } else if (!(r3 instanceof C58912mk)) {
                    AnonymousClass240 r32 = (AnonymousClass240) r3;
                    r32.A0B(r10);
                    r10.A0H.setAlpha(0.0f);
                    r32.A06.add(r10);
                    z = true;
                } else {
                    C58912mk r33 = (C58912mk) r3;
                    r33.A0A(r10);
                    View view = r10.A0H;
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    r33.A06.add(r10);
                    z = true;
                }
                if (z) {
                    recyclerView.A0O();
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A01(AbstractC11910hD r11, C16360pg r12, C16360pg r13) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = this.A00;
        recyclerView.A0x.A09(r11);
        recyclerView.A0o(r11);
        r11.A07(false);
        AbstractC30641bg r4 = (AbstractC30641bg) recyclerView.A0R;
        if (r4 != null) {
            int i3 = r12.A00;
            int i4 = r12.A01;
            View view = r11.A0H;
            if (r13 == null) {
                i = view.getLeft();
            } else {
                i = r13.A00;
            }
            if (r13 == null) {
                i2 = view.getTop();
            } else {
                i2 = r13.A01;
            }
            if (!r11.A09() && (i3 != i || i4 != i2)) {
                view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
                z = r4.A09(r11, i3, i4, i, i2);
            } else if (!(r4 instanceof C58912mk)) {
                AnonymousClass240 r42 = (AnonymousClass240) r4;
                r42.A0B(r11);
                r42.A09.add(r11);
                z = true;
            } else {
                C58912mk r43 = (C58912mk) r4;
                r43.A0A(r11);
                r43.A09.add(r11);
                z = true;
            }
            if (z) {
                recyclerView.A0O();
                return;
            }
            return;
        }
        throw null;
    }
}
