package X;

import com.whatsapp.util.Log;

/* renamed from: X.1IB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IB extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C26631Ls A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass1IB(C26631Ls r1, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void run() {
        C26631Ls r9 = this.A01;
        long j = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        AnonymousClass00D r4 = r9.A08;
        r4.A0O(5);
        r4.A00.edit().putLong("ext_dir_migration_rescan_time", r9.A05.A03() - j).commit();
        r9.A02(1, null);
        r4.A0b(z);
        Log.d("externaldirmigration/external dir rescanned");
        if (z2) {
            System.exit(0);
        }
    }
}
