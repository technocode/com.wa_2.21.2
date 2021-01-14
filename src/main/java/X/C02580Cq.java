package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0Cq  reason: invalid class name and case insensitive filesystem */
public class C02580Cq implements AnonymousClass08E {
    public static final BitmapFactory.Options A08;
    public static volatile C02580Cq A09;
    public int A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0DD A02;
    public final AnonymousClass0AK A03;
    public final AnonymousClass0D9 A04 = new AnonymousClass0D8(this);
    public final AnonymousClass0DA A05;
    public final HashMap A06 = new HashMap();
    public final List A07 = new ArrayList();

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A08 = options;
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inDither = true;
    }

    public C02580Cq(AnonymousClass00G r12, AnonymousClass088 r13, AnonymousClass08D r14, C02590Cr r15, C000300f r16, C002701k r17, AnonymousClass0CP r18, AnonymousClass01X r19, C02570Cp r20, AnonymousClass08G r21, AnonymousClass0D1 r22, AnonymousClass0AK r23, AnonymousClass0D7 r24) {
        this.A03 = r23;
        this.A05 = new AnonymousClass0DA(r12, r13, r15, r16, r17, r18, r19, r20, r22, r24);
        StringBuilder sb = new StringBuilder("messagethumbcache/construct ");
        sb.append((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8));
        Log.i(sb.toString());
        this.A02 = r14.A03();
        r14.A0G.add(new AnonymousClass3S9(this));
        r21.A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d6, code lost:
        if (r1 > 0.0f) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass0M3 r4, int r5) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02580Cq.A00(X.0M3, int):int");
    }

    public static C02580Cq A01() {
        if (A09 == null) {
            synchronized (C02580Cq.class) {
                if (A09 == null) {
                    A09 = new C02580Cq(AnonymousClass00G.A01, AnonymousClass088.A00(), AnonymousClass08D.A00(), C02590Cr.A00(), C000300f.A00(), C002701k.A00(), AnonymousClass0CP.A00(), AnonymousClass01X.A00(), C02570Cp.A01(), AnonymousClass08G.A00(), AnonymousClass0D1.A00(), AnonymousClass0AK.A00(), AnonymousClass0D7.A00());
                }
            }
        }
        return A09;
    }

    public static final byte[] A02(AbstractC007503q r1) {
        if (r1 instanceof C05490Ot) {
            return ((C05490Ot) r1).A0y();
        }
        if (r1.A0B() == null || !r1.A0B().A06()) {
            return null;
        }
        return r1.A0B().A08();
    }

    public int A03() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int i2 = (int) (C002301g.A0K.A00 * 88.0f);
        this.A00 = i2;
        return i2;
    }

    public final synchronized Bitmap A04(AbstractC007503q r3) {
        return A05(r3, false, false, A02(r3));
    }

    public final synchronized Bitmap A05(AbstractC007503q r8, boolean z, boolean z2, byte[] bArr) {
        Bitmap bitmap = null;
        if (bArr == null) {
            return null;
        }
        try {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, A08);
            if (bitmap != null && (r8 instanceof AnonymousClass0MM)) {
                FilterUtils.blurNative(bitmap, 8, 2);
                return bitmap;
            } else if (bitmap == null || !z || !(r8 instanceof C05490Ot)) {
                if (bitmap != null && z && (r8 instanceof AnonymousClass0M3)) {
                    boolean z3 = r8 instanceof AnonymousClass0M2;
                    int i = 1;
                    if (!z3) {
                        if (z2) {
                            i = 2;
                        }
                        FilterUtils.blurNative(bitmap, i, 2);
                    } else if (z3 && bitmap.getHeight() < 100 && bitmap.getWidth() < 100) {
                        FilterUtils.blurNative(bitmap, 1, 2);
                    }
                }
                return bitmap;
            } else {
                FilterUtils.blurNative(bitmap, 4, 2);
                return bitmap;
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("image-thumb/base64-decode/message.encoding:");
            sb.append(r8.A01());
            Log.e(sb.toString());
            if (r8.A01() == 0 && r8.A0D() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("image-thumb/base64-decode/message.data:");
                sb2.append(r8.A0D().substring(0, Math.min(100, r8.A0D().length())));
                Log.e(sb2.toString());
            }
            Log.e("image-thumb/base64-decode/error", e);
        }
    }

    public final synchronized Bitmap A06(String str) {
        Bitmap bitmap;
        bitmap = (Bitmap) this.A02.A02(str);
        if (bitmap == null || bitmap.isRecycled()) {
            if (bitmap != null && bitmap.isRecycled()) {
                Log.e("!! recycled message in hard cache");
            }
            HashMap hashMap = this.A06;
            SoftReference softReference = (SoftReference) hashMap.get(str);
            bitmap = softReference != null ? (Bitmap) softReference.get() : null;
            if (bitmap == null || bitmap.isRecycled()) {
                if (softReference != null) {
                    hashMap.remove(str);
                }
                bitmap = null;
            }
        }
        return bitmap;
    }

    public void A07() {
        AnonymousClass00E.A01();
        List<Runnable> list = this.A07;
        synchronized (list) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            list.clear();
        }
    }

    public void A08(AbstractC007503q r4) {
        String str;
        AnonymousClass0DD r2 = this.A02;
        C007303n r0 = r4.A0n;
        if (r0 == null || (str = r0.A01) == null) {
            str = "null";
        }
        r2.A04(str);
        this.A06.remove(str);
    }

    public void A09(AbstractC007503q r2, View view, AnonymousClass0D9 r4) {
        view.setTag(r2.A0n);
        if (r4 == null) {
            r4 = this.A04;
        }
        A0A(r2, view, r4);
    }

    public void A0A(AbstractC007503q r10, View view, AnonymousClass0D9 r12) {
        String str;
        Bitmap A062;
        if ((!(r10 instanceof C05490Ot) || ((C05490Ot) r10).A0y() == null) && (r10.A0B() == null || !r10.A0B().A05())) {
            r12.APh(view, null, r10);
            return;
        }
        Object tag = view.getTag();
        synchronized (this) {
            C007303n r0 = r10.A0n;
            if (r0 == null || (str = r0.A01) == null) {
                str = "null";
            }
            A062 = A06(str);
        }
        if (A062 == null) {
            Bitmap A042 = A04(r10);
            C05440On A0B = r10.A0B();
            if (A042 != null || A0B == null || A0B.A06()) {
                r12.APh(view, A042, r10);
                return;
            }
            this.A03.A03(A0B, new RunnableEBaseShape0S0600000_I0(this, r10, A0B, view, r12, tag, 1));
            r12.APt(view);
            return;
        }
        r12.APh(view, A062, r10);
    }

    public void A0B(AbstractC007503q r8, View view, AnonymousClass0D9 r10, Object obj, boolean z) {
        view.setTag(obj);
        this.A05.A01(r8, view, r10, new AnonymousClass3SH(this, r8, obj, view, r10), obj, z);
    }

    public void A0C(AbstractC007503q r20, View view, AnonymousClass0D9 r22, Object obj, boolean z, boolean z2) {
        String str;
        AnonymousClass0D9 r9 = r22;
        view.setTag(obj);
        if (r22 == null) {
            r9 = this.A04;
        }
        synchronized (this) {
            if (C003701u.A0D()) {
                A07();
            }
            C007303n r0 = r20.A0n;
            if (r0 == null || (str = r0.A01) == null) {
                str = "null";
            }
            Bitmap A062 = A06(str);
            AnonymousClass3SG r10 = new AnonymousClass3SG(this, r20, obj, view, r9);
            if (A062 == null) {
                Bitmap A052 = A05(r20, true, z2, A02(r20));
                C05440On A0B = r20.A0B();
                if (A052 != null || A0B == null || A0B.A06()) {
                    r9.APh(view, A052, r20);
                    if (!(r20 instanceof C05490Ot)) {
                        this.A05.A01(r20, view, r9, r10, obj, z);
                    }
                } else {
                    this.A03.A03(A0B, new AnonymousClass35H(this, A0B, r20, z2, obj, view, r9, r10, z));
                    r9.APt(view);
                }
            } else {
                int A96 = (int) (((float) r9.A96()) / C002301g.A0K.A00);
                if (A96 > A062.getWidth() || A96 == 0) {
                    this.A05.A01(r20, view, r9, r10, obj, z);
                }
                r9.APh(view, A062, r20);
            }
        }
    }

    public void A0D(AbstractC007503q r8, View view, AnonymousClass0D9 r10, boolean z) {
        A0C(r8, view, r10, r8.A0n, z, false);
    }

    public final void A0E(Runnable runnable) {
        List list = this.A07;
        synchronized (list) {
            list.add(runnable);
        }
        this.A01.post(new RunnableEBaseShape4S0100000_I0_4(this, 32));
    }

    public final synchronized void A0F(String str, Bitmap bitmap) {
        this.A06.remove(str);
        if (bitmap != null) {
            this.A02.A05(str, bitmap);
        }
    }

    @Override // X.AnonymousClass08E
    public void ACu() {
        synchronized (this) {
            Log.d("MessageThumbCache/handleLowMemory");
            this.A06.clear();
        }
    }

    @Override // X.AnonymousClass08E
    public void ACv() {
        synchronized (this) {
            Log.d("MessageThumbCache/handleLowMemory");
            this.A06.clear();
        }
    }
}
