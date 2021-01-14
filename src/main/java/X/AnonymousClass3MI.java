package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3MI  reason: invalid class name */
public class AnonymousClass3MI implements AnonymousClass09O {
    public final AnonymousClass02M A00;
    public final AnonymousClass09H A01;
    public final AnonymousClass3ME A02;

    public AnonymousClass3MI(AnonymousClass02M r1, AnonymousClass09H r2, AnonymousClass3ME r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A00(int i) {
        this.A00.A0E(new RunnableEBaseShape9S0200000_I1_4(this, new AnonymousClass0QJ(-1, null, null, null, i), 8));
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("sendScanContactQr/delivery-error");
        A00(408);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r3) {
        Log.e("sendScanContactQr/response-error");
        A00(C002001d.A0E(r3));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r11) {
        String str2;
        String str3;
        String str4;
        int i;
        AnonymousClass0M5 A0D = r11.A0D("qr");
        if (A0D != null) {
            String str5 = null;
            AnonymousClass0OS A0A = A0D.A0A("jid");
            if (A0A != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            AnonymousClass0OS A0A2 = A0D.A0A("notify");
            if (A0A2 != null) {
                str3 = A0A2.A03;
            } else {
                str3 = null;
            }
            UserJid nullable = UserJid.getNullable(str2);
            if (nullable == null) {
                Log.e("sendScanContactQr/error: invalid jid");
                A00(0);
                return;
            }
            AnonymousClass0OS A0A3 = A0D.A0A("type");
            if (A0A3 != null) {
                str4 = A0A3.A03;
            } else {
                str4 = null;
            }
            if ("contact".equals(str4)) {
                i = 0;
            } else if ("subscribe".equals(str4)) {
                i = 1;
            } else if ("message".equals(str4)) {
                AnonymousClass0M5 A0D2 = A0D.A0D("message");
                if (A0D2 != null) {
                    str5 = AnonymousClass0M5.A00(A0D2.A01);
                }
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder("sendScanContactQr/error: invalid type ");
                sb.append(str4);
                Log.e(sb.toString());
                A00(0);
                return;
            }
            Log.e("sendScanContactQr/success");
            this.A00.A0E(new RunnableEBaseShape9S0200000_I1_4(this, new AnonymousClass0QJ(i, nullable, str3, str5, 0), 8));
            return;
        }
        Log.e("sendScanContactQr/error: missing node");
        A00(0);
    }
}
