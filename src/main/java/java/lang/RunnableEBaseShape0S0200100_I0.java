package java.lang;

import X.AnonymousClass0PU;
import X.AnonymousClass1VI;
import X.C015308l;
import X.C015908r;
import X.C016308v;
import X.C02430Bz;
import android.content.ContentValues;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

public class RunnableEBaseShape0S0200100_I0 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape0S0200100_I0(Object obj, long j, Object obj2, int i) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = j;
        this.A02 = obj2;
    }

    public final void run() {
        AnonymousClass1VI r2;
        switch (this.A03) {
            case 0:
                ((C015308l) this.A01).A0A(this.A00, (Jid) this.A02);
                return;
            case 1:
                ((C015308l) this.A01).A0A(this.A00, (Jid) this.A02);
                return;
            case 2:
                ((C015308l) this.A01).A0A(this.A00, (Jid) this.A02);
                return;
            case 3:
                C02430Bz r5 = (C02430Bz) this.A01;
                DeviceJid deviceJid = (DeviceJid) this.A02;
                long j = this.A00;
                AnonymousClass1VI A022 = r5.A02(deviceJid);
                if (A022 != null) {
                    A022.A00 = j;
                    C015908r r22 = r5.A0D;
                    DeviceJid deviceJid2 = A022.A05;
                    C016308v r3 = r22.A04;
                    if (r3 != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("last_active", Long.valueOf(j));
                        r3.A02.A00().A00("devices", contentValues, "device_id = ?", new String[]{deviceJid2.getRawString()}, "setLastActiveTime/UPDATE_DEVICES");
                        synchronized (r3) {
                            AnonymousClass0PU r23 = r3.A00;
                            if (!(r23 == null || (r2 = (AnonymousClass1VI) r23.A00.get(deviceJid2)) == null)) {
                                r2.A00 = j;
                            }
                        }
                        r5.A07(A022);
                        return;
                    }
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Device presence: Jid -");
                sb.append(deviceJid);
                sb.append(", no device found ");
                Log.d(sb.toString());
                return;
            default:
                return;
        }
    }
}
