package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Qu  reason: invalid class name and case insensitive filesystem */
public class C71913Qu extends Drawable implements Animatable, AbstractC661633d {
    public static int A0B = 4000;
    public int A00;
    public int A01;
    public long A02;
    public Paint A03;
    public C000300f A04;
    public C662033h A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = false;
    public final C71923Qv A09;
    public final List A0A = new ArrayList();

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C71913Qu(C71923Qv r2, C000300f r3) {
        this.A09 = r2;
        this.A04 = r3;
        if (r3.A0D(AbstractC000400g.A1k)) {
            A0B = SearchActionVerificationClientService.NOTIFICATION_ID;
        }
    }

    @Override // X.AbstractC661633d
    public void ACm() {
        int i;
        if (!this.A06) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (this.A08) {
                i = this.A01 + 1;
            } else {
                i = this.A01;
            }
            if (i2 >= i) {
                stop();
            } else if (SystemClock.uptimeMillis() - this.A02 > ((long) A0B)) {
                stop();
            }
        }
    }

    @Override // X.AbstractC661633d
    public void AGP(int i) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        C71923Qv r0;
        Bitmap bitmap;
        if (!this.A07) {
            r0 = this.A09;
            bitmap = r0.A09;
        } else {
            r0 = this.A09;
            bitmap = r0.A04;
        }
        if (bitmap == null) {
            bitmap = r0.A09;
        }
        canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A03);
    }

    public boolean isRunning() {
        return this.A07;
    }

    public void start() {
        this.A02 = SystemClock.uptimeMillis();
        if (!this.A07 || this.A04.A0D(AbstractC000400g.A1k)) {
            boolean z = false;
            this.A00 = 0;
            this.A07 = true;
            C71923Qv r3 = this.A09;
            int i = r3.A00;
            int i2 = r3.A0D.A00;
            if (i > Math.max(i2 / 5, 1)) {
                z = true;
            }
            this.A08 = z;
            r3.A0F.add(this);
            if (!r3.A0G && i2 > 1) {
                r3.A0G = true;
                r3.A00();
            }
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void stop() {
        if (this.A07) {
            this.A07 = false;
            C71923Qv r2 = this.A09;
            Set set = r2.A0F;
            set.remove(this);
            if (set.isEmpty()) {
                r2.A0G = false;
                r2.A00 = 0;
                C661533c r3 = r2.A0B;
                synchronized (r3) {
                    r3.A00 = 0;
                    r3.A06 = false;
                    r3.A03 = null;
                    r3.A02 = null;
                    Bitmap bitmap = r3.A01;
                    if (bitmap != null) {
                        r3.A04 = null;
                        bitmap.recycle();
                        r3.A01 = null;
                    }
                }
                r2.A06 = false;
                Bitmap bitmap2 = r2.A04;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    r2.A04 = null;
                }
                r2.A03 = null;
                AnonymousClass02M r0 = r2.A0A;
                r0.A02.removeCallbacks(r2.A0E);
                AnonymousClass0D6 r22 = r2.A0C.A04;
                synchronized (r22) {
                    Iterator it = r22.A01.iterator();
                    while (it.hasNext()) {
                        if (((C661933g) it.next()).A02 == r3) {
                            it.remove();
                        }
                    }
                }
            }
            for (AbstractC17400rT r02 : this.A0A) {
                r02.A00(this);
            }
            invalidateSelf();
        }
    }
}
