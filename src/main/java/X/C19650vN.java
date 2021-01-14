package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.0vN  reason: invalid class name and case insensitive filesystem */
public final class C19650vN {
    public static boolean A0D = true;
    public static BitmapFactory.Options A0E;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final C19490v7 A0G = new C19490v7(20);
    public static final C19490v7 A0H = new C19490v7(32);
    public static final C19490v7 A0I = new C19490v7(128);
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public long A05 = -1;
    public Bitmap A06;
    public BitmapFactory.Options A07;
    public C19650vN A08 = null;
    public C19650vN A09 = null;
    public final AbstractRunnableC19430v0 A0A = new C32321eh(this);
    public final C19650vN[] A0B = new C19650vN[4];
    public volatile int A0C = 0;

    public C19650vN(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (!A0D) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A07 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A07 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = Bitmap.Config.RGB_565;
        options2.inMutable = true;
    }

    public static C19650vN A00(int i, int i2) {
        C19650vN r0 = (C19650vN) A0I.A00();
        if (r0 == null) {
            return new C19650vN(i, i2);
        }
        r0.A01 = i;
        r0.A00 = i2;
        return r0;
    }

    public static C19650vN A01(byte[] bArr, int i) {
        Bitmap bitmap;
        C19650vN A002 = A00(-1, -1);
        if (A0D) {
            BitmapFactory.Options options = A002.A07;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, A002.A07);
            A002.A06 = bitmap;
            if (A0D) {
                A002.A07.inBitmap = null;
            }
        } catch (IllegalArgumentException unused) {
            C19550vD.A07.A01();
            A0D = false;
            A002.A07.inBitmap.recycle();
            A002.A07.inBitmap = null;
            A0H.A01();
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, A002.A07);
            A002.A06 = bitmap;
        }
        if (bitmap == null) {
            A002.A03();
            return null;
        }
        A002.A01 = bitmap.getWidth();
        A002.A00 = A002.A06.getHeight();
        return A002;
    }

    public synchronized Bitmap A02() {
        return this.A06;
    }

    public void A03() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i = 0; i < 4; i++) {
            this.A0B[i] = null;
        }
        A04();
        this.A0C = 0;
        this.A08 = null;
        this.A09 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
        this.A05 = -1;
        A0I.A02(this);
    }

    public final synchronized void A04() {
        Bitmap bitmap = this.A06;
        if (bitmap == null || bitmap == A0F) {
            this.A06 = null;
            return;
        }
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            A0G.A02(this.A06);
        } else if (A0D) {
            A0H.A02(this.A06);
        } else {
            this.A06.recycle();
        }
        this.A06 = null;
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {x=");
        sb.append(this.A02);
        sb.append(", y=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A04);
        sb.append(", status=");
        sb.append(this.A0C);
        sb.append("}");
        sb.append(this.A06 == null ? "x" : "o");
        return sb.toString();
    }
}
