package X;

import java.util.Random;

/* renamed from: X.0FV  reason: invalid class name */
public class AnonymousClass0FV {
    public static volatile AnonymousClass0FV A04;
    public final AnonymousClass00Y A00;
    public final AnonymousClass0FX A01;
    public final AnonymousClass0FW A02;
    public final Random A03 = new Random();

    public AnonymousClass0FV(AnonymousClass00Y r4, AnonymousClass00D r5, AnonymousClass0FW r6) {
        this.A00 = r4;
        this.A02 = r6;
        AnonymousClass0FX r1 = new AnonymousClass0FX();
        this.A01 = r1;
        r1.A04 = 0;
        r1.A07 = 0;
        r1.A08 = 0;
        r1.A06 = 0;
        r1.A05 = 3;
        String string = r5.A00.getString("direct_migration_session_id", null);
        if (string == null) {
            string = Long.toHexString(this.A03.nextLong());
            AnonymousClass008.A0m(r5, "direct_migration_session_id", string);
        }
        this.A01.A0A = string;
    }

    public static AnonymousClass0FV A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0FV.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0FV(AnonymousClass00Y.A00(), AnonymousClass00D.A00(), AnonymousClass0FW.A00());
                }
            }
        }
        return A04;
    }

    public void A01(int i) {
        this.A01.A05 = Integer.valueOf(i);
    }
}
