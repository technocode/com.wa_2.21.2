package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.2o8  reason: invalid class name and case insensitive filesystem */
public class C59692o8 implements AbstractC48882Od, AbstractC53972e9 {
    public final int A00;
    public final long A01;
    public final ContentResolver A02;
    public final Uri A03;
    public final File A04;
    public final boolean A05;

    @Override // X.AbstractC48882Od
    public long A5y() {
        return 0;
    }

    @Override // X.AbstractC48882Od
    public long A67() {
        return 0;
    }

    @Override // X.AbstractC48882Od
    public String A7T() {
        return "image/*";
    }

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 0;
    }

    @Override // X.AbstractC53972e9
    public byte A9q() {
        return 1;
    }

    public C59692o8(ContentResolver contentResolver, File file, boolean z, int i) {
        Uri.Builder buildUpon = Uri.fromFile(file).buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("flip-h", "1");
        }
        if (i != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(i));
        }
        Uri build = buildUpon.build();
        long length = file.length();
        this.A02 = contentResolver;
        this.A03 = build;
        this.A01 = length;
        this.A04 = file;
        this.A05 = z;
        this.A00 = i;
    }

    @Override // X.AbstractC48882Od
    public Uri A4W() {
        return this.A03;
    }

    @Override // X.AbstractC48882Od
    public String A5w() {
        return this.A03.getPath();
    }

    @Override // X.AbstractC53972e9
    public File A6P() {
        return this.A04;
    }

    @Override // X.AbstractC53972e9
    public int A8q() {
        return this.A00;
    }

    @Override // X.AbstractC53972e9
    public boolean AB4() {
        return this.A05;
    }

    @Override // X.AbstractC48882Od
    public Bitmap AQZ(int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        long j = (long) i;
        long j2 = j * j * 2;
        try {
            ContentResolver contentResolver = this.A02;
            Uri uri = this.A03;
            Matrix A0F = C02230Bd.A0F(contentResolver, uri);
            try {
                File A0B = C006803i.A0B(uri);
                parcelFileDescriptor = A0B != null ? ParcelFileDescriptor.open(A0B, 268435456) : contentResolver.openFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
                parcelFileDescriptor = null;
            }
            Bitmap A0L = C28051Sr.A0L(i, j2, parcelFileDescriptor);
            if (A0F == null || A0F.isIdentity()) {
                return A0L;
            }
            if (A0L != null) {
                return Bitmap.createBitmap(A0L, 0, 0, A0L.getWidth(), A0L.getHeight(), A0F, true);
            }
            return null;
        } catch (Exception e) {
            Log.e("UriImage", "got exception decoding bitmap ", e);
        }
    }

    @Override // X.AbstractC48882Od
    public long getContentLength() {
        return this.A01;
    }
}
