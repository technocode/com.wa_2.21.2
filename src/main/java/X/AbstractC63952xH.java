package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.R;
import java.util.HashSet;

/* renamed from: X.2xH  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC63952xH {
    public int A00;
    public LayoutInflater A01;
    public AbstractC16450pp A02;
    public AnonymousClass3Z2 A03;
    public AbstractC63962xI A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final AbstractC16450pp A08 = new C69763Ii(this);
    public final AbstractC16450pp A09 = new C69773Ij(this);
    public final ViewPager A0A;
    public final AnonymousClass01X A0B;

    public AbstractC63952xH(Context context, AnonymousClass01X r4, ViewGroup viewGroup, int i, AbstractC16450pp r7) {
        this.A07 = context;
        this.A0B = r4;
        this.A01 = LayoutInflater.from(context);
        this.A0A = (ViewPager) viewGroup.findViewById(i);
        this.A02 = r7;
        this.A05 = C004302a.A00(context, R.color.emoji_popup_body);
        this.A06 = C004302a.A00(context, R.color.paletteElevationOverlay);
        this.A0A.A0F(new AnonymousClass3Ik(this, r4));
    }

    public int A00() {
        if (this.A0B.A0M()) {
            return this.A0A.getCurrentItem();
        }
        return (this.A03.A01.length - 1) - this.A0A.getCurrentItem();
    }

    public void A01(int i, boolean z) {
        int length;
        if (this.A0B.A0M()) {
            length = i;
        } else {
            length = (this.A03.A01.length - 1) - i;
        }
        AnonymousClass3Z2 r1 = this.A03;
        if (r1 != null && i >= 0 && i < r1.A01.length && this.A00 != length) {
            this.A0A.A0B(length, z);
        }
    }

    public void A02(AnonymousClass3Z2 r4) {
        this.A03 = r4;
        AbstractC16450pp r2 = this.A08;
        HashSet hashSet = r4.A05;
        if (!hashSet.contains(r2)) {
            hashSet.add(r2);
        }
        AnonymousClass3Z2 r22 = this.A03;
        AbstractC16450pp r1 = this.A09;
        if (!r22.A05.contains(r1)) {
            r22.A05.add(r1);
        }
        this.A0A.setAdapter(this.A03);
    }
}
