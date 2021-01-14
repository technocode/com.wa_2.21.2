package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ew  reason: invalid class name and case insensitive filesystem */
public class C54452ew extends AbstractC63952xH {
    public final Activity A00;
    public final C000300f A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00Y A03;
    public final AnonymousClass0Eg A04;
    public final AbstractC49272Pt A05 = new C54442ev(this);
    public final AnonymousClass0Gd A06;
    public final C54482ez A07;
    public final AbstractC49282Pv A08;
    public final AbstractC49292Px A09;
    public final C59892oS A0A;
    public final AnonymousClass3Z4 A0B;
    public final AnonymousClass022 A0C;
    public final AbstractC69803In[] A0D;

    public C54452ew(Activity activity, AnonymousClass0Eg r31, AnonymousClass00T r32, C03400Ga r33, AnonymousClass0Gb r34, AnonymousClass00Y r35, C000300f r36, C03460Gi r37, AnonymousClass0Gd r38, AnonymousClass03P r39, AnonymousClass01X r40, AbstractC49282Pv r41, AnonymousClass022 r42, ViewGroup viewGroup, AbstractC16450pp r44, AbstractC49292Px r45) {
        super(activity, r40, viewGroup, R.id.gif_pager, r44);
        this.A00 = activity;
        this.A04 = r31;
        this.A03 = r35;
        this.A01 = r36;
        this.A06 = r38;
        this.A02 = r39;
        this.A08 = r41;
        this.A09 = r45;
        this.A0C = r42;
        LayoutInflater layoutInflater = super.A01;
        C59892oS r3 = new C59892oS(activity, r31, r32, r33, r34, r38, layoutInflater, r40, r45);
        this.A0A = r3;
        AnonymousClass3Z4 r15 = new AnonymousClass3Z4(activity, r31, r32, r33, r35, r36, r37, r38, layoutInflater, r40, r39, r45, r42);
        this.A0B = r15;
        AbstractC69803In[] r2 = new AbstractC69803In[8];
        this.A0D = r2;
        r2[0] = r3;
        r2[1] = r15;
        r2[2] = new C74833bc(activity, r31, r35, r36, layoutInflater, r39, r40, r41, r45, r42);
        r2[3] = A03(R.string.gif_search_lol);
        this.A0D[4] = A03(R.string.gif_search_love);
        this.A0D[5] = A03(R.string.gif_search_sad);
        this.A0D[6] = A03(R.string.gif_search_happy);
        this.A0D[7] = A03(R.string.gif_search_dancing);
        A02(new AnonymousClass3Z2(r40, this.A0D));
        C54482ez r22 = new C54482ez(super.A01, viewGroup, this.A0D);
        this.A07 = r22;
        AbstractC63962xI r1 = super.A04;
        if (r1 != null) {
            r1.AO6(null);
        }
        super.A04 = r22;
        r22.A0A = this;
        r22.AIH(A00());
        A01(0, true);
        r38.A01(this.A05);
    }

    public final C74843bd A03(int i) {
        AnonymousClass01X r7 = super.A0B;
        return new C74843bd(this.A00, this.A04, this.A03, this.A01, super.A01, this.A02, r7, this.A08, this.A09, this.A0C, r7.A06(i));
    }
}
