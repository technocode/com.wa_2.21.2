package X;

import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3UL  reason: invalid class name */
public class AnonymousClass3UL extends AnonymousClass0JW {
    public AnonymousClass0FS A00 = AnonymousClass0FS.A00();
    public final /* synthetic */ VoipActivityV2 A01;

    public AnonymousClass3UL(VoipActivityV2 voipActivityV2) {
        this.A01 = voipActivityV2;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        AnonymousClass0QM A02 = this.A00.A02(((Long[]) objArr)[0].longValue());
        if (super.A00.isCancelled()) {
            return null;
        }
        return A02;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass0QM r3 = (AnonymousClass0QM) obj;
        VoipActivityV2 voipActivityV2 = this.A01;
        voipActivityV2.finish();
        if (r3 != null) {
            voipActivityV2.A1j.A04(r3, voipActivityV2);
        }
    }
}
