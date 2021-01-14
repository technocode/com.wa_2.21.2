package java.lang;

import com.whatsapp.voipcalling.Voip;

public class RunnableEBaseShape0S0001000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public final int A01;

    public RunnableEBaseShape0S0001000_I1(int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
    }

    public final void run() {
        switch (this.A01) {
            case 0:
                Voip.cancelVideoUpgrade(this.A00);
                return;
            case 1:
                Voip.notifyAudioRouteChange(this.A00);
                return;
            case 2:
                Voip.rejectVideoUpgrade(this.A00);
                return;
            default:
                return;
        }
    }
}
