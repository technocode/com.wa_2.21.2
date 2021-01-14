package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.0KW  reason: invalid class name */
public class AnonymousClass0KW implements AnonymousClass09O {
    public static volatile AnonymousClass0KW A02;
    public AnonymousClass0KU A00;
    public final AnonymousClass09H A01;

    public AnonymousClass0KW(AnonymousClass09H r1) {
        this.A01 = r1;
    }

    public String A00(byte[] bArr) {
        Log.d("PrivateStatssSnder/requestToSign ");
        if (this.A00 == null) {
            Log.e("PrivateStatsSender/requestToSign need to set iq response listener first");
            return null;
        }
        AnonymousClass09H r9 = this.A01;
        String A022 = r9.A02();
        AnonymousClass0M5 r8 = new AnonymousClass0M5("blinded_credential", null, null, bArr);
        AnonymousClass0M5 r6 = new AnonymousClass0M5("sign_credential", new AnonymousClass0OS[]{new AnonymousClass0OS("version", "1", null, (byte) 0)}, r8);
        if (r9.A0B(239, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "privatestats", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r6), this, 32000)) {
            return A022;
        }
        Log.e("PrivateStatsSender/requestToSign failed to send iq request");
        return null;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        AnonymousClass008.A17("PrivateStatsSender/onDeliveryFailure iqId = ", str);
        AnonymousClass0KU r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                StringBuilder sb = new StringBuilder();
                sb.append("PrivateStats/onSendFailure iqId = ");
                sb.append(str);
                Log.d(sb.toString());
                if (!str.equalsIgnoreCase(r2.A0C)) {
                    Log.e("PrivateStats/onSendFailure mismatched iq id, reset");
                    r2.A04.A03(12);
                    r2.A02();
                    return;
                }
                r2.A03(5);
            }
        }
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r6) {
        StringBuilder sb = new StringBuilder("PrivateStatsSender/onError iqId = ");
        sb.append(str);
        Log.e(sb.toString());
        AnonymousClass0M5 A0E = r6.A0E("error");
        int A04 = A0E.A04("code");
        A0E.A0A("text");
        AnonymousClass0KU r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PrivateStats/onIqResponseError errCode = ");
                sb2.append(A04);
                Log.d(sb2.toString());
                if (!str.equalsIgnoreCase(r2.A0C)) {
                    Log.e("PrivateStats/onIqResponseError mismatched iq id, reset");
                    r2.A02();
                } else if (A04 == 500) {
                    r2.A03(3);
                } else {
                    Log.e("PrivateStats/onIqResponseError iq errors, stop attempting to send iq");
                    r2.A04.A03(11);
                    r2.A06(false, 2);
                }
            }
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r13) {
        Log.d("PrivateStatsSender/onSuccess");
        AnonymousClass0M5 A0E = r13.A0E("sign_credential");
        long A06 = A0E.A06("t");
        byte[] bArr = A0E.A0E("signed_credential").A01;
        byte[] bArr2 = A0E.A0E("acs_public_key").A01;
        AnonymousClass0M5 A0D = A0E.A0D("dleq_proof");
        if (A0D != null) {
            AnonymousClass0M5 A0E2 = A0D.A0E("c");
            AnonymousClass0M5 A0E3 = A0D.A0E("s");
            AnonymousClass0KU r5 = this.A00;
            if (r5 != null) {
                byte[] bArr3 = A0E2.A01;
                byte[] bArr4 = A0E3.A01;
                synchronized (r5) {
                    if (bArr3 != null) {
                        r5.A04.A05("dleq_proof_c", Base64.encodeToString(bArr3, 10));
                    }
                    if (bArr4 != null) {
                        r5.A04.A05("dleq_proof_s", Base64.encodeToString(bArr4, 10));
                    }
                }
            }
        }
        AnonymousClass0KU r52 = this.A00;
        if (r52 != null) {
            synchronized (r52) {
                Log.d("PrivateStatsToken/onReceiveSignedToken");
                if (!str.equalsIgnoreCase(r52.A0C)) {
                    Log.e("PrivateStatsToken/onReceiveSignedToken iq requests messed up, reset");
                    r52.A02();
                } else if (bArr2 == null || bArr == null) {
                    Log.d("PrivateStatsToken/onReceivedSignedToken public key or signed token is null");
                    r52.A04.A03(10);
                    r52.A06(false, 3);
                } else {
                    r52.A07.ANF(new RunnableEBaseShape0S0300100_I0(r52, bArr2, bArr, A06, 1));
                }
            }
        }
    }
}
