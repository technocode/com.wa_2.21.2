package java.lang;

import com.whatsapp.mediaview.PhotoView;

public class RunnableEBaseShape0S0120102_I1 extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public long A02 = -1;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    public RunnableEBaseShape0S0120102_I1(PhotoView photoView, int i) {
        this.A06 = i;
        this.A03 = photoView;
    }

    public void run() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        switch (this.A06) {
            case 0:
                if (!this.A05) {
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
                    PhotoView photoView = (PhotoView) this.A03;
                    photoView.A0B(f2, f3);
                    float f10 = this.A00 - f2;
                    this.A00 = f10;
                    float f11 = this.A01 - f3;
                    this.A01 = f11;
                    if (f10 == 0.0f && f11 == 0.0f) {
                        this.A04 = false;
                        this.A05 = true;
                    }
                    if (!this.A05) {
                        photoView.post(this);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!this.A05) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j2 = this.A02;
                    if (j2 != -1) {
                        f4 = ((float) (currentTimeMillis2 - j2)) / 1000.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    PhotoView photoView2 = (PhotoView) this.A03;
                    boolean A0B = photoView2.A0B(this.A00 * f4, this.A01 * f4);
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
                    if ((f5 == 0.0f && f6 == 0.0f) || !A0B) {
                        this.A04 = false;
                        this.A05 = true;
                        photoView2.A09(false);
                    }
                    if (!this.A05) {
                        photoView2.post(this);
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
