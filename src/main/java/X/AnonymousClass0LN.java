package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

/* renamed from: X.0LN  reason: invalid class name */
public final class AnonymousClass0LN extends BroadcastReceiver {
    public final C003301q A00;
    public final AnonymousClass04j A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass0ET A03;
    public final AnonymousClass02H A04;
    public final WhatsAppLibLoader A05;

    public AnonymousClass0LN(AnonymousClass00S r3, AnonymousClass00T r4, AnonymousClass0ET r5, WhatsAppLibLoader whatsAppLibLoader, AnonymousClass04j r7, C003301q r8) {
        this.A02 = r3;
        this.A03 = r5;
        this.A05 = whatsAppLibLoader;
        this.A01 = r7;
        this.A00 = r8;
        this.A04 = new AnonymousClass02H(r4, false);
    }

    public void A00(Context context) {
        AnonymousClass0JF r2;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 24) {
            intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        }
        if (context.registerReceiver(this, intentFilter) == null) {
            Log.i("CONNECTIVITY_ACTION doesn't return a sticky intent, update voip network medium directly");
            WhatsAppLibLoader whatsAppLibLoader = this.A05;
            if (whatsAppLibLoader.A04()) {
                this.A04.execute(new RunnableEBaseShape0S0100000_I0_0(this, 43));
            }
            if (whatsAppLibLoader.A04()) {
                this.A04.execute(new RunnableEBaseShape0S0100000_I0_0(this, 42));
            }
        }
        NetworkInfo A042 = this.A01.A04();
        long A052 = this.A02.A05();
        if (A042 != null) {
            r2 = new AnonymousClass0JF(A042.isConnected(), A042.isRoaming(), A042.getType(), A052);
        } else {
            r2 = new AnonymousClass0JF(false, false, -1, A052);
        }
        this.A00.A03(r2);
        this.A03.A05(A042);
    }

    public void onReceive(Context context, Intent intent) {
        AnonymousClass0JF r4;
        if (!intent.getAction().equals("android.net.conn.RESTRICT_BACKGROUND_CHANGED")) {
            NetworkInfo A042 = this.A01.A04();
            long A052 = this.A02.A05();
            if (A042 != null) {
                r4 = new AnonymousClass0JF(A042.isConnected(), A042.isRoaming(), A042.getType(), A052);
            } else {
                r4 = new AnonymousClass0JF(false, false, -1, A052);
            }
            this.A00.A03(r4);
            if (this.A05.A04()) {
                this.A04.execute(new RunnableEBaseShape0S0100000_I0_0(this, 43));
            }
            this.A03.A05(A042);
        } else if (this.A05.A04()) {
            this.A04.execute(new RunnableEBaseShape0S0100000_I0_0(this, 42));
        }
    }
}
