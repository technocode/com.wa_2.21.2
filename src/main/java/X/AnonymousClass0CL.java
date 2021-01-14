package X;

import android.os.Message;
import com.whatsapp.Statistics$Data;
import com.whatsapp.util.Log;

/* renamed from: X.0CL  reason: invalid class name */
public class AnonymousClass0CL {
    public static volatile AnonymousClass0CL A05;
    public AnonymousClass0QV A00;
    public final C003301q A01;
    public final AnonymousClass00C A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00G A04;

    public AnonymousClass0CL(AnonymousClass00G r1, AnonymousClass00S r2, AnonymousClass00C r3, C003301q r4) {
        this.A04 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public static AnonymousClass0CL A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0CL.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0CL(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass00C.A00(), C003301q.A02);
                }
            }
        }
        return A05;
    }

    public Statistics$Data A01() {
        Statistics$Data statistics$Data;
        AnonymousClass0QV r1 = this.A00;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        try {
            r1.A02.await();
        } catch (InterruptedException e) {
            Log.e("statistics/waitForStatsInit exception waiting", e);
        }
        AnonymousClass0QV r2 = this.A00;
        synchronized (r2) {
            statistics$Data = new Statistics$Data(r2.A00);
        }
        return statistics$Data;
    }

    public final void A02() {
        this.A00.removeMessages(1);
        this.A00.sendEmptyMessageDelayed(1, 1000);
    }

    public void A03(int i, int i2) {
        AnonymousClass0QV r1 = this.A00;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        Message.obtain(r1, 3, i2, i).sendToTarget();
        A02();
    }

    public void A04(int i, int i2) {
        AnonymousClass0QV r1 = this.A00;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        if (i >= 0) {
            Message.obtain(r1, 2, i2, i).sendToTarget();
            A02();
        }
    }

    public void A05(long j, int i) {
        AnonymousClass0QV r4 = this.A00;
        boolean z = false;
        if (r4 != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        if (j >= 0) {
            Message obtain = Message.obtain(r4, 5, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A02();
        }
    }

    public void A06(long j, int i) {
        AnonymousClass0QV r4 = this.A00;
        boolean z = false;
        if (r4 != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        if (j >= 0) {
            Message obtain = Message.obtain(r4, 4, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A02();
        }
    }

    public void A07(boolean z) {
        AnonymousClass0QV r2 = this.A00;
        boolean z2 = false;
        if (r2 != null) {
            z2 = true;
        }
        AnonymousClass00E.A07(z2);
        Message.obtain(r2, 8, z ? 1 : 0, 0).sendToTarget();
        A02();
    }
}
