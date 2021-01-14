package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3a5  reason: invalid class name and case insensitive filesystem */
public class C74093a5 extends C71493Pe {
    public float A00;
    public int A01;
    public int A02 = 3;
    public int A03;
    public int A04;

    public C74093a5(C002701k r3, AnonymousClass02M r4, AnonymousClass00T r5, AnonymousClass088 r6, C02590Cr r7, C000300f r8, C02780Dk r9, C02770Dj r10, AnonymousClass03P r11, AnonymousClass01X r12, C02560Co r13, C02580Cq r14, AnonymousClass37E r15, AnonymousClass0D1 r16, AnonymousClass1MC r17, C660132l r18, AbstractC71653Pu r19, AbstractC007503q r20) {
        super(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        this.A09.setId(R.id.status_playback_gif);
    }

    @Override // X.AnonymousClass32V, X.C71493Pe
    public long A00() {
        int i = this.A02;
        if (i > 0) {
            return (long) (i * this.A03);
        }
        long A002 = super.A00();
        return ((long) A0I(A002)) * A002;
    }

    @Override // X.AnonymousClass32V, X.C71493Pe
    public void A04() {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        super.A04();
        AnonymousClass37M r1 = ((C71493Pe) this).A02;
        if (r1 != null) {
            r1.A01 = new AnonymousClass3PR(this);
        }
    }

    @Override // X.AnonymousClass32V, X.C71493Pe
    public void A05() {
        AnonymousClass37M r1 = ((C71493Pe) this).A02;
        if (r1 != null) {
            r1.A01 = null;
        }
        super.A05();
    }

    public final int A0I(long j) {
        if (((C71493Pe) this).A02 instanceof AnonymousClass3PV) {
            return 1;
        }
        if (j == 0) {
            return 3;
        }
        return (int) Math.max(3L, 6000 / j);
    }
}
