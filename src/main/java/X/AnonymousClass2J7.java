package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.jid.Jid;

/* renamed from: X.2J7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2J7 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass2J9 A00;
    public final /* synthetic */ C006903j A01;
    public final /* synthetic */ AnonymousClass098 A02;
    public final /* synthetic */ C007003k A03;
    public final /* synthetic */ C02360Br A04;
    public final /* synthetic */ Runnable A05;

    public /* synthetic */ AnonymousClass2J7(AnonymousClass2J9 r1, C007003k r2, AnonymousClass098 r3, C006903j r4, C02360Br r5, Runnable runnable) {
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A05 = runnable;
    }

    public final void onClick(View view) {
        AnonymousClass2J9 r5 = this.A00;
        C007003k r1 = this.A03;
        AnonymousClass098 r4 = this.A02;
        C006903j r3 = this.A01;
        C02360Br r6 = this.A04;
        Runnable runnable = this.A05;
        Jid A022 = r1.A02(AnonymousClass02N.class);
        if (A022 != null) {
            AnonymousClass02N r8 = (AnonymousClass02N) A022;
            r4.A04(r8, r5.A0J, 4);
            r4.A04.A00(r8, 1);
            if (r3.A05(r8) != null) {
                r6.A01(9, r8, 0, 0);
            }
            runnable.run();
            return;
        }
        throw null;
    }
}
