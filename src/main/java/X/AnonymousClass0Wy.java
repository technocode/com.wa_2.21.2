package X;

import android.net.TrafficStats;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.0Wy  reason: invalid class name */
public class AnonymousClass0Wy {
    public static final Socket A04 = new Socket();
    public SSLSocketFactory A00;
    public boolean A01;
    public final AnonymousClass03U A02;
    public final ThreadPoolExecutor A03 = new ThreadPoolExecutor(2, 2, 30000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(2));

    public AnonymousClass0Wy(AnonymousClass03U r8) {
        this.A02 = r8;
    }

    public final void A00(InetSocketAddress inetSocketAddress, int i, boolean z, AnonymousClass36K r9) {
        StringBuilder A0S = AnonymousClass008.A0S("HappyEyeball/connectAndCountDown/");
        A0S.append(inetSocketAddress.getAddress());
        A0S.append("/begin");
        Log.d(A0S.toString());
        try {
            TrafficStats.setThreadStatsTag(1);
            C11270g0 A002 = C08950c2.A00(this.A00, inetSocketAddress, i, z, "HappyEyeball");
            if (!r9.A00(A002.A00)) {
                AnonymousClass0G8.A01(A002);
            }
        } catch (IOException | ClassCastException e) {
            if (!(e instanceof ClassCastException) || Build.VERSION.SDK_INT == 26) {
                StringBuilder sb = new StringBuilder();
                sb.append("HappyEyeball/connectAndCountDown/");
                sb.append(inetSocketAddress.getAddress());
                sb.append("/couldn't connect to ip");
                Log.e(sb.toString(), e);
                synchronized (this) {
                    if (this.A01) {
                        r9.A00(A04);
                    } else {
                        this.A01 = true;
                    }
                }
            } else {
                throw ((ClassCastException) e);
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
        TrafficStats.clearThreadStatsTag();
        StringBuilder A0S2 = AnonymousClass008.A0S("HappyEyeball/connectAndCountDown/");
        A0S2.append(inetSocketAddress.getAddress());
        A0S2.append("/finish");
        Log.d(A0S2.toString());
    }
}
