package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0i7  reason: invalid class name and case insensitive filesystem */
public class HandlerC12450i7 extends Handler {
    public final /* synthetic */ AnonymousClass08D A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC12450i7(AnonymousClass08D r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        long j;
        if (message.arg1 == 0) {
            boolean z = true;
            AnonymousClass08D r6 = this.A00;
            synchronized (r6.A0D) {
                AnonymousClass0DD r0 = r6.A03;
                if (r0 != null) {
                    j = r0.A01(59000) + 0;
                    if (r6.A03.A00.A01() > 0) {
                        z = false;
                    }
                } else {
                    j = 0;
                }
            }
            synchronized (r6.A09) {
                AnonymousClass0DD r02 = r6.A02;
                if (r02 != null) {
                    j += r02.A01(59000);
                    if (r6.A02.A00.A01() > 0) {
                        z = false;
                    }
                }
            }
            synchronized (r6.A0E) {
                if (r6.A0H != null) {
                    j += r6.A0H.A01(59000);
                    if (r6.A0H.A00.A01() > 0) {
                        z = false;
                    }
                }
            }
            if (j > 0) {
                StringBuilder sb = new StringBuilder("cache-cleaner/total=");
                sb.append(j);
                sb.append("KB");
                Log.d(sb.toString());
            }
            if (!z) {
                sendEmptyMessageDelayed(0, 60000);
            }
        }
    }
}
