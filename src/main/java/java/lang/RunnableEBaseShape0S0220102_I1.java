package java.lang;

import X.AnonymousClass2PX;
import android.view.View;

public class RunnableEBaseShape0S0220102_I1 extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public long A02 = -1;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    public RunnableEBaseShape0S0220102_I1(View view, AnonymousClass2PX r4, int i) {
        this.A07 = i;
        this.A04 = view;
        this.A03 = r4;
    }

    public void run() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        switch (this.A07) {
            case 0:
                if (!this.A06) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.A02;
                    if (j != -1) {
                        f = (float) (currentTimeMillis - j);
                    } else {
                        f = 0.0f;
                    }
                    if (j == -1) {
                        this.A02 = currentTimeMillis;
                    }
                    if (f >= 100.0f) {
                        f2 = this.A00;
                        f3 = this.A01;
                    } else {
                        float f7 = this.A00;
                        float f8 = 100.0f - f;
                        f2 = (f7 / f8) * 10.0f;
                        float f9 = this.A01;
                        f3 = (f9 / f8) * 10.0f;
                        if (Math.abs(f2) > Math.abs(f7) || f2 == Float.NaN) {
                            f2 = f7;
                        }
                        if (Math.abs(f3) > Math.abs(f9) || f3 == Float.NaN) {
                            f3 = f9;
                        }
                    }
                    ((AnonymousClass2PX) this.A03).A03(f2, f3);
                    float f10 = this.A00 - f2;
                    this.A00 = f10;
                    float f11 = this.A01 - f3;
                    this.A01 = f11;
                    if (f10 == 0.0f && f11 == 0.0f) {
                        this.A05 = false;
                        this.A06 = true;
                    }
                    if (!this.A06) {
                        ((View) this.A04).post(this);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!this.A06) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j2 = this.A02;
                    if (j2 != -1) {
                        f4 = ((float) (currentTimeMillis2 - j2)) / 1000.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    AnonymousClass2PX r4 = (AnonymousClass2PX) this.A03;
                    boolean A032 = r4.A03(this.A00 * f4, this.A01 * f4);
                    this.A02 = currentTimeMillis2;
                    float f12 = f4 * 1000.0f;
                    float f13 = this.A00;
                    if (f13 > 0.0f) {
                        f5 = f13 - f12;
                        this.A00 = f5;
                        if (f5 < 0.0f) {
                            this.A00 = 0.0f;
                            f5 = 0.0f;
                        }
                    } else {
                        f5 = f13 + f12;
                        this.A00 = f5;
                        if (f5 > 0.0f) {
                            this.A00 = 0.0f;
                            f5 = 0.0f;
                        }
                    }
                    float f14 = this.A01;
                    if (f14 > 0.0f) {
                        f6 = f14 - f12;
                        this.A01 = f6;
                        if (f6 < 0.0f) {
                            this.A01 = 0.0f;
                            f6 = 0.0f;
                        }
                    } else {
                        f6 = f14 + f12;
                        this.A01 = f6;
                        if (f6 > 0.0f) {
                            this.A01 = 0.0f;
                            f6 = 0.0f;
                        }
                    }
                    if ((f5 == 0.0f && f6 == 0.0f) || !A032) {
                        this.A05 = false;
                        this.A06 = true;
                        r4.A02(false);
                    }
                    if (!this.A06) {
                        ((View) this.A04).post(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
