package java.lang;

import X.AnonymousClass01N;
import X.AnonymousClass08V;
import X.C02340Bp;
import X.C04080Iy;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;

public class RunnableEBaseShape0S0100100_I0 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape0S0100100_I0(Object obj, long j, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j;
    }

    public final void run() {
        switch (this.A02) {
            case 0:
                C04080Iy r5 = (C04080Iy) this.A01;
                long j = this.A00;
                if (Looper.myLooper() != null) {
                    new Handler(Looper.myLooper()).postDelayed(new RunnableEBaseShape8S0100000_I1_3(r5, 0), j);
                    return;
                }
                try {
                    Thread.sleep(j);
                } catch (InterruptedException e) {
                    Log.e(e);
                    Thread.currentThread().interrupt();
                }
                r5.A01();
                return;
            case 1:
                ((AnonymousClass01N) this.A01).A01.A04(Long.valueOf(this.A00));
                return;
            case 2:
                long j2 = this.A00;
                AnonymousClass08V r1 = ((C02340Bp) this.A01).A00;
                synchronized (r1) {
                    r1.A04(Long.valueOf(j2));
                }
                return;
            default:
                return;
        }
    }
}
