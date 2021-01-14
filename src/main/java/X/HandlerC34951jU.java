package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jU  reason: invalid class name and case insensitive filesystem */
public final class HandlerC34951jU extends HandlerC04640Ld {
    public final /* synthetic */ AnonymousClass262 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC34951jU(AnonymousClass262 r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass17W r2 = (AnonymousClass17W) message.obj;
            AnonymousClass262 r0 = this.A00;
            if (r2 != null) {
                Lock lock = r0.A0D;
                lock.lock();
                try {
                    if (r0.A0E == r2.A00) {
                        if (r2 instanceof C34851jK) {
                            C34851jK r22 = (C34851jK) r2;
                            C34811jG r4 = r22.A00;
                            C36171lh r5 = r22.A01;
                            if (r4.A07(0)) {
                                C34661ix r1 = r5.A01;
                                if (r1.A02()) {
                                    C35211jy r12 = r5.A02;
                                    C34661ix r52 = r12.A01;
                                    if (!r52.A02()) {
                                        String valueOf = String.valueOf(r52);
                                        StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                                        sb.append("Sign-in succeeded with resolve account failure: ");
                                        sb.append(valueOf);
                                        Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                                        r4.A03(r52);
                                    } else {
                                        r4.A09 = true;
                                        r4.A04 = r12.A00();
                                        r4.A0A = r12.A02;
                                        r4.A0B = r12.A03;
                                        r4.A00();
                                    }
                                } else if (!r4.A07 || r1.A01()) {
                                    r4.A03(r1);
                                } else {
                                    r4.A02();
                                    r4.A00();
                                }
                            }
                        } else if (r2 instanceof C34841jJ) {
                            ((C34841jJ) r2).A00.AJN(new C34661ix(16, null));
                        } else if (!(r2 instanceof C34831jI)) {
                            AnonymousClass262 r13 = ((C34801jF) r2).A00.A00;
                            r13.A00(null);
                            r13.A07.ARX(1, false);
                        } else {
                            C34831jI r23 = (C34831jI) r2;
                            ((C34811jG) r23.A01.A00).A03(r23.A00);
                        }
                        lock.unlock();
                    }
                } finally {
                    lock.unlock();
                }
            } else {
                throw null;
            }
        } else if (i != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i);
            Log.w("GACStateManager", sb2.toString());
        } else {
            throw ((Throwable) message.obj);
        }
    }
}
