package X;

import com.whatsapp.util.Log;

/* renamed from: X.0I3  reason: invalid class name */
public class AnonymousClass0I3 {
    public final AnonymousClass00S A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass09H A03;
    public final AnonymousClass00T A04;

    public AnonymousClass0I3(AnonymousClass00S r1, AnonymousClass00G r2, AnonymousClass00T r3, AnonymousClass09H r4, AnonymousClass00D r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public void A00() {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest");
        String A0H = this.A02.A0H();
        if (!C003701u.A0E(A0H)) {
            byte[] A0B = C007603r.A0B();
            AnonymousClass09H r11 = this.A03;
            String A022 = r11.A02();
            AnonymousClass0M5 r7 = new AnonymousClass0M5("token", null, null, A0B);
            r11.A07(226, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", "s.whatsapp.net", null, (byte) 0), new AnonymousClass0OS("xmlns", "w:auth:backup:token", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("id", A022, null, (byte) 0)}, r7), new C70813Mm(this, A0B, A0H), 32000);
        }
    }
}
