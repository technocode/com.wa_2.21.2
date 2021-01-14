package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0om  reason: invalid class name and case insensitive filesystem */
public final class C15830om {
    public int A00 = 16;
    public int A01 = 12544;
    public int A02 = -1;
    public Rect A03;
    public final Bitmap A04;
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();

    public C15830om(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            this.A05.add(C15870oq.A05);
            this.A04 = bitmap;
            this.A06.add(C15880or.A07);
            this.A06.add(C15880or.A09);
            this.A06.add(C15880or.A05);
            this.A06.add(C15880or.A06);
            this.A06.add(C15880or.A08);
            this.A06.add(C15880or.A04);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }

    public C15870oq A00() {
        AbstractC15840on[] r0;
        int i;
        char c;
        float f;
        float f2;
        Bitmap bitmap = this.A04;
        char c2 = 0;
        if (bitmap != null) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > 12544) {
                double sqrt = Math.sqrt(((double) 12544) / ((double) height));
                if (sqrt > 0.0d) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * sqrt), (int) Math.ceil(((double) bitmap.getHeight()) * sqrt), false);
                }
            }
            Rect rect = this.A03;
            if (!(bitmap == bitmap || rect == null)) {
                double width = ((double) bitmap.getWidth()) / ((double) bitmap.getWidth());
                rect.left = (int) Math.floor(((double) rect.left) * width);
                rect.top = (int) Math.floor(((double) rect.top) * width);
                rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmap.getWidth());
                rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmap.getHeight());
            }
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            int[] iArr = new int[(width2 * height2)];
            bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            Rect rect2 = this.A03;
            if (rect2 != null) {
                int width3 = rect2.width();
                int height3 = this.A03.height();
                int[] iArr2 = new int[(width3 * height3)];
                for (int i2 = 0; i2 < height3; i2++) {
                    Rect rect3 = this.A03;
                    System.arraycopy(iArr, ((rect3.top + i2) * width2) + rect3.left, iArr2, i2 * width3, width3);
                }
                iArr = iArr2;
            }
            List list = this.A05;
            if (list.isEmpty()) {
                r0 = null;
            } else {
                r0 = (AbstractC15840on[]) list.toArray(new AbstractC15840on[list.size()]);
            }
            C15810ok r1 = new C15810ok(iArr, r0);
            if (bitmap != bitmap) {
                bitmap.recycle();
            }
            C15870oq r10 = new C15870oq(r1.A00, this.A06);
            List list2 = r10.A03;
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C15880or r7 = (C15880or) list2.get(i3);
                int length = r7.A03.length;
                float f3 = 0.0f;
                for (int i4 = 0; i4 < length; i4++) {
                    float f4 = r7.A03[i4];
                    if (f4 > 0.0f) {
                        f3 += f4;
                    }
                }
                if (f3 != 0.0f) {
                    int length2 = r7.A03.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float[] fArr = r7.A03;
                        if (fArr[i5] > 0.0f) {
                            fArr[i5] = fArr[i5] / f3;
                        }
                    }
                }
                Map map = r10.A04;
                List list3 = r10.A02;
                int size2 = list3.size();
                int i6 = 0;
                C15860op r3 = null;
                float f5 = 0.0f;
                while (i6 < size2) {
                    C15860op r2 = (C15860op) list3.get(i6);
                    float[] A012 = r2.A01();
                    float f6 = A012[1];
                    float[] fArr2 = r7.A02;
                    if (f6 >= fArr2[c2] && A012[1] <= fArr2[2]) {
                        float f7 = A012[2];
                        float[] fArr3 = r7.A01;
                        if (f7 >= fArr3[c2] && A012[2] <= fArr3[2] && !r10.A00.get(r2.A08)) {
                            float[] A013 = r2.A01();
                            C15860op r02 = r10.A01;
                            if (r02 != null) {
                                i = r02.A06;
                            } else {
                                i = 1;
                            }
                            float[] fArr4 = r7.A03;
                            if (fArr4[c2] > 0.0f) {
                                c = 1;
                                f = (1.0f - Math.abs(A013[1] - r7.A02[1])) * fArr4[c2];
                            } else {
                                c = 1;
                                f = 0.0f;
                            }
                            float[] fArr5 = r7.A03;
                            if (fArr5[c] > 0.0f) {
                                f2 = (1.0f - Math.abs(A013[2] - r7.A01[c])) * fArr5[c];
                            } else {
                                f2 = 0.0f;
                            }
                            float[] fArr6 = r7.A03;
                            float f8 = f + f2 + (fArr6[2] > 0.0f ? (((float) r2.A06) / ((float) i)) * fArr6[2] : 0.0f);
                            if (r3 == null || f8 > f5) {
                                f5 = f8;
                                r3 = r2;
                            }
                        }
                    }
                    i6++;
                    c2 = 0;
                }
                if (r3 != null) {
                    r10.A00.append(r3.A08, true);
                }
                map.put(r7, r3);
            }
            r10.A00.clear();
            return r10;
        }
        throw new AssertionError();
    }

    public void A01(int i, int i2, int i3, int i4) {
        Bitmap bitmap = this.A04;
        if (bitmap != null) {
            Rect rect = this.A03;
            if (rect == null) {
                rect = new Rect();
                this.A03 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A03.intersect(i, i2, i3, i4)) {
                throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }
}
