package X;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.0G7  reason: invalid class name */
public class AnonymousClass0G7 implements AnonymousClass0G6 {
    public BroadcastReceiver A00;
    public Handler A01;
    public final AnonymousClass04j A02;
    public final C03270Fn A03;
    public final AnonymousClass00G A04;
    public final C03160Fa A05;

    public AnonymousClass0G7(AnonymousClass00G r1, C03160Fa r2, C03270Fn r3, AnonymousClass04j r4) {
        this.A04 = r1;
        this.A05 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (X.AnonymousClass04j.A01() == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r9) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0G7.A00(boolean):void");
    }

    @Override // X.AnonymousClass0G6
    public long A5m() {
        NetworkInfo A042 = this.A02.A04();
        if (A042 != null) {
            return (long) A042.getType();
        }
        return -1;
    }

    @Override // X.AnonymousClass0G6
    public void AMr() {
        Handler handler = this.A01;
        if (handler != null) {
            handler.post(new RunnableEBaseShape3S0100000_I0_3(this, 23));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0G6
    public void AQ5(Handler handler) {
        this.A01 = handler;
        Application application = this.A04.A00;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        C08930c0 r1 = new C08930c0(this);
        this.A00 = r1;
        if (application.registerReceiver(r1, intentFilter, null, handler) == null && !handler.post(new RunnableEBaseShape3S0100000_I0_3(this, 22))) {
            Log.w("failed to post checkNetworkState isRetry: false");
        }
    }

    @Override // X.AnonymousClass0G6
    public void AQG() {
        this.A04.A00.unregisterReceiver(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.AnonymousClass0G6
    public boolean isConnected() {
        NetworkInfo A042 = this.A02.A04();
        return A042 != null && A042.isConnected();
    }
}
