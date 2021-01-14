package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.0b9  reason: invalid class name and case insensitive filesystem */
public class C08460b9 extends AnonymousClass0YD implements AnonymousClass0YF {
    public final C64862yv[] A00 = new C64862yv[2];
    public final /* synthetic */ AnonymousClass1Y6 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08460b9(AnonymousClass1Y6 r2, AnonymousClass0LW r3) {
        super(r3);
        this.A01 = r2;
    }

    @Override // X.AnonymousClass0YF
    public View A7v(int i) {
        C64862yv[] r4 = this.A00;
        if (r4[i] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A04;
            C64862yv r2 = new C64862yv(LayoutInflater.from(pagerSlidingTabStrip.getContext()).inflate(R.layout.qr_tab, (ViewGroup) pagerSlidingTabStrip, false));
            CharSequence A04 = A04(i);
            if (A04 != null) {
                r2.A01.setText(A04);
                r4[i] = r2;
            } else {
                throw null;
            }
        }
        return r4[i].A00;
    }
}
