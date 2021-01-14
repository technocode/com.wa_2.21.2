package java.lang;

import X.AbstractC28141Tb;
import X.AnonymousClass02M;
import X.C28131Ta;
import X.C28181Tf;
import com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback;
import com.whatsapp.voipcalling.Voip;

public class RunnableEBaseShape1S0401000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableEBaseShape1S0401000_I1(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    public final void run() {
        switch (this.A05) {
            case 0:
                C28181Tf r7 = (C28181Tf) this.A01;
                int i = this.A00;
                C28131Ta r6 = (C28131Ta) this.A02;
                AbstractC28141Tb r5 = (AbstractC28141Tb) this.A03;
                Object obj = this.A04;
                int max = Math.max(i, 1);
                int i2 = 0;
                do {
                    try {
                        r6.A00 = null;
                        r5.A3s(r6);
                    } catch (Exception e) {
                        r6.A00 = e;
                    }
                    i2++;
                    if (i2 < max) {
                    }
                    ((AnonymousClass02M) r7.A00.get()).A02.post(new RunnableEBaseShape2S0300000_I1(r7, obj, r6, 20));
                    return;
                } while (r6.A00 != null);
                ((AnonymousClass02M) r7.A00.get()).A02.post(new RunnableEBaseShape2S0300000_I1(r7, obj, r6, 20));
                return;
            case 1:
                ((VoiceService$VoiceServiceEventCallback) this.A01).lambda$callCaptureBufferFilled$2743$VoiceService$VoiceServiceEventCallback((Voip.RecordingInfo[]) this.A02, (Voip.DebugTapType) this.A03, (byte[]) this.A04, this.A00);
                return;
            default:
                return;
        }
    }
}
