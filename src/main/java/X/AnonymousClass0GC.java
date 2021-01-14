package X;

import android.app.Notification;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.0GC  reason: invalid class name */
public abstract class AnonymousClass0GC extends AnonymousClass0E4 {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass0C5 A02 = AnonymousClass0C5.A00();
    public final String A03;
    public final boolean A04;

    public AnonymousClass0GC(String str, boolean z) {
        this.A03 = str;
        this.A04 = z;
    }

    public void A00(int i, int i2, Notification notification) {
        this.A00 = i;
        startForeground(i2, notification);
        if (!this.A01) {
            this.A01 = true;
            if (Build.VERSION.SDK_INT >= 26) {
                AnonymousClass0C5 r3 = this.A02;
                synchronized (r3) {
                    Class<?> cls = getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("FgServiceManager register:");
                    sb.append(cls);
                    Log.i(sb.toString());
                    r3.A01.put(cls, this);
                }
                r3.A01();
            }
        }
    }

    public boolean A01() {
        int i;
        if (this.A04) {
            i = -1;
        } else {
            i = this.A00;
        }
        boolean stopSelfResult = stopSelfResult(i);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("/Stop service success:");
        sb.append(stopSelfResult);
        Log.i(sb.toString());
        return stopSelfResult;
    }

    public void onCreate() {
        this.A01 = false;
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01 = false;
        this.A00 = -1;
    }
}
