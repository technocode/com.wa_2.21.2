package X;

import android.widget.TextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Dk  reason: invalid class name and case insensitive filesystem */
public class C68493Dk {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ AnonymousClass0MH A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ AbstractC61092sU A03;
    public final /* synthetic */ C61112sW A04;
    public final /* synthetic */ boolean A05 = true;

    public C68493Dk(C61112sW r2, AnonymousClass0MH r3, UserJid userJid, AbstractC61092sU r5, TextView textView) {
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = userJid;
        this.A03 = r5;
        this.A00 = textView;
    }

    public void A00() {
        AnonymousClass02M r4 = this.A04.A00;
        r4.A02.post(new RunnableEBaseShape1S0310000_I1(this, this.A00, this.A01, this.A05));
    }
}
