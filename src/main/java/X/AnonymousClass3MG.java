package X;

import com.whatsapp.util.Log;

/* renamed from: X.3MG  reason: invalid class name */
public class AnonymousClass3MG implements AnonymousClass09O {
    public final AnonymousClass02M A00;
    public final AnonymousClass09H A01;
    public final AnonymousClass3MF A02;

    public AnonymousClass3MG(AnonymousClass02M r1, AnonymousClass09H r2, AnonymousClass3MF r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("sendGetContactQrCode/delivery-error");
        this.A00.A0E(new RunnableEBaseShape0S1101000_I1(this, null, 0, 2));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r7) {
        Log.e("sendGetContactQrCode/response-error");
        this.A00.A0E(new RunnableEBaseShape0S1101000_I1(this, null, C002001d.A0E(r7), 2));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r7) {
        AnonymousClass0M5 A0D = r7.A0D("qr");
        String str2 = null;
        if (A0D == null || !"contact".equals(A0D.A0G("type", null)) || (str2 = A0D.A0G("code", null)) == null) {
            Log.e("sendGetContactQrCode/error: invalid response");
        } else {
            Log.e("sendGetContactQrCode/success");
        }
        this.A00.A0E(new RunnableEBaseShape0S1101000_I1(this, str2, 0, 2));
    }
}
