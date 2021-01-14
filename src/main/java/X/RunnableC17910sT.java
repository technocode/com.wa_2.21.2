package X;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0sT  reason: invalid class name and case insensitive filesystem */
public class RunnableC17910sT extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Notification A02;
    public final /* synthetic */ SystemForegroundService A03;

    public RunnableC17910sT(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.A03 = systemForegroundService;
        this.A00 = i;
        this.A02 = notification;
        this.A01 = i2;
    }

    public void run() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A03.startForeground(this.A00, this.A02, this.A01);
        } else {
            this.A03.startForeground(this.A00, this.A02);
        }
    }
}
