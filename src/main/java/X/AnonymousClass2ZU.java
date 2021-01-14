package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ZU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZU implements AnonymousClass1O8 {
    public final /* synthetic */ C59212nG A00;
    public final /* synthetic */ AbstractC007503q A01;

    public /* synthetic */ AnonymousClass2ZU(C59212nG r1, AbstractC007503q r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1O8
    public final void AQl() {
        C59212nG r0 = this.A00;
        AbstractC007503q r1 = this.A01;
        AnonymousClass0GG r3 = r0.A0B;
        Activity A002 = C02780Dk.A00(r0.getContext());
        UserJid userJid = r1.A0F.A09;
        if (userJid != null) {
            r3.A07(A002, null, UserJid.of(userJid));
            return;
        }
        throw null;
    }
}
