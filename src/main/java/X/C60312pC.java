package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2pC  reason: invalid class name and case insensitive filesystem */
public class C60312pC extends AbstractC60272p5 {
    public final File A00;
    public final File A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C60312pC(AnonymousClass0F6 r14, File file, File file2, AnonymousClass0NJ r17) {
        super(r14.A01, r14.A00, r14.A04, r14.A02, r14.A03, null);
        this.A01 = file;
        this.A00 = file2;
        int i = r17.A00;
        if ((i & 1) == 1 && (i & 2) == 2 && (i & 16) == 16 && (i & 32) == 32) {
            byte[] A012 = r17.A04.A01();
            byte[] A013 = r17.A03.A01();
            byte[] A014 = r17.A02.A01();
            this.A03 = r17.A05;
            this.A02 = Base64.encodeToString(A012, 0);
            this.A05 = Base64.encodeToString(A013, 0);
            this.A04 = Base64.encodeToString(A014, 0);
            return;
        }
        StringBuilder sb = new StringBuilder("external-mutations-downloader: Fields missing in external blob: ");
        sb.append(r17);
        Log.e(sb.toString());
        throw new C52812bn("Fields missing in external blob", null);
    }
}
