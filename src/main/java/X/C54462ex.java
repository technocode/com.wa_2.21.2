package X;

import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ex  reason: invalid class name and case insensitive filesystem */
public class C54462ex extends AbstractC16300pa {
    public AbstractC69803In[] A00;
    public final /* synthetic */ C54482ez A01;

    public C54462ex(C54482ez r2, AbstractC69803In[] r3) {
        this.A01 = r2;
        this.A00 = r3;
        A04(true);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.length - 2;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C54472ey(this.A01, viewGroup);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r5, int i) {
        String A06;
        C54472ey r52 = (C54472ey) r5;
        int i2 = i + 2;
        r52.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(r52, i2, 6));
        boolean z = false;
        if (i2 == this.A01.A00) {
            z = true;
        }
        r52.A01.setSelected(z);
        C54482ez.A00(z, r52.A00);
        AbstractC69803In r1 = this.A00[i2];
        if (r1 instanceof AnonymousClass3Z4) {
            A06 = r1.A08.A06(R.string.gif_favorites_title);
        } else if (r1 instanceof C74843bd) {
            A06 = ((C74843bd) r1).A01;
        } else if (!(r1 instanceof C74833bc)) {
            A06 = r1.A08.A06(R.string.gif_recents_title);
        } else {
            A06 = r1.A08.A06(R.string.gif_trending_title);
        }
        r52.A01.setText(A06);
    }
}
