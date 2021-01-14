package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: X.14W  reason: invalid class name */
public final class AnonymousClass14W {
    public static final byte[] A07 = {0, 7, 8, 15};
    public static final byte[] A08 = {0, 119, -120, -1};
    public static final byte[] A09 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap A00;
    public final Canvas A01 = new Canvas();
    public final Paint A02;
    public final Paint A03;
    public final AnonymousClass14O A04 = new AnonymousClass14O(0, new int[]{0, -1, -16777216, -8421505}, A03(), A04());
    public final AnonymousClass14P A05 = new AnonymousClass14P(719, 575, 0, 719, 0, 575);
    public final AnonymousClass14V A06;

    public AnonymousClass14W(int i, int i2) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A06 = new AnonymousClass14V(i, i2);
    }

    public static AnonymousClass14O A00(C233715m r18, int i) {
        int A002;
        int A003;
        int A004;
        int A005;
        int i2 = 8;
        int A006 = r18.A00(8);
        r18.A02(8);
        int i3 = i - 2;
        int i4 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] A032 = A03();
        int[] A042 = A04();
        while (i3 > 0) {
            int A007 = r18.A00(i2);
            int A008 = r18.A00(i2);
            int i5 = i3 - 2;
            int[] iArr2 = iArr;
            if ((A008 & 128) == 0) {
                iArr2 = A042;
                if ((A008 & 64) != 0) {
                    iArr2 = A032;
                }
            }
            if ((A008 & 1) != 0) {
                A002 = r18.A00(i2);
                A003 = r18.A00(i2);
                A004 = r18.A00(i2);
                A005 = r18.A00(i2);
                i3 = i5 - 4;
            } else {
                A002 = r18.A00(6) << 2;
                A003 = r18.A00(i4) << i4;
                A004 = r18.A00(i4) << i4;
                A005 = r18.A00(2) << 6;
                i3 = i5 - 2;
            }
            if (A002 == 0) {
                A003 = 0;
                A004 = 0;
                A005 = 255;
            }
            double d = (double) A002;
            double d2 = (double) (A003 - 128);
            double d3 = (double) (A004 - 128);
            int max = Math.max(0, Math.min((int) ((1.402d * d2) + d), 255));
            int max2 = Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255));
            iArr2[A007] = (((byte) (255 - (A005 & 255))) << 24) | (max << 16) | (max2 << 8) | Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255));
            i2 = 8;
            i4 = 4;
        }
        return new AnonymousClass14O(A006, iArr, A032, A042);
    }

    public static AnonymousClass14Q A01(C233715m r6) {
        byte[] bArr;
        int A002 = r6.A00(16);
        r6.A02(4);
        int A003 = r6.A00(2);
        boolean A042 = r6.A04();
        r6.A02(1);
        byte[] bArr2 = null;
        if (A003 == 1) {
            r6.A02(r6.A00(8) << 4);
        } else if (A003 == 0) {
            int A004 = r6.A00(16);
            int A005 = r6.A00(16);
            if (A004 > 0) {
                bArr2 = new byte[A004];
                r6.A03(bArr2, A004);
            }
            if (A005 > 0) {
                bArr = new byte[A005];
                r6.A03(bArr, A005);
                return new AnonymousClass14Q(A002, A042, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new AnonymousClass14Q(A002, A042, bArr2, bArr);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0084 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0119 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x011d */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d6, code lost:
        if (r1 != 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r11 != 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0119, code lost:
        if (r0 != 0) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x00a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x013e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6 A[LOOP:4: B:21:0x006b->B:36:0x00b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014f A[LOOP:5: B:61:0x0104->B:78:0x014f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
        // Method dump skipped, instructions count: 500
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14W.A02(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r4 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A03() {
        /*
            r7 = 16
            int[] r6 = new int[r7]
            r0 = 0
            r6[r0] = r0
            r5 = 1
        L_0x0008:
            r4 = 255(0xff, float:3.57E-43)
        L_0x000a:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L_0x0011
            r3 = 255(0xff, float:3.57E-43)
        L_0x0011:
            r0 = r5 & 4
            r2 = 0
            if (r0 == 0) goto L_0x0018
            r2 = 255(0xff, float:3.57E-43)
        L_0x0018:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4 << 16
            r1 = r1 | r0
            int r0 = r3 << 8
            r1 = r1 | r0
            r1 = r1 | r2
            r6[r5] = r1
        L_0x0023:
            int r5 = r5 + 1
            if (r5 >= r7) goto L_0x0052
            r0 = 8
            if (r5 >= r0) goto L_0x0031
            r0 = r5 & 1
            r4 = 0
            if (r0 == 0) goto L_0x000a
            goto L_0x0008
        L_0x0031:
            r0 = r5 & 1
            r4 = 127(0x7f, float:1.78E-43)
            r3 = 0
            if (r0 == 0) goto L_0x003a
            r3 = 127(0x7f, float:1.78E-43)
        L_0x003a:
            r0 = r5 & 2
            r2 = 0
            if (r0 == 0) goto L_0x0041
            r2 = 127(0x7f, float:1.78E-43)
        L_0x0041:
            r0 = r5 & 4
            if (r0 != 0) goto L_0x0046
            r4 = 0
        L_0x0046:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r3 << 16
            r1 = r1 | r0
            int r0 = r2 << 8
            r1 = r1 | r0
            r1 = r1 | r4
            r6[r5] = r1
            goto L_0x0023
        L_0x0052:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14W.A03():int[]");
    }

    public static int[] A04() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i = 0;
        do {
            int i2 = 255;
            if (i < 8) {
                int i3 = 0;
                if ((i & 1) != 0) {
                    i3 = 255;
                }
                int i4 = 0;
                if ((i & 2) != 0) {
                    i4 = 255;
                }
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = 1056964608 | (i3 << 16) | (i4 << 8) | i2;
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = 0;
                    if ((i & 1) != 0) {
                        i8 = 85;
                    }
                    int i9 = 0;
                    if ((i & 16) != 0) {
                        i9 = 170;
                    }
                    int i10 = i8 + i9;
                    int i11 = 0;
                    if ((i & 2) != 0) {
                        i11 = 85;
                    }
                    int i12 = 0;
                    if ((i & 32) != 0) {
                        i12 = 170;
                    }
                    int i13 = i11 + i12;
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = -16777216 | (i10 << 16) | (i13 << 8) | (i7 + i6);
                } else if (i5 != 8) {
                    int i14 = 43;
                    if (i5 == 128) {
                        int i15 = 0;
                        if ((i & 1) != 0) {
                            i15 = 43;
                        }
                        int i16 = i15 + 127;
                        int i17 = 0;
                        if ((i & 16) != 0) {
                            i17 = 85;
                        }
                        int i18 = i16 + i17;
                        int i19 = 0;
                        if ((i & 2) != 0) {
                            i19 = 43;
                        }
                        int i20 = i19 + 127;
                        int i21 = 0;
                        if ((i & 32) != 0) {
                            i21 = 85;
                        }
                        int i22 = i20 + i21;
                        if ((i & 4) == 0) {
                            i14 = 0;
                        }
                        int i23 = i14 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = -16777216 | (i18 << 16) | (i22 << 8) | (i23 + i7);
                    } else if (i5 == 136) {
                        int i24 = 0;
                        if ((i & 1) != 0) {
                            i24 = 43;
                        }
                        int i25 = 0;
                        if ((i & 16) != 0) {
                            i25 = 85;
                        }
                        int i26 = i24 + i25;
                        int i27 = 0;
                        if ((i & 2) != 0) {
                            i27 = 43;
                        }
                        int i28 = 0;
                        if ((i & 32) != 0) {
                            i28 = 85;
                        }
                        int i29 = i27 + i28;
                        if ((i & 4) == 0) {
                            i14 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = -16777216 | (i26 << 16) | (i29 << 8) | (i14 + i7);
                    }
                } else {
                    int i30 = 0;
                    if ((i & 1) != 0) {
                        i30 = 85;
                    }
                    int i31 = 0;
                    if ((i & 16) != 0) {
                        i31 = 170;
                    }
                    int i32 = i30 + i31;
                    int i33 = 0;
                    if ((i & 2) != 0) {
                        i33 = 85;
                    }
                    int i34 = 0;
                    if ((i & 32) != 0) {
                        i34 = 170;
                    }
                    int i35 = i33 + i34;
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = 2130706432 | (i32 << 16) | (i35 << 8) | (i7 + i6);
                }
            }
            i++;
        } while (i < 256);
        return iArr;
    }
}
