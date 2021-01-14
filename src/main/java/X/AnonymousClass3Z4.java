package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Z4  reason: invalid class name */
public class AnonymousClass3Z4 extends AbstractC69803In {
    public final Activity A00;
    public final C000300f A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00Y A03;
    public final AnonymousClass0Eg A04;
    public final C03400Ga A05;
    public final AbstractC49272Pt A06 = new AnonymousClass3Io(this);
    public final AnonymousClass0Gd A07;
    public final C03460Gi A08;
    public final AnonymousClass022 A09;
    public final AnonymousClass00T A0A;

    @Override // X.AbstractC63942xG
    public String getId() {
        return "gif_starred_page";
    }

    public AnonymousClass3Z4(Activity activity, AnonymousClass0Eg r3, AnonymousClass00T r4, C03400Ga r5, AnonymousClass00Y r6, C000300f r7, C03460Gi r8, AnonymousClass0Gd r9, LayoutInflater layoutInflater, AnonymousClass01X r11, AnonymousClass03P r12, AbstractC49292Px r13, AnonymousClass022 r14) {
        super(activity, layoutInflater, r11, r13);
        this.A00 = activity;
        this.A04 = r3;
        this.A0A = r4;
        this.A05 = r5;
        this.A03 = r6;
        this.A01 = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A02 = r12;
        this.A09 = r14;
    }

    @Override // X.AbstractC63942xG, X.AbstractC69803In
    public View AEg(ViewGroup viewGroup, int i) {
        View AEg = super.AEg(viewGroup, i);
        this.A07.A01(this.A06);
        return AEg;
    }
}
