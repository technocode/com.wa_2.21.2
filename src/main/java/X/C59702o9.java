package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2o9  reason: invalid class name and case insensitive filesystem */
public class C59702o9 implements AbstractC48882Od, AbstractC53972e9 {
    public final long A00;
    public final Uri A01;
    public final File A02;

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
        return "video/*";
    }

    @Override // X.AbstractC53972e9
    public int A8q() {
        return 0;
    }

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 1;
    }

    @Override // X.AbstractC53972e9
    public byte A9q() {
        return 3;
    }

    @Override // X.AbstractC53972e9
    public boolean AB4() {
        return false;
    }

    public C59702o9(File file) {
        Uri fromFile = Uri.fromFile(file);
        long length = file.length();
        this.A01 = fromFile;
        this.A00 = length;
        this.A02 = file;
    }

    @Override // X.AbstractC48882Od
    public Uri A4W() {
        return this.A01;
    }

    @Override // X.AbstractC48882Od
    public String A5w() {
        return this.A01.getPath();
    }

    @Override // X.AbstractC53972e9
    public File A6P() {
        return this.A02;
    }

    @Override // X.AbstractC48882Od
    public Bitmap AQZ(int i) {
        File file;
        String A5w = A5w();
        if (A5w == null) {
            file = null;
        } else {
            file = new File(A5w);
        }
        return C002001d.A0V(file);
    }

    @Override // X.AbstractC48882Od
    public long getContentLength() {
        return this.A00;
    }
}
