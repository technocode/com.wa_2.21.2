package X;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3c0  reason: invalid class name and case insensitive filesystem */
public class C75033c0 extends AbstractC74123aA {
    public C09800dY A00;
    public boolean A01;
    public final AnonymousClass00D A02 = AnonymousClass00D.A00();
    public final AnonymousClass019 A03 = new C71693Py(this);
    public final AnonymousClass0AC A04 = AnonymousClass0AC.A00;

    public C75033c0(AbstractC007503q r2, AbstractC71533Pi r3) {
        super(r2, r3);
    }

    @Override // X.AbstractC659532f, X.AbstractC71663Pv
    public View A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A002 = super.A00(layoutInflater, viewGroup);
        C71703Pz A0R = A0R();
        A0R.A0A.removeAllViews();
        layoutInflater.inflate(R.layout.status_playback_page_info_outgoing, A0R.A0A, true);
        A0R.A05 = new C659432e(A0R.A08);
        A0R.A03 = (ImageView) A002.findViewById(R.id.status_playback_views_icon);
        A0R.A04 = (TextView) A002.findViewById(R.id.read_receipt_counter);
        A0R.A00 = A002.findViewById(R.id.delete);
        A0R.A01 = A002.findViewById(R.id.forward);
        A0R.A02 = A0R.A08.findViewById(R.id.list_container);
        return A002;
    }

    @Override // X.AbstractC659532f, X.AbstractC71663Pv
    public void A02() {
        super.A02();
        C659432e r2 = A0R().A05;
        r2.A08.A00();
        r2.A06.A00(r2.A05);
        AnonymousClass02M r0 = r2.A03;
        r0.A02.removeCallbacks(r2.A0E);
        r2.A00 = true;
        C09800dY r02 = this.A00;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A00 = null;
        }
        this.A04.A00(this.A03);
    }

    @Override // X.AbstractC659532f, X.AbstractC71663Pv
    public void A08(Rect rect) {
        View view = A0R().A02;
        if (view != null) {
            view.setPadding(rect.left, 0, rect.right, rect.bottom);
        }
        super.A08(rect);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005d, code lost:
        if (X.AnonymousClass0FI.A0u((X.AnonymousClass0ML) r1) == false) goto L_0x005f;
     */
    @Override // X.AbstractC659532f, X.AbstractC71663Pv
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75033c0.A09(android.view.View):void");
    }

    @Override // X.AbstractC74123aA, X.AbstractC71663Pv
    public void A0J() {
        if (this.A01) {
            super.A0J();
        }
    }

    @Override // X.AbstractC71663Pv
    public void A0K(int i) {
        super.A0K(i);
        if (i == 3) {
            A0R().A05.A02.sendAccessibilityEvent(8);
        }
    }

    public C71703Pz A0R() {
        AbstractC659732h r0 = ((AbstractC71663Pv) this).A01;
        if (r0 == null) {
            r0 = new C71703Pz();
            ((AbstractC71663Pv) this).A01 = r0;
        }
        return (C71703Pz) r0;
    }

    public final void A0S() {
        C09800dY r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C09800dY r2 = new C09800dY(this);
        this.A00 = r2;
        this.A0O.ANC(r2, new Void[0]);
    }
}
