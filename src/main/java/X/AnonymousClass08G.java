package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.08G  reason: invalid class name */
public class AnonymousClass08G extends AnonymousClass01G implements ComponentCallbacks2 {
    public static volatile AnonymousClass08G A04;
    public long A00;
    public long A01;
    public final AnonymousClass021 A02;
    public final AnonymousClass00T A03;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public AnonymousClass08G(AnonymousClass00G r2, AnonymousClass00T r3, AnonymousClass021 r4) {
        this.A03 = r3;
        this.A02 = r4;
        r2.A00.registerComponentCallbacks(this);
    }

    public static AnonymousClass08G A00() {
        if (A04 == null) {
            synchronized (AnonymousClass08G.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass08G(AnonymousClass00G.A01, C002101e.A00(), new AnonymousClass021());
                }
            }
        }
        return A04;
    }

    public /* synthetic */ void A02(boolean z) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass08E r0 = (AnonymousClass08E) r1.next();
                    if (z) {
                        r0.ACv();
                    } else {
                        r0.ACu();
                    }
                }
            }
        }
    }

    public void onTrimMemory(int i) {
        if (i >= 60) {
            AnonymousClass021 r6 = this.A02;
            if (r6 == null) {
                throw null;
            } else if (SystemClock.uptimeMillis() <= this.A00 + 60000) {
            } else {
                if (r6 != null) {
                    this.A00 = SystemClock.uptimeMillis();
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnTrimMemory/level: ");
                    sb.append(i);
                    sb.append(", trimming memory, app in background");
                    Log.i(sb.toString());
                    this.A03.ANF(new RunnableEBaseShape0S0110000_I0(this, false, 3));
                    return;
                }
                throw null;
            }
        } else if (i >= 15 && i < 20) {
            AnonymousClass021 r62 = this.A02;
            if (r62 == null) {
                throw null;
            } else if (SystemClock.uptimeMillis() <= this.A01 + 30000) {
            } else {
                if (r62 != null) {
                    this.A01 = SystemClock.uptimeMillis();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("OnTrimMemory/level: ");
                    sb2.append(i);
                    sb2.append(", trimming memory, app in forground");
                    Log.i(sb2.toString());
                    this.A03.ANF(new RunnableEBaseShape0S0110000_I0(this, true, 3));
                    return;
                }
                throw null;
            }
        }
    }
}
