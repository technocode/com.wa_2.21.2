package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.3Qv  reason: invalid class name and case insensitive filesystem */
public class C71923Qv {
    public int A00;
    public int A01;
    public long A02;
    public Bitmap A03;
    public Bitmap A04;
    public Canvas A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final Bitmap A09;
    public final AnonymousClass02M A0A;
    public final C661533c A0B;
    public final AnonymousClass0D5 A0C;
    public final C662133i A0D;
    public final Runnable A0E = new RunnableEBaseShape13S0100000_I1_8(this);
    public final Set A0F = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean A0G;

    public C71923Qv(String str, Bitmap bitmap, WebPImage webPImage, AnonymousClass02M r11, AnonymousClass0D5 r12, int i, int i2) {
        this.A0A = r11;
        this.A0C = r12;
        this.A09 = bitmap;
        this.A0D = new C662133i(webPImage.getFrameCount(), webPImage.getFrameDurations());
        this.A08 = i;
        this.A07 = i2;
        this.A0B = new C661533c(str, bitmap, webPImage, i, i2);
    }

    public void A00() {
        C662133i r7;
        int i;
        if (this.A0G && (i = (r7 = this.A0D).A00) > 1) {
            Set set = this.A0F;
            if (set.size() != 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.A02 + ((long) this.A01);
                if (uptimeMillis >= j) {
                    Bitmap bitmap = this.A03;
                    if (bitmap != null) {
                        Bitmap bitmap2 = this.A04;
                        if (bitmap2 != null) {
                            bitmap2.eraseColor(0);
                        }
                        if (bitmap.isRecycled()) {
                            Log.e("AnimatedSticker/StickerAnimationController/updateFrame/was trying to use a recycled bitmap");
                        } else {
                            if (this.A04 == null) {
                                Bitmap createBitmap = Bitmap.createBitmap(this.A08, this.A07, Bitmap.Config.ARGB_8888);
                                this.A04 = createBitmap;
                                this.A05 = new Canvas(createBitmap);
                            }
                            Canvas canvas = this.A05;
                            if (canvas == null) {
                                canvas = new Canvas(this.A04);
                                this.A05 = canvas;
                            }
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        }
                        this.A03 = null;
                    }
                    ArrayList arrayList = new ArrayList(set);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC661633d) it.next()).AGP(this.A00);
                    }
                    if (this.A06) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((AbstractC661633d) it2.next()).ACm();
                        }
                        this.A06 = false;
                    }
                    int i2 = (this.A00 + 1) % i;
                    this.A00 = i2;
                    if (i2 == 0) {
                        this.A06 = true;
                    }
                    this.A02 = uptimeMillis;
                    int i3 = r7.A01[i2];
                    this.A01 = i3;
                    long j2 = uptimeMillis + ((long) i3);
                    AnonymousClass0D5 r2 = this.A0C;
                    C661533c r10 = this.A0B;
                    if (r2 != null) {
                        C661933g r9 = new C661933g(r10, i2, j2, this);
                        AnonymousClass0D6 r8 = r2.A04;
                        synchronized (r8) {
                            PriorityQueue priorityQueue = r8.A01;
                            Iterator it3 = priorityQueue.iterator();
                            while (it3.hasNext()) {
                                C661933g r5 = (C661933g) it3.next();
                                if (r5.A00 >= r9.A00 && r5.A02 == r9.A02 && r9.A01 > r5.A01) {
                                    it3.remove();
                                }
                            }
                            priorityQueue.add(r9);
                            r8.notifyAll();
                        }
                        if (r2.A00 == null) {
                            C661833f r52 = new C661833f(r2.A02, r2.A01, r8, r2.A03, new C71903Qt(r2));
                            r2.A00 = r52;
                            synchronized (r8) {
                                r8.A00 = r52;
                            }
                            r2.A00.start();
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                this.A0A.A02.postDelayed(this.A0E, j - uptimeMillis);
                return;
            }
        }
        this.A0G = false;
        Bitmap bitmap3 = this.A04;
        if (bitmap3 != null) {
            bitmap3.recycle();
            this.A04 = null;
        }
        this.A03 = null;
    }

    public void finalize() {
        this.A0B.finalize();
        Bitmap bitmap = this.A04;
        if (bitmap != null) {
            bitmap.recycle();
            this.A04 = null;
        }
        super.finalize();
    }
}
