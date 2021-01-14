package X;

import android.graphics.Paint;
import com.google.android.search.verification.client.R;

/* renamed from: X.2a5  reason: invalid class name and case insensitive filesystem */
public class C51822a5 {
    public int A00;
    public final Paint A01 = new Paint();
    public final C002301g A02 = C002301g.A0K;
    public final AnonymousClass00G A03;
    public final AnonymousClass01X A04;

    public C51822a5(AnonymousClass00G r3, AnonymousClass01X r4) {
        this.A03 = r3;
        this.A04 = r4;
        int color = r3.A00.getResources().getColor(R.color.conversationRowSelectionColor);
        this.A00 = color;
        this.A01.setColor(color);
        this.A01.setStyle(Paint.Style.FILL);
        this.A01.setAntiAlias(true);
    }

    public boolean A00() {
        if (!(this instanceof C59272nN)) {
            return this.A04.A0M();
        }
        return this.A04.A02().A06;
    }
}
