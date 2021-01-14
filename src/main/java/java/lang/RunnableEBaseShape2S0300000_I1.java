package java.lang;

import X.AbstractC21140yF;
import X.C21660z7;
import X.C22130zv;
import X.C32421ev;
import X.EnumC21130yE;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;

public class RunnableEBaseShape2S0300000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape2S0300000_I1(AbstractC21140yF r2, EnumC21130yE r3, Point point) {
        this.A03 = 3;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = point;
    }

    public RunnableEBaseShape2S0300000_I1(C32421ev r2, byte[] bArr, C22130zv r4) {
        this.A03 = 5;
        this.A02 = r2;
        this.A01 = bArr;
        this.A00 = r4;
    }

    public RunnableEBaseShape2S0300000_I1(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.A03 = 2;
        this.A01 = intent;
        this.A00 = context;
        this.A02 = pendingResult;
    }

    public RunnableEBaseShape2S0300000_I1(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static void A00(RunnableEBaseShape2S0300000_I1 runnableEBaseShape2S0300000_I1) {
        AbstractC21140yF r4 = ((C21660z7) runnableEBaseShape2S0300000_I1.A00).A02;
        if (r4 != null) {
            float[] fArr = (float[]) runnableEBaseShape2S0300000_I1.A01;
            if (fArr != null) {
                r4.AGE((EnumC21130yE) runnableEBaseShape2S0300000_I1.A02, new Point((int) fArr[0], (int) fArr[1]));
            } else {
                r4.AGE((EnumC21130yE) runnableEBaseShape2S0300000_I1.A02, null);
            }
        }
    }

    public static void A01(RunnableEBaseShape2S0300000_I1 runnableEBaseShape2S0300000_I1) {
        C32421ev r5 = (C32421ev) runnableEBaseShape2S0300000_I1.A02;
        r5.A01.A0J.A00(6, new Object[]{r5.A00, runnableEBaseShape2S0300000_I1.A01, runnableEBaseShape2S0300000_I1.A00});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0410, code lost:
        if (r1 != 5) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x048f, code lost:
        if ((r1 instanceof android.graphics.Bitmap) != false) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x062c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0630, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x051e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x03e4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 2892
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape2S0300000_I1.run():void");
    }
}
