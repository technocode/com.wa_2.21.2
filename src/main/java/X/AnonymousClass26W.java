package X;

import android.content.SharedPreferences;

/* renamed from: X.26W  reason: invalid class name */
public final class AnonymousClass26W extends AbstractC35671kk {
    public long A00;
    public long A01 = -1;
    public SharedPreferences A02;
    public final AnonymousClass1AD A03 = new AnonymousClass1AD(this, ((Number) AnonymousClass1A5.A08.A00).longValue());

    public AnonymousClass26W(C242819u r4) {
        super(r4);
    }

    public final void A0D() {
        AnonymousClass16M.A00();
        A0C();
        if (((C242619s) this).A00.A03 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = this.A02.edit();
            edit.putLong("last_dispatch", currentTimeMillis);
            edit.apply();
            this.A01 = currentTimeMillis;
            return;
        }
        throw null;
    }
}
