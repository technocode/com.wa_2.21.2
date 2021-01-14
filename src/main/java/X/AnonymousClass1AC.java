package X;

import android.content.BroadcastReceiver;

/* renamed from: X.1AC  reason: invalid class name */
public class AnonymousClass1AC extends BroadcastReceiver {
    public static final String A03 = AnonymousClass1AC.class.getName();
    public boolean A00;
    public boolean A01;
    public final C242819u A02;

    public AnonymousClass1AC(C242819u r1) {
        C001801b.A1Q(r1);
        this.A02 = r1;
    }

    public final void A00() {
        if (this.A00) {
            C242819u r1 = this.A02;
            AnonymousClass26U r2 = r1.A07;
            C242819u.A01(r2);
            r2.A03("Unregistering connectivity change receiver");
            this.A00 = false;
            this.A01 = false;
            try {
                r1.A00.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                C242819u.A01(r2);
                r2.A09("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r0.isConnected() == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AC.onReceive(android.content.Context, android.content.Intent):void");
    }
}
