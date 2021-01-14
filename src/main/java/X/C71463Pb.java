package X;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.preference.WaFontListPreference;

/* renamed from: X.3Pb  reason: invalid class name and case insensitive filesystem */
public class C71463Pb extends AnonymousClass32V {
    public final FrameLayout A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass0GZ A02;
    public final C002701k A03;
    public final AbstractC007503q A04;
    public final AnonymousClass32U A05 = new AnonymousClass32U();

    public C71463Pb(C002701k r13, AnonymousClass0GZ r14, AnonymousClass02M r15, C06180Sc r16, AnonymousClass03P r17, AnonymousClass01X r18, C02560Co r19, AbstractC71653Pu r20, AbstractC007503q r21) {
        super(r15, r17, r18, r19, r16, r20);
        this.A03 = r13;
        this.A02 = r14;
        this.A04 = r21;
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(A01());
        this.A01 = textEmojiLabel;
        textEmojiLabel.setTextColor(C004302a.A00(A01(), R.color.white));
        this.A01.setGravity(17);
        this.A01.setTextSize(AbstractC51572Zg.A02(A01().getResources(), r18, WaFontListPreference.A02));
        int A022 = (int) AbstractC51572Zg.A02(A01().getResources(), r18, WaFontListPreference.A02);
        this.A01.setPadding(A022, A022, A022, A022);
        FrameLayout frameLayout = new FrameLayout(A01());
        this.A00 = frameLayout;
        frameLayout.addView(this.A01, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    @Override // X.AnonymousClass32V
    public long A00() {
        return this.A05.A03;
    }

    @Override // X.AnonymousClass32V
    public void A04() {
        AnonymousClass32U r2 = this.A05;
        r2.A00 = 0;
        r2.A01 = SystemClock.elapsedRealtime();
        r2.A01();
        super.A05.A01();
    }

    @Override // X.AnonymousClass32V
    public void A05() {
        this.A05.A02();
    }
}
