package java.lang;

import X.AnonymousClass0M3;
import X.AnonymousClass2UP;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.AbstractList;
import java.util.Stack;

public class RunnableEBaseShape0S0310000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public RunnableEBaseShape0S0310000_I0(MediaViewFragment mediaViewFragment) {
        this.A04 = 6;
        this.A01 = mediaViewFragment;
        this.A00 = new Stack();
        this.A02 = new Thread(this, "PhotoLoader");
    }

    public RunnableEBaseShape0S0310000_I0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = z;
    }

    public void A00(AnonymousClass0M3 r4, PhotoView photoView) {
        AnonymousClass2UP r2 = new AnonymousClass2UP(r4, photoView);
        AbstractList abstractList = (AbstractList) this.A00;
        synchronized (abstractList) {
            abstractList.add(0, r2);
            abstractList.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0591, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0595, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0598, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x059c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ec, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0281, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0285, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0288, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x028c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 1540
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape0S0310000_I0.run():void");
    }
}
