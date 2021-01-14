package X;

import android.media.Image;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.0zn  reason: invalid class name and case insensitive filesystem */
public class C22070zn {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Pair A04;
    public Float A05;
    public Long A06;
    public Long A07;
    public boolean A08;
    public byte[] A09;
    public float[] A0A;
    public C22060zm[] A0B;

    public void A00() {
        if (this.A0B != null) {
            int i = 0;
            while (true) {
                C22060zm[] r1 = this.A0B;
                if (i >= r1.length) {
                    break;
                }
                C22060zm r12 = r1[i];
                ByteBuffer byteBuffer = r12.A02;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    r12.A02 = null;
                }
                i++;
            }
            this.A0B = null;
        }
        this.A09 = null;
        this.A0A = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A06 = null;
    }

    public void A01(Image image, boolean z, float[] fArr, Pair pair, Long l, Float f, Long l2) {
        int i;
        this.A08 = z;
        Image.Plane[] planes = image.getPlanes();
        C22060zm[] r0 = this.A0B;
        if (r0 == null || r0.length != (i = planes.length)) {
            i = planes.length;
            this.A0B = new C22060zm[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            C22060zm[] r1 = this.A0B;
            if (r1[i2] == null) {
                r1[i2] = new C22060zm();
            }
            r1[i2].A02 = planes[i2].getBuffer();
            this.A0B[i2].A00 = planes[i2].getPixelStride();
            this.A0B[i2].A01 = planes[i2].getRowStride();
        }
        this.A0A = fArr;
        this.A04 = pair;
        this.A07 = l;
        this.A05 = f;
        this.A06 = l2;
        this.A01 = image.getFormat();
        this.A03 = image.getTimestamp();
        this.A02 = image.getWidth();
        this.A00 = image.getHeight();
    }

    public void A02(byte[] bArr, int i, int i2, int i3) {
        long nanoTime;
        this.A09 = bArr;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        if (Build.VERSION.SDK_INT >= 17) {
            nanoTime = SystemClock.elapsedRealtimeNanos();
        } else {
            nanoTime = System.nanoTime();
        }
        this.A03 = nanoTime;
    }
}
