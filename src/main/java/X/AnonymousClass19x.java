package X;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: X.19x  reason: invalid class name */
public final class AnonymousClass19x implements ServiceConnection {
    public volatile AnonymousClass1AA A00;
    public volatile boolean A01;
    public final /* synthetic */ AnonymousClass26M A02;

    public AnonymousClass19x(AnonymousClass26M r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[Catch:{ IllegalArgumentException -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[Catch:{ IllegalArgumentException -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19x.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C001801b.A1S("AnalyticsServiceConnection.onServiceDisconnected");
        AnonymousClass16M r2 = ((C242619s) this.A02).A00.A02;
        C001801b.A1Q(r2);
        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = new RunnableEBaseShape5S0200000_I1_0(componentName, this, 41);
        C001801b.A1Q(runnableEBaseShape5S0200000_I1_0);
        r2.A02.submit(runnableEBaseShape5S0200000_I1_0);
    }
}
