package X;

import android.content.ContentValues;

/* renamed from: X.0C6  reason: invalid class name */
public class AnonymousClass0C6 {
    public static volatile AnonymousClass0C6 A04;
    public final C000300f A00;
    public final C02420Bx A01;
    public final C02410Bw A02;
    public final AnonymousClass0C7 A03;

    public AnonymousClass0C6(AnonymousClass00G r3, C000300f r4, AnonymousClass04q r5, C02410Bw r6, C02420Bx r7) {
        this.A03 = new AnonymousClass0C7(r3.A00, r5);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r7;
    }

    public static AnonymousClass0C6 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0C6.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0C6(AnonymousClass00G.A01, C000300f.A00(), AnonymousClass04q.A00(), C02410Bw.A00(), C02420Bx.A00());
                }
            }
        }
        return A04;
    }

    public void A01(AnonymousClass0K4 r5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("browser_id", r5.A0I);
        contentValues.put("secret", r5.A0B);
        contentValues.put("token", r5.A0C);
        contentValues.put("os", r5.A09);
        contentValues.put("browser_type", r5.A08);
        contentValues.put("login_time", Long.valueOf(r5.A07));
        contentValues.put("last_active", Long.valueOf(r5.A05));
        contentValues.put("timeout", Boolean.valueOf(r5.A0E));
        contentValues.put("syncd_release", Integer.valueOf(r5.A03));
        this.A03.A02().A05("sessions", contentValues, "setSessionInfo/REPLACE_SESSIONS");
    }
}
