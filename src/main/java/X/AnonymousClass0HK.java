package X;

import android.graphics.Bitmap;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: X.0HK  reason: invalid class name */
public class AnonymousClass0HK {
    public static volatile AnonymousClass0HK A04;
    public AnonymousClass01I A00;
    public AnonymousClass0ES A01;
    public AnonymousClass08C A02;
    public AnonymousClass03S A03;

    public AnonymousClass0HK(AnonymousClass01I r1, AnonymousClass08C r2, AnonymousClass0ES r3, AnonymousClass03S r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass0HK A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0HK.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0HK(AnonymousClass01I.A00(), AnonymousClass08C.A00(), AnonymousClass0ES.A00(), AnonymousClass03S.A00());
                }
            }
        }
        return A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0145, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        if (r2 != null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A01(X.C007003k r21, int r22, float r23) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HK.A01(X.03k, int, float):android.graphics.Bitmap");
    }

    public Bitmap A02(C007003k r4, int i, float f, boolean z) {
        if (z) {
            AnonymousClass08C r0 = this.A02;
            Bitmap bitmap = (Bitmap) r0.A02.A02().A02(r4.A05(i, f));
            if (bitmap != null) {
                return bitmap;
            }
        }
        Bitmap A012 = A01(r4, i, f);
        if (z && A012 != null) {
            AnonymousClass08C r02 = this.A02;
            r02.A02.A02().A05(r4.A05(i, f), A012);
        }
        return A012;
    }

    public InputStream A03(C007003k r6, boolean z) {
        File A032;
        if (!r6.A0R) {
            return null;
        }
        if (z) {
            A032 = this.A02.A02(r6);
            if (!A032.exists()) {
                A032 = this.A02.A03(r6);
                if (r6.A01 > 0 && this.A03.A0A(Environment.getExternalStorageState())) {
                    StringBuilder A0S = AnonymousClass008.A0S("contactPhotosBitmapManager/getphotostream/");
                    A0S.append(r6.A09);
                    A0S.append(" full file missing id:");
                    A0S.append(r6.A01);
                    Log.e(A0S.toString());
                    r6.A01 = 0;
                }
            }
        } else {
            A032 = this.A02.A03(r6);
            if (!A032.exists()) {
                A032 = this.A02.A02(r6);
                if (r6.A02 > 0) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("contactPhotosBitmapManager/getphotostream/");
                    A0S2.append(r6.A09);
                    A0S2.append(" thumb file missing id:");
                    A0S2.append(r6.A02);
                    Log.e(A0S2.toString());
                    r6.A02 = 0;
                }
            }
        }
        if (!A032.exists()) {
            return null;
        }
        try {
            return new FileInputStream(A032);
        } catch (FileNotFoundException e) {
            StringBuilder A0S3 = AnonymousClass008.A0S("contactPhotosBitmapManager/getphotostream/");
            A0S3.append(r6.A09);
            A0S3.append(" photo file not found");
            Log.e(A0S3.toString(), e);
            return null;
        }
    }

    public final boolean A04(C007003k r7) {
        return !this.A00.A09(r7.A09) && !(r7 instanceof C11230fv) && r7.A06 + 604800000 < System.currentTimeMillis();
    }
}
