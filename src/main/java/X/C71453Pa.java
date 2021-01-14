package X;

import android.os.SystemClock;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Pa  reason: invalid class name and case insensitive filesystem */
public class C71453Pa extends AnonymousClass32V {
    public View A00;
    public final View A01;
    public final TextEmojiLabel A02;
    public final C48032Kq A03;
    public final C002701k A04;
    public final C05490Ot A05;
    public final AnonymousClass32U A06;

    public C71453Pa(C002701k r11, AnonymousClass02M r12, C06180Sc r13, AnonymousClass03P r14, AnonymousClass01X r15, C02560Co r16, C48032Kq r17, AbstractC71653Pu r18, AbstractC007503q r19) {
        super(r12, r14, r15, r16, r13, r18);
        this.A05 = (C05490Ot) r19;
        this.A04 = r11;
        this.A03 = r17;
        AnonymousClass32X A002 = AnonymousClass32X.A00(A01(), this.A05, true);
        this.A01 = A002;
        this.A02 = (TextEmojiLabel) A002.findViewById(R.id.message_text);
        this.A06 = A002.A00;
    }

    @Override // X.AnonymousClass32V
    public long A00() {
        return this.A06.A03;
    }

    @Override // X.AnonymousClass32V
    public void A04() {
        AnonymousClass32U r2 = this.A06;
        r2.A00 = 0;
        r2.A01 = SystemClock.elapsedRealtime();
        r2.A01();
        super.A05.A01();
    }

    @Override // X.AnonymousClass32V
    public void A05() {
        this.A06.A02();
    }
}
