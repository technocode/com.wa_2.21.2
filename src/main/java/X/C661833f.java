package X;

import android.graphics.Bitmap;
import android.os.Process;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.33f  reason: invalid class name and case insensitive filesystem */
public final class C661833f extends Thread {
    public final AnonymousClass02M A00;
    public final C002701k A01;
    public final AnonymousClass0D2 A02;
    public final AnonymousClass0D6 A03;
    public final C661733e A04 = new C661733e();
    public volatile C71903Qt A05;
    public volatile boolean A06;

    public C661833f(C002701k r2, AnonymousClass02M r3, AnonymousClass0D6 r4, AnonymousClass0D2 r5, C71903Qt r6) {
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A05 = r6;
    }

    public void A00() {
        this.A06 = true;
        AnonymousClass0D5 r1 = this.A05.A00;
        r1.A00 = null;
        AnonymousClass0D6 r12 = r1.A04;
        synchronized (r12) {
            r12.A00 = null;
        }
        interrupt();
    }

    public void run() {
        C661933g r5;
        Process.setThreadPriority(1);
        Bitmap bitmap = null;
        while (!this.A06) {
            try {
                AnonymousClass0D6 r6 = this.A03;
                synchronized (r6) {
                    PriorityQueue priorityQueue = r6.A01;
                    if (priorityQueue.isEmpty()) {
                        r6.wait(5000);
                    }
                    if (!priorityQueue.isEmpty()) {
                        r5 = (C661933g) priorityQueue.remove();
                    } else {
                        C661833f r0 = r6.A00;
                        if (r0 != null) {
                            r0.A00();
                        }
                        r5 = null;
                    }
                }
                if (this.A01.A0E(276)) {
                    if (r5 != null) {
                        C661733e r62 = this.A04;
                        int i = r5.A02.A09;
                        synchronized (r62) {
                            HashMap hashMap = r62.A00;
                            Integer valueOf = Integer.valueOf(i);
                            if (hashMap.containsKey(valueOf)) {
                                bitmap = (Bitmap) r62.A00.get(valueOf);
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                                r62.A00.put(valueOf, createBitmap);
                                bitmap = createBitmap;
                            }
                        }
                    }
                } else if (bitmap == null && r5 != null) {
                    C661533c r02 = r5.A02;
                    bitmap = Bitmap.createBitmap(r02.A09, r02.A08, Bitmap.Config.ARGB_8888);
                }
                if (this.A06) {
                    break;
                } else if (r5 != null) {
                    Bitmap A002 = r5.A02.A00(this.A02, bitmap);
                    AnonymousClass02M r2 = this.A00;
                    r2.A02.post(new RunnableEBaseShape9S0200000_I1_4(r5, A002, 17));
                }
            } catch (InterruptedException unused) {
            } catch (Exception e) {
                Log.e("StickerFramePreloader/FrameLoaderThread failed to load frame ", e);
            }
        }
        if (this.A01.A0E(276)) {
            C661733e r3 = this.A04;
            synchronized (r3) {
                Collection<Bitmap> values = r3.A00.values();
                values.size();
                for (Bitmap bitmap2 : values) {
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                }
                r3.A00.clear();
            }
        } else if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
