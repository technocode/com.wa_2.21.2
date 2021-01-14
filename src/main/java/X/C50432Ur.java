package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2Ur  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C50432Ur implements Handler.Callback {
    public final /* synthetic */ C03160Fa A00;

    public /* synthetic */ C50432Ur(C03160Fa r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        C03160Fa r5 = this.A00;
        boolean z2 = false;
        if (message.arg1 != 0) {
            z2 = true;
        }
        long j = message.getData().getLong("networkId");
        StringBuilder sb = new StringBuilder("xmpp/handler/network handleNetworkChange isConnected:");
        sb.append(z2);
        sb.append(" networkId:");
        sb.append(j);
        Log.d(sb.toString());
        synchronized (r5.A1T) {
            z = true;
            if (r5.A0D != z2) {
                if (z2) {
                    Log.i("xmpp/handler/network/up");
                    r5.A0D(false, true, false);
                } else {
                    Log.i("xmpp/handler/network/down");
                    AnonymousClass0GA r0 = r5.A0A;
                    if (r0 != null) {
                        r0.ANg(true);
                    }
                }
                r5.A0D = z2;
                r5.A01 = j;
            } else if (z2) {
                long j2 = r5.A01;
                if (j != j2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("xmpp/handler/network/switch old=");
                    sb2.append(j2);
                    sb2.append(" new=");
                    sb2.append(j);
                    Log.i(sb2.toString());
                    AnonymousClass0GA r02 = r5.A0A;
                    if (r02 != null) {
                        r02.ANg(true);
                    }
                    r5.A01 = j;
                } else {
                    z = false;
                }
                r5.A0D(false, false, true);
            } else {
                z = false;
            }
        }
        if (!z) {
            return true;
        }
        r5.A0o.A05(r5.A0b.A04());
        return true;
    }
}
