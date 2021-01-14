package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3PY  reason: invalid class name */
public class AnonymousClass3PY extends AnonymousClass32V {
    public AnonymousClass2MM A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1MC A03;
    public final C002701k A04;
    public final C02770Dj A05;
    public final PhotoView A06;
    public final AnonymousClass0MI A07;
    public final AnonymousClass32U A08;
    public final C02580Cq A09;

    public AnonymousClass3PY(C002701k r14, AnonymousClass02M r15, C02780Dk r16, C02770Dj r17, AnonymousClass03P r18, AnonymousClass01X r19, C02560Co r20, C02580Cq r21, AnonymousClass1MC r22, AbstractC71653Pu r23, AbstractC007503q r24) {
        super(r15, r18, r19, r20, r16, r23);
        double sqrt;
        this.A04 = r14;
        this.A05 = r17;
        this.A09 = r21;
        this.A03 = r22;
        AnonymousClass0MI r2 = (AnonymousClass0MI) r24;
        this.A07 = r2;
        String A0v = r2.A0v();
        long j = 4500;
        if (AnonymousClass1VY.A0a(r2.A0G)) {
            j = 6750;
        } else if (!r2.A0n.A02) {
            int A0B = C28051Sr.A0B(A0v);
            if (A0B >= 89) {
                sqrt = 1.0d;
            } else {
                sqrt = Math.sqrt((double) (A0B / 89));
            }
            j = (long) ((sqrt * 3000.0d) + 4500.0d);
        }
        this.A08 = new AnonymousClass32U(j);
        C75013by r1 = new C75013by(this, A01(), r23);
        this.A06 = r1;
        ((PhotoView) r1).A01 = 0.2f;
        r1.A0Y = true;
        if (1 == 0) {
            r1.A02();
        }
        PhotoView photoView = this.A06;
        photoView.A0V = false;
        photoView.setIsLongpressEnabled(false);
        this.A06.setId(R.id.status_playback_image);
    }

    @Override // X.AnonymousClass32V
    public long A00() {
        return this.A08.A03;
    }

    @Override // X.AnonymousClass32V
    public void A04() {
        AnonymousClass32U r2 = this.A08;
        r2.A00 = 0;
        r2.A01 = SystemClock.elapsedRealtime();
        r2.A01();
        super.A05.A01();
    }

    @Override // X.AnonymousClass32V
    public void A05() {
        this.A08.A02();
        this.A02 = false;
    }
}
