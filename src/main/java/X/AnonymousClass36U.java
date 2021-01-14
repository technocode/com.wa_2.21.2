package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.36U  reason: invalid class name */
public class AnonymousClass36U extends Handler {
    public final AnonymousClass3SN A00;

    public AnonymousClass36U(Looper looper, AnonymousClass3SN r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            long j = message.getData().getLong("TimerDuration");
            Message obtain = Message.obtain();
            obtain.what = 2;
            sendMessageDelayed(obtain, Math.max(j, 0L));
            AnonymousClass3SN r0 = this.A00;
            if (r0 != null) {
                r0.A00.A00(3);
            }
        } else if (i == 2) {
            removeMessages(3);
            AnonymousClass3SN r02 = this.A00;
            if (r02 != null) {
                AnonymousClass3SO r03 = r02.A00;
                r03.A00(1);
                AnonymousClass3SP r04 = r03.A03;
                if (r04 != null) {
                    C04280Jt.A00(r04.A00);
                }
            }
        } else if (i == 3) {
            removeMessages(2);
            AnonymousClass3SN r05 = this.A00;
            if (r05 != null) {
                AnonymousClass3SO r06 = r05.A00;
                r06.A00(1);
                AnonymousClass3SP r07 = r06.A03;
                if (r07 != null) {
                    C04280Jt.A00(r07.A00);
                }
            }
        }
    }
}
