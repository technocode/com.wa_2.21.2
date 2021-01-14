package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;

/* renamed from: X.0AK  reason: invalid class name */
public class AnonymousClass0AK {
    public static volatile AnonymousClass0AK A02;
    public final Handler A00;
    public final AnonymousClass09Y A01;

    public AnonymousClass0AK(AnonymousClass09Y r3) {
        HandlerThread handlerThread = new HandlerThread("MessageThumbnailAsyncLoader thread");
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
        this.A01 = r3;
    }

    public static AnonymousClass0AK A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0AK.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0AK(AnonymousClass09Y.A00());
                }
            }
        }
        return A02;
    }

    public void A01(AbstractC007503q r3) {
        C05440On A0B;
        if (C003701u.A0D()) {
            Log.w("thumbs are loaded on ui thread", new Throwable());
        }
        if (r3.A0B() != null) {
            A02(r3.A0B());
        }
        AbstractC007503q A09 = r3.A09();
        if (A09 != null && (A0B = A09.A0B()) != null && !A0B.A06()) {
            A0B.A02(A0B.A07());
        }
    }

    public void A02(C05440On r3) {
        if (!r3.A06()) {
            byte[] A07 = r3.A07();
            if (A07 == null) {
                A07 = this.A01.A0C(r3.A04);
            }
            r3.A02(A07);
        }
    }

    public void A03(C05440On r4, Runnable runnable) {
        if (r4.A06()) {
            runnable.run();
        } else {
            this.A00.post(new RunnableEBaseShape1S0300000_I0_1(this, r4, runnable, 4));
        }
    }

    public boolean A04(AbstractC007503q r2) {
        if (r2 != null) {
            return (r2.A0B() != null && !r2.A0B().A06()) || A04(r2.A09());
        }
        return false;
    }
}
