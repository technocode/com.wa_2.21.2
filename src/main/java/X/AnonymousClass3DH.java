package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3DH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DH implements AnonymousClass1O8 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1KW A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C61122sX A03;

    public /* synthetic */ AnonymousClass3DH(C61122sX r1, Activity activity, AnonymousClass1KW r3, UserJid userJid) {
        this.A03 = r1;
        this.A00 = activity;
        this.A01 = r3;
        this.A02 = userJid;
    }

    @Override // X.AnonymousClass1O8
    public final void AQl() {
        C61122sX r1 = this.A03;
        Activity activity = this.A00;
        AnonymousClass1KW r2 = this.A01;
        UserJid userJid = this.A02;
        AnonymousClass0GG r12 = r1.A00;
        UserJid of = UserJid.of(userJid);
        if (of != null) {
            r12.A07(activity, r2, of);
            return;
        }
        throw null;
    }
}
