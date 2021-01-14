package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.39Y  reason: invalid class name */
public class AnonymousClass39Y extends Handler {
    public AnonymousClass3U7 A00;
    public AbstractC07230Wm A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ AnonymousClass0Z0 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass39Y(AnonymousClass0Z0 r1, Looper looper) {
        super(looper);
        this.A04 = r1;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            if (this.A00 == null) {
                AnonymousClass0Z0 r2 = this.A04;
                AnonymousClass3U7 r0 = new AnonymousClass3U7(r2.A01.A00, r2);
                this.A00 = r0;
                r0.A0B();
                this.A03 = true;
            }
            Object obj = message.obj;
            if (obj != null) {
                AnonymousClass0Yz r1 = (AnonymousClass0Yz) obj;
                AnonymousClass3U7 r02 = this.A00;
                if (r02 != null) {
                    r02.A0b(r1);
                    return;
                }
                throw null;
            }
            throw null;
        } else if (i == 2) {
            Log.i("voice-service-wrapper/handler WHAT_STOP_SERVICE");
            this.A03 = false;
            if (!this.A02) {
                sendEmptyMessage(3);
            }
        } else if (i == 3) {
            Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_DESTROY");
            AnonymousClass3U7 r03 = this.A00;
            if (r03 != null) {
                r03.A0C();
                this.A00 = null;
            }
        } else if (i == 4) {
            Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_BIND");
            if (this.A00 == null) {
                AnonymousClass0Z0 r22 = this.A04;
                AnonymousClass3U7 r04 = new AnonymousClass3U7(r22.A01.A00, r22);
                this.A00 = r04;
                r04.A0B();
            }
            this.A02 = true;
            AbstractC07230Wm r12 = (AbstractC07230Wm) message.obj;
            this.A01 = r12;
            r12.AK0(this.A00);
        } else if (i == 5) {
            if (!this.A02) {
                Log.w("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called while isBound is false");
                return;
            }
            Object obj2 = message.obj;
            AbstractC07230Wm r23 = this.A01;
            if (obj2 != r23) {
                StringBuilder A0S = AnonymousClass008.A0S("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called with mismatch voiceServiceBinderComponent, actual ");
                A0S.append(r23);
                A0S.append(", given ");
                A0S.append(message.obj);
                Log.w(A0S.toString());
                return;
            }
            Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND");
            this.A01 = null;
            this.A02 = false;
            if (!this.A03) {
                sendEmptyMessage(3);
            }
        }
    }
}
