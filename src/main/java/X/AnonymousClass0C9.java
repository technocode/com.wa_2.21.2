package X;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.service.WebClientService;
import com.whatsapp.util.Log;

/* renamed from: X.0C9  reason: invalid class name */
public class AnonymousClass0C9 extends Handler {
    public long A00 = 60000;
    public final /* synthetic */ AnonymousClass0C4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0C9(AnonymousClass0C4 r3) {
        super(Looper.getMainLooper());
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        AnonymousClass0C4 r4 = this.A01;
        Application application = r4.A0G.A00;
        int i = message.what;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder A0S = AnonymousClass008.A0S("qrsession/fservice unknown message: ");
                    A0S.append(i);
                    A0S.append(" uptime:");
                    A0S.append(SystemClock.uptimeMillis());
                    Log.e(A0S.toString());
                    return;
                }
                Log.i("qrsession/fservice/delayed exec");
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("qrsession/fservice/kill kill:");
            A0S2.append(hasMessages(2));
            A0S2.append(" delayed:");
            A0S2.append(hasMessages(3));
            A0S2.append(" uptime:");
            A0S2.append(SystemClock.uptimeMillis());
            Log.i(A0S2.toString());
            removeMessages(2);
            removeMessages(3);
            this.A00 = 60000;
            r4.A0J.A02(application, WebClientService.class);
            return;
        }
        StringBuilder A0S3 = AnonymousClass008.A0S("qrsession/fservice/start kill:");
        A0S3.append(hasMessages(2));
        A0S3.append(" delayed:");
        A0S3.append(hasMessages(3));
        A0S3.append(" uptime:");
        A0S3.append(SystemClock.uptimeMillis());
        Log.i(A0S3.toString());
        removeMessages(1);
        Intent intent = new Intent();
        if (message.arg1 != 1) {
            z = false;
        }
        intent.putExtra("isPortal", z);
        r4.A0J.A03(application, WebClientService.class, intent);
    }
}
