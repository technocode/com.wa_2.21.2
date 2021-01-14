package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Executor;

/* renamed from: X.0Ex  reason: invalid class name and case insensitive filesystem */
public class C03130Ex {
    public static volatile C03130Ex A03;
    public final C03140Ey A00 = new C03140Ey();
    public final AnonymousClass0DK A01;
    public final Executor A02;

    public C03130Ex(AnonymousClass0DK r2, AnonymousClass00T r3) {
        this.A01 = r2;
        this.A02 = r3.ACN();
    }

    public static C03130Ex A00() {
        if (A03 == null) {
            synchronized (C03130Ex.class) {
                if (A03 == null) {
                    A03 = new C03130Ex(AnonymousClass0DK.A00(), C002101e.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b9, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0PY A01() {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03130Ex.A01():X.0PY");
    }

    public final void A02(DeviceJid deviceJid) {
        this.A02.execute(new RunnableEBaseShape2S0200000_I0_1(this, deviceJid, 49));
    }

    public void A03(DeviceJid deviceJid, int i) {
        AnonymousClass00E.A00();
        this.A01.A9x().A0D("DELETE FROM msg_history_sync WHERE device_id=? AND sync_type=?", new String[]{deviceJid.getRawString(), String.valueOf(i)}, "MessageHistorySyncTable.DELETE_SYNC_STATE_BY_DEVICE_AND_TYPE");
        A02(deviceJid);
    }
}
