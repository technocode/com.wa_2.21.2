package X;

import com.whatsapp.AcceptInviteLinkActivity;

/* renamed from: X.1rF  reason: invalid class name and case insensitive filesystem */
public class C39281rF implements AnonymousClass1XH {
    public final /* synthetic */ AcceptInviteLinkActivity A00;

    public C39281rF(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A00 = acceptInviteLinkActivity;
    }

    @Override // X.AnonymousClass1XH
    public void AFY(int i) {
        AnonymousClass008.A0w("acceptlink/failed-to-get-group-photo/", i);
    }

    @Override // X.AnonymousClass1XH
    public void AGd(AnonymousClass02U r4, String str, String str2, String str3, byte[] bArr) {
        AnonymousClass02M r2 = ((ActivityC004702f) this.A00).A0F;
        r2.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, bArr, 2));
    }
}
