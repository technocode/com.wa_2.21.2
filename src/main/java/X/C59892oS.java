package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.2oS  reason: invalid class name and case insensitive filesystem */
public class C59892oS extends AbstractC69803In {
    public final Activity A00;
    public final AnonymousClass0Eg A01;
    public final C03400Ga A02;
    public final AbstractC49272Pt A03 = new C54582fA(this);
    public final AnonymousClass0Gd A04;
    public final AnonymousClass0Gb A05;
    public final AnonymousClass00T A06;

    @Override // X.AbstractC63942xG
    public String getId() {
        return "recent_gif_page";
    }

    public C59892oS(Activity activity, AnonymousClass0Eg r3, AnonymousClass00T r4, C03400Ga r5, AnonymousClass0Gb r6, AnonymousClass0Gd r7, LayoutInflater layoutInflater, AnonymousClass01X r9, AbstractC49292Px r10) {
        super(activity, layoutInflater, r9, r10);
        this.A00 = activity;
        this.A01 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A05 = r6;
        this.A04 = r7;
    }

    public void A02(String str) {
        C59902oT r4 = (C59902oT) A00();
        int i = -1;
        for (int i2 = 0; i2 < r4.A02.size(); i2++) {
            if (((C49232Po) r4.A02.get(i2)).A04.equals(str)) {
                i = i2;
            }
        }
        if (i != -1) {
            List list = r4.A02;
            list.remove(list.get(i));
            ((AbstractC16300pa) r4).A01.A00();
        }
    }

    @Override // X.AbstractC63942xG, X.AbstractC69803In
    public View AEg(ViewGroup viewGroup, int i) {
        View AEg = super.AEg(viewGroup, i);
        this.A04.A01(this.A03);
        return AEg;
    }
}
