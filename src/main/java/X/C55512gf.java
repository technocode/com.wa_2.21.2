package X;

import com.whatsapp.invites.ViewGroupInviteActivity;

/* renamed from: X.2gf  reason: invalid class name and case insensitive filesystem */
public class C55512gf implements AnonymousClass1XH {
    public final /* synthetic */ ViewGroupInviteActivity A00;

    public C55512gf(ViewGroupInviteActivity viewGroupInviteActivity) {
        this.A00 = viewGroupInviteActivity;
    }

    @Override // X.AnonymousClass1XH
    public void AFY(int i) {
        AnonymousClass008.A0w("ViewGroupInviteActivity/failed-to-get-group-photo/", i);
    }

    @Override // X.AnonymousClass1XH
    public void AGd(AnonymousClass02U r4, String str, String str2, String str3, byte[] bArr) {
        AnonymousClass02M r2 = ((ActivityC004702f) this.A00).A0F;
        r2.A02.post(new RunnableEBaseShape8S0200000_I1_3(this, bArr, 18));
    }
}
