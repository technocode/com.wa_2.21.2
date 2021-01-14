package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0DA  reason: invalid class name */
public class AnonymousClass0DA {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public C667335p A01;
    public AnonymousClass35q A02;
    public final AnonymousClass088 A03;
    public final C000300f A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass01X A06;
    public final C02590Cr A07;
    public final C002701k A08;
    public final AnonymousClass0CP A09;
    public final AnonymousClass0D7 A0A;
    public final AnonymousClass0D1 A0B;
    public final C02570Cp A0C;
    public final AnonymousClass0DB A0D = new AnonymousClass0DB();
    public final AtomicInteger A0E = new AtomicInteger();

    public AnonymousClass0DA(AnonymousClass00G r3, AnonymousClass088 r4, C02590Cr r5, C000300f r6, C002701k r7, AnonymousClass0CP r8, AnonymousClass01X r9, C02570Cp r10, AnonymousClass0D1 r11, AnonymousClass0D7 r12) {
        this.A05 = r3;
        this.A03 = r4;
        this.A07 = r5;
        this.A04 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = r9;
        this.A0C = r10;
        this.A0B = r11;
        this.A0A = r12;
    }

    public final Bitmap A00(AnonymousClass0M4 r20, File file, int[] iArr, boolean z) {
        double sqrt;
        int i;
        InputStream inputStream;
        Throwable th;
        int A96 = this.A01.A02.A96();
        float f = C002301g.A0K.A00;
        if (f < 1.0f) {
            sqrt = 1.0d;
        } else {
            sqrt = Math.sqrt((double) (f - 0.75f)) + 0.5d;
        }
        if (A96 == 0) {
            i = Integer.MAX_VALUE;
            Log.e("MessageThumbsThread/ getting thumb for 0 size");
        } else {
            i = (int) (((double) A96) / sqrt);
        }
        long j = 0;
        boolean z2 = false;
        if (iArr != null) {
            AnonymousClass1W6 A032 = this.A09.A03(r20.A0I, false, false);
            if (A032 == null) {
                return null;
            }
            long j2 = A032.A06;
            int i2 = 0;
            while (i2 < iArr.length && ((long) iArr[i2]) + j < j2) {
                j += (long) iArr[i2];
                i2++;
            }
            if (j <= ((long) iArr[0])) {
                if (z) {
                    return null;
                }
                z2 = true;
            }
        }
        if (iArr == null) {
            try {
                inputStream = new FileInputStream(file);
            } catch (IOException e) {
                Log.d("MessageThumbsThread/bitmap-decode/IOException", e);
                return null;
            } catch (OutOfMemoryError e2) {
                if (!AnonymousClass0QO.A00()) {
                    Log.e("MessageThumbsThread/bitmap-decode/OutOfMemory avoided");
                    return null;
                }
                throw e2;
            }
        } else {
            inputStream = new C20090w6(new AnonymousClass35K(new BufferedInputStream(new FileInputStream(file)), j), C02220Bc.A0B);
        }
        try {
            AnonymousClass02L A0o = C002001d.A0o(inputStream, new AnonymousClass02K(i, 2));
            Bitmap bitmap = A0o.A02;
            try {
                if (r20.A06 == 0 && r20.A08 == 0 && A0o.A00 != 0 && A0o.A01 != 0) {
                    C02230Bd.A0T(file, r20);
                }
                if (bitmap != null) {
                    Matrix A0E2 = C02230Bd.A0E(C02230Bd.A09(file.getAbsolutePath()));
                    if (A0E2 != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), A0E2, true);
                        if (bitmap != createBitmap) {
                            bitmap.recycle();
                        }
                        bitmap = createBitmap;
                    }
                    if (z2 && bitmap != null) {
                        FilterUtils.blurNative(bitmap, 4, 2);
                    }
                }
                inputStream.close();
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
        throw th;
    }

    public synchronized void A01(AbstractC007503q r12, View view, AnonymousClass0D9 r14, AbstractC667235o r15, Object obj, boolean z) {
        File file;
        if (view != null) {
            LinkedBlockingDeque linkedBlockingDeque = this.A0D.A00;
            Iterator it = linkedBlockingDeque.iterator();
            while (it.hasNext()) {
                C667335p r1 = (C667335p) it.next();
                if (r1.A00 == view) {
                    linkedBlockingDeque.remove(r1);
                }
            }
        }
        LinkedBlockingDeque linkedBlockingDeque2 = this.A0D.A00;
        Iterator it2 = linkedBlockingDeque2.iterator();
        while (it2.hasNext()) {
            C667335p r2 = (C667335p) it2.next();
            if (r2.A01.A0n.equals(r12.A0n) && r2.A04.equals(obj) && r2.A00 == view) {
                return;
            }
        }
        if (r12 instanceof AnonymousClass0M3) {
            AnonymousClass0M3 r5 = (AnonymousClass0M3) r12;
            AnonymousClass0M4 r4 = r5.A02;
            if (r4 != null) {
                if (!r4.A0P || (file = r4.A0F) == null || file.exists()) {
                    r4.A0X = false;
                } else if (!r4.A0X) {
                    r4.A0X = true;
                    this.A00.post(new RunnableEBaseShape4S0100000_I0_4(r15, 34));
                }
                if (r4.A0F == null && !(r5 instanceof AnonymousClass0ZE) && !(r5 instanceof AnonymousClass0MI) && !(r5 instanceof AnonymousClass0ZC)) {
                    return;
                }
                if (!(r5 instanceof AnonymousClass0MM)) {
                    linkedBlockingDeque2.offer(new C667335p(r5, view, r14, r15, obj, z));
                    if (this.A02 == null) {
                        AnonymousClass35q r10 = new AnonymousClass35q(this, this.A03, this.A07, this.A06, this.A0C);
                        this.A02 = r10;
                        r10.start();
                    }
                }
            }
        }
    }
}
