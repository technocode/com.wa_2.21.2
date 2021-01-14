package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.animated.webp.WebPImage;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0D1  reason: invalid class name */
public class AnonymousClass0D1 {
    public static volatile AnonymousClass0D1 A0C;
    public AnonymousClass33E A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass02M A02;
    public final C000300f A03;
    public final AnonymousClass0A5 A04;
    public final C002701k A05;
    public final AnonymousClass0D3 A06 = new AnonymousClass0D3();
    public final C02570Cp A07;
    public final WebpUtils A08;
    public final AnonymousClass0D5 A09;
    public final ConcurrentHashMap A0A;
    public final ConcurrentHashMap A0B;

    public AnonymousClass0D1(C002701k r2, AnonymousClass02M r3, WebpUtils webpUtils, AnonymousClass088 r5, C000300f r6, C02570Cp r7, AnonymousClass0D2 r8, AnonymousClass0A5 r9) {
        this.A05 = r2;
        this.A02 = r3;
        this.A08 = webpUtils;
        this.A01 = r5;
        this.A03 = r6;
        this.A07 = r7;
        this.A04 = r9;
        this.A09 = new AnonymousClass0D5(r2, r3, r8);
        this.A0B = new ConcurrentHashMap();
        this.A0A = new ConcurrentHashMap();
    }

    public static AnonymousClass0D1 A00() {
        if (A0C == null) {
            synchronized (AnonymousClass0D1.class) {
                if (A0C == null) {
                    C002701k A002 = C002701k.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    WebpUtils A004 = WebpUtils.A00();
                    AnonymousClass088 A005 = AnonymousClass088.A00();
                    C000300f A006 = C000300f.A00();
                    C02570Cp A012 = C02570Cp.A01();
                    if (AnonymousClass0D2.A01 == null) {
                        synchronized (AnonymousClass0D2.class) {
                            if (AnonymousClass0D2.A01 == null) {
                                AnonymousClass0D2.A01 = new AnonymousClass0D2(AnonymousClass08D.A00(), AnonymousClass08G.A00());
                            }
                        }
                    }
                    A0C = new AnonymousClass0D1(A002, A003, A004, A005, A006, A012, AnonymousClass0D2.A01, AnonymousClass0A5.A00());
                }
            }
        }
        return A0C;
    }

    public static String A01(C29241Xq r5, int i, int i2) {
        String str = r5.A0A;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace("/", "-"));
            sb.append("_");
            sb.append(i);
            sb.append("_");
            sb.append(i2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r5.toString());
        sb2.append("_");
        sb2.append(i);
        sb2.append("_");
        sb2.append(i2);
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r2.A02.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0137, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r2 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0100, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r6.A02.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0106, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0131, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A02(android.content.Context r10, X.C29241Xq r11, com.whatsapp.stickers.WebpUtils r12, X.AnonymousClass088 r13, X.C000300f r14) {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0D1.A02(android.content.Context, X.1Xq, com.whatsapp.stickers.WebpUtils, X.088, X.00f):byte[]");
    }

    public final Drawable A03(String str, byte[] bArr, AnonymousClass33G r21) {
        int min;
        int i;
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.A0A;
        String str2 = r21.A04;
        Reference reference = (Reference) concurrentHashMap.get(str2);
        if (reference != null) {
            C71923Qv r5 = (C71923Qv) reference.get();
            if (r5 != null) {
                return new C71913Qu(r5, this.A03);
            }
            concurrentHashMap.remove(str2);
        }
        WebPImage A002 = C02570Cp.A00(bArr);
        if (A002 == null) {
            return null;
        }
        boolean z2 = false;
        C002701k r9 = this.A05;
        if (r9.A0E(295)) {
            C29241Xq r52 = r21.A03;
            C29251Xr r0 = r52.A04;
            if (r0 != null) {
                z = r0.A05;
            } else {
                String str3 = r52.A07;
                if (str3 != null) {
                    if (this.A08 != null) {
                        C29251Xr A003 = C29251Xr.A00(WebpUtils.fetchWebpMetadata(str3));
                        if (A003 != null) {
                            z = A003.A05;
                        }
                    } else {
                        throw null;
                    }
                }
            }
            z2 = !z;
        }
        if (A002.getFrameCount() == 1 || z2) {
            Bitmap A062 = this.A07.A06(str, bArr, r21.A02, r21.A00);
            if (A062 != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(A062);
                this.A0B.put(str2, new SoftReference(bitmapDrawable));
                return bitmapDrawable;
            }
            AnonymousClass008.A17("StickerImageLoader/loadAnimatedSticker failed to create drawable, hash: ", str);
            return null;
        }
        if (r9.A0E(276)) {
            min = Math.min(512, r21.A02);
            i = Math.min(512, r21.A00);
            if (r21.A06) {
                min = (int) (((float) min) / 2.0f);
                i = (int) (((float) i) / 2.0f);
            }
            StringBuilder sb = new StringBuilder("StickerImageLoader/loadAnimatedSticker/load sticker size=");
            sb.append(min);
            sb.append(", hash=");
            sb.append(str);
            Log.d(sb.toString());
        } else {
            min = Math.min(512, r21.A00().getResources().getDimensionPixelSize(R.dimen.conversation_row_sticker_size));
            i = min;
        }
        C02570Cp r1 = this.A07;
        String A022 = C02570Cp.A02(str2, min, i);
        Bitmap A042 = r1.A04(A022);
        if (A042 == null && (A042 = r1.A03(A002, min, i, A022)) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.replace("/", "-"));
        sb2.append("_");
        sb2.append(min);
        sb2.append("_");
        sb2.append(i);
        C71923Qv r10 = new C71923Qv(sb2.toString(), A042, A002, this.A02, this.A09, min, i);
        concurrentHashMap.put(str2, new WeakReference(r10));
        return new C71913Qu(r10, this.A03);
    }

    public void A04() {
        AnonymousClass33E r1 = this.A00;
        if (r1 != null) {
            r1.A01 = true;
            r1.interrupt();
            this.A00 = null;
        }
        AnonymousClass0D3 r12 = this.A06;
        synchronized (r12) {
            r12.A00.clear();
        }
        AnonymousClass0D5 r13 = this.A09;
        C661833f r0 = r13.A00;
        if (r0 != null) {
            r0.A00();
            r13.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass02M r8, X.AnonymousClass33G r9, java.util.Map r10) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0D1.A05(X.02M, X.33G, java.util.Map):void");
    }

    public void A06(C29241Xq r18, int i, ImageView imageView, int i2, int i3, boolean z, boolean z2, AnonymousClass33F r25) {
        PriorityQueue priorityQueue;
        Drawable drawable;
        String A012 = A01(r18, i2, i3);
        imageView.setTag(A012);
        AnonymousClass0D3 r3 = this.A06;
        synchronized (r3) {
            priorityQueue = r3.A00;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass3QK) it.next()).A00 == imageView) {
                    it.remove();
                }
            }
        }
        Drawable drawable2 = imageView.getDrawable();
        Reference reference = (Reference) this.A0B.get(A012);
        if (reference == null || (drawable = (Drawable) reference.get()) == null) {
            drawable = null;
            if (r18.A0A != null) {
                ConcurrentHashMap concurrentHashMap = this.A0A;
                Reference reference2 = (Reference) concurrentHashMap.get(A012);
                if (reference2 != null) {
                    C71923Qv r1 = (C71923Qv) reference2.get();
                    if (r1 != null) {
                        drawable = new C71913Qu(r1, this.A03);
                    } else {
                        concurrentHashMap.remove(A012);
                    }
                }
            }
        }
        if (drawable2 == null || !drawable2.equals(drawable)) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                if (r25 != null) {
                    r25.AKW(true);
                    return;
                }
                return;
            }
            imageView.setImageResource(R.drawable.sticker_loading);
            AnonymousClass3QK r7 = new AnonymousClass3QK(r18, A012, i2, i3, z, i, z2, imageView, r25);
            synchronized (r3) {
                priorityQueue.add(r7);
                r3.notifyAll();
            }
            if (this.A00 == null) {
                AnonymousClass33E r0 = new AnonymousClass33E(this, r3);
                this.A00 = r0;
                r0.start();
            }
        } else if (r25 != null) {
            r25.AKW(true);
        }
    }
}
