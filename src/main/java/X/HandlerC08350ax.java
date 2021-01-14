package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;

/* renamed from: X.0ax  reason: invalid class name and case insensitive filesystem */
public class HandlerC08350ax extends Handler {
    public final /* synthetic */ AnonymousClass0YW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC08350ax(AnonymousClass0YW r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        AnonymousClass0YW r11 = this.A00;
        if (r11.A0N.ABT()) {
            long currentTimeMillis = System.currentTimeMillis() - r11.A02;
            r11.A0G.setText(C002001d.A1W(r11.A16, (long) ((int) (currentTimeMillis / 1000))));
            r11.A0n.sendEmptyMessageDelayed(0, 50);
            File file = r11.A0a;
            if (file != null) {
                long length = file.length();
                boolean A0b = AnonymousClass1VY.A0b(r11.A0V);
                C000300f r13 = r11.A0v;
                long A06 = ((long) r13.A06(AbstractC000400g.A3x)) * 1000;
                C006003a r12 = AbstractC000400g.A3a;
                if (length > ((long) r13.A06(r12)) * 1048576 || (A0b && currentTimeMillis >= A06)) {
                    r11.A0O(true);
                } else {
                    int A062 = (int) ((length * 100) / (((long) r13.A06(r12)) * 1048576));
                    if (A0b) {
                        A062 = Math.max(A062, (int) ((currentTimeMillis * 100) / A06));
                    }
                    r11.A0K.setProgress(A062);
                }
            }
            r11.A0A.setVisibility(0);
            return;
        }
        r11.A0A.setVisibility(8);
    }
}
