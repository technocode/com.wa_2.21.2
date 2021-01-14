package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.2jx  reason: invalid class name and case insensitive filesystem */
public class C57252jx implements AbstractC50062Tg {
    public final AnonymousClass00C A00;
    public final File A01;

    public C57252jx(AnonymousClass00C r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }

    @Override // X.AbstractC50062Tg
    public OutputStream ALt(AbstractC28621Va r6) {
        if (r6.getContentLength() <= this.A00.A02()) {
            try {
                File file = this.A01;
                C006803i.A0m(file);
                return new FileOutputStream(file, false);
            } catch (FileNotFoundException e) {
                Log.e("plainfiledownload/FileNotFoundException", e);
                throw new AnonymousClass2TZ(9);
            }
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("plainfiledownload/not enough space to store the file: ");
            A0S.append(this.A01);
            Log.w(A0S.toString());
            throw new AnonymousClass2TZ(4);
        }
    }
}
