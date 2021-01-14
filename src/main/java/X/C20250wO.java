package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;

/* renamed from: X.0wO  reason: invalid class name and case insensitive filesystem */
public class C20250wO extends Drawable implements Animatable {
    public static final C20260wP A0G = new C20260wP();
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public DrawableProperties A09;
    public AbstractC32551fB A0A;
    public C20270wQ A0B;
    public final Runnable A0C;
    public volatile AbstractC20240wN A0D;
    public volatile C20260wP A0E;
    public volatile boolean A0F;

    public int getOpacity() {
        return -3;
    }

    public C20250wO() {
        this(null);
    }

    public C20250wO(AbstractC32551fB r3) {
        this.A04 = 8;
        this.A0E = A0G;
        this.A0D = null;
        this.A0C = new RunnableEBaseShape5S0100000_I1_0(this, 27);
        this.A0A = r3;
        this.A0B = new C20270wQ(r3);
    }

    public void draw(Canvas canvas) {
        long max;
        int i;
        if (!(this.A0A == null || this.A0B == null)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A0F) {
                max = (uptimeMillis - this.A08) + 0;
            } else {
                max = Math.max(this.A05, 0L);
            }
            C20270wQ r12 = this.A0B;
            long A002 = r12.A00();
            if (A002 == 0) {
                int i2 = 0;
                long j = 0;
                do {
                    j += (long) r12.A01.A6V(i2);
                    i2++;
                } while (0 >= j);
                i = i2 - 1;
            } else {
                AbstractC20210wK r10 = r12.A01;
                if (r10.getLoopCount() == 0 || max / A002 < ((long) r10.getLoopCount())) {
                    long j2 = max % A002;
                    int i3 = 0;
                    long j3 = 0;
                    do {
                        j3 += (long) r10.A6V(i3);
                        i3++;
                    } while (j2 >= j3);
                    i = i3 - 1;
                } else {
                    i = -1;
                }
            }
            if (i == -1) {
                i = this.A0A.getFrameCount() - 1;
                if (this.A0E != null) {
                    this.A0F = false;
                } else {
                    throw null;
                }
            } else if (i == 0 && this.A01 != -1 && uptimeMillis >= this.A03 && this.A0E == null) {
                throw null;
            }
            if (!this.A0A.A3v(this, canvas, i)) {
                this.A00++;
            } else if (this.A0E != null) {
                this.A01 = i;
            } else {
                throw null;
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.A0F) {
                C20270wQ r3 = this.A0B;
                long j4 = uptimeMillis2 - this.A08;
                long A003 = r3.A00();
                if (A003 != 0) {
                    AbstractC20210wK r7 = r3.A01;
                    if (r7.getLoopCount() == 0 || j4 / r3.A00() < ((long) r7.getLoopCount())) {
                        long j5 = j4 % A003;
                        int frameCount = r7.getFrameCount();
                        long j6 = 0;
                        for (int i4 = 0; i4 < frameCount && j6 <= j5; i4++) {
                            j6 += (long) r7.A6V(i4);
                        }
                        long j7 = (j6 - j5) + j4;
                        if (j7 != -1) {
                            long j8 = this.A08 + j7 + this.A04;
                            this.A03 = j8;
                            scheduleSelf(this.A0C, j8);
                        }
                    }
                }
                if (this.A0E != null) {
                    this.A0F = false;
                } else {
                    throw null;
                }
            }
            this.A05 = max;
        }
    }

    public int getIntrinsicHeight() {
        AbstractC32551fB r0 = this.A0A;
        if (r0 == null) {
            return super.getIntrinsicHeight();
        }
        return r0.A6s();
    }

    public int getIntrinsicWidth() {
        AbstractC32551fB r0 = this.A0A;
        if (r0 == null) {
            return super.getIntrinsicWidth();
        }
        return r0.A6t();
    }

    public boolean isRunning() {
        return this.A0F;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        AbstractC32551fB r0 = this.A0A;
        if (r0 != null) {
            r0.AO0(rect);
        }
    }

    public boolean onLevelChange(int i) {
        if (this.A0F) {
            return false;
        }
        long j = (long) i;
        if (this.A05 == j) {
            return false;
        }
        this.A05 = j;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        DrawableProperties drawableProperties = this.A09;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A09 = drawableProperties;
        }
        drawableProperties.setAlpha(i);
        AbstractC32551fB r0 = this.A0A;
        if (r0 != null) {
            r0.ANu(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        DrawableProperties drawableProperties = this.A09;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A09 = drawableProperties;
        }
        drawableProperties.setColorFilter(colorFilter);
        AbstractC32551fB r0 = this.A0A;
        if (r0 != null) {
            r0.AO3(colorFilter);
        }
    }

    public void start() {
        AbstractC32551fB r0;
        if (!this.A0F && (r0 = this.A0A) != null && r0.getFrameCount() > 1) {
            this.A0F = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - this.A07;
            this.A08 = j;
            this.A03 = j;
            this.A05 = uptimeMillis - this.A06;
            this.A01 = this.A02;
            invalidateSelf();
            if (this.A0E == null) {
                throw null;
            }
        }
    }

    public void stop() {
        if (this.A0F) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A08;
            this.A06 = uptimeMillis - this.A05;
            this.A02 = this.A01;
            this.A0F = false;
            this.A08 = 0;
            this.A03 = 0;
            this.A05 = -1;
            this.A01 = -1;
            unscheduleSelf(this.A0C);
            if (this.A0E == null) {
                throw null;
            }
        }
    }
}
