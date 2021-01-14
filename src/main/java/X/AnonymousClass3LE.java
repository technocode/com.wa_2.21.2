package X;

import com.whatsapp.SettingsPrivacy;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3LE  reason: invalid class name */
public class AnonymousClass3LE implements AnonymousClass09O {
    public final C40401tD A00;
    public final AnonymousClass09H A01;

    public AnonymousClass3LE(AnonymousClass09H r1, C40401tD r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void A00() {
        Log.i("PrivacySettingsProtocolHelper/sendGetPrivacySettingsRequest");
        AnonymousClass09H r8 = this.A01;
        String A02 = r8.A02();
        AnonymousClass0M5 r5 = new AnonymousClass0M5("privacy", null, null, null);
        r8.A0B(70, A02, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A02, null, (byte) 0), new AnonymousClass0OS("xmlns", "privacy", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0)}, r5), this, 0);
    }

    public void A01(String str, String str2) {
        Log.i("PrivacySettingsProtocolHelper/sendSetPrivacySettingsRequest");
        AnonymousClass09H r10 = this.A01;
        String A02 = r10.A02();
        AnonymousClass0M5 r4 = new AnonymousClass0M5("privacy", null, new AnonymousClass0M5[]{new AnonymousClass0M5("category", new AnonymousClass0OS[]{new AnonymousClass0OS("name", str, null, (byte) 0), new AnonymousClass0OS("value", str2, null, (byte) 0)}, null, null)}, null);
        r10.A0B(69, A02, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("id", A02, null, (byte) 0), new AnonymousClass0OS("xmlns", "privacy", null, (byte) 0)}, r4), this, 0);
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        AnonymousClass008.A19("PrivacySettingsProtocolHelper/onDeliveryFailure iqid=", str);
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r3) {
        Log.e("PrivacySettingsProtocolHelper/onError");
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r11) {
        AnonymousClass0M5 A0B = r11.A0B();
        AnonymousClass0M5.A01(A0B, "privacy");
        HashMap hashMap = new HashMap();
        AnonymousClass0M5[] r8 = A0B.A03;
        if (r8 != null) {
            for (AnonymousClass0M5 r6 : r8) {
                AnonymousClass0M5.A01(r6, "category");
                String A0G = r6.A0G("name", null);
                String A0G2 = r6.A0G("value", null);
                if ("error".equals(A0G2)) {
                    AnonymousClass0M5 A0B2 = r6.A0B();
                    AnonymousClass0M5.A01(A0B2, "error");
                    A0G2 = A0B2.A0G("code", null);
                }
                hashMap.put(A0G, A0G2);
            }
        }
        C40401tD r2 = this.A00;
        AbstractC03810Hu r1 = r2.A00;
        if (r1 != null) {
            ((AnonymousClass3LC) r1).A00(3);
        }
        AnonymousClass0I4 r3 = r2.A01;
        SettingsPrivacy.A07(r3.A00, r3.A01, r3.A02, r3, hashMap);
    }
}
