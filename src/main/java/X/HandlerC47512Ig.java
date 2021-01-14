package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.2Ig  reason: invalid class name and case insensitive filesystem */
public class HandlerC47512Ig extends Handler {
    public final /* synthetic */ C28301Tu A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC47512Ig(C28301Tu r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        C28301Tu r9 = this.A00;
        AnonymousClass1Y0 r0 = r9.A0H;
        if (r0 != null) {
            if (r0.A08()) {
                int A09 = r9.A09();
                r9.A03 = A09;
                AbstractC47572Im r02 = r9.A0E;
                if (r02 != null && r9.A0Q(r02.A6J())) {
                    r9.A0E.AIr(A09);
                }
                if (r9.A0g) {
                    AnonymousClass2W4 r11 = r9.A0d;
                    Context applicationContext = r9.A06.getApplicationContext();
                    if (r11 == null) {
                        throw null;
                    } else if (C28301Tu.A0i == r9) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - r11.A00 >= 1000) {
                            r11.A03(applicationContext, r9);
                            r11.A00 = currentTimeMillis;
                        }
                    }
                }
                AbstractC47582In r6 = r9.A0F;
                if (r6 != null && r9.A0C == null) {
                    int i = r9.A04 + 1;
                    r9.A04 = i;
                    byte[] bArr = C28301Tu.A0k;
                    if (bArr == null) {
                        bArr = new byte[128];
                        C28301Tu.A0k = bArr;
                        int i2 = 0;
                        do {
                            double d = ((double) i2) * 3.141592653589793d;
                            double d2 = (double) 128;
                            double sin = Math.sin((32.0d * d) / d2);
                            bArr[i2] = (byte) ((int) ((Math.abs(Math.sin((d * 1.0d) / d2)) * Math.abs(Math.sin((4.0d * d) / d2)) * sin * 64.0d) + 128.0d));
                            i2++;
                        } while (i2 < 128);
                    }
                    if (i % 4 == 0) {
                        for (int i3 = 0; i3 < bArr.length; i3++) {
                            bArr[i3] = (byte) (256 - bArr[i3]);
                        }
                    }
                    r6.ALn(bArr);
                }
                sendEmptyMessageDelayed(0, 50);
            } else if (!r9.A0O) {
                r9.A0C();
            }
        }
    }
}
