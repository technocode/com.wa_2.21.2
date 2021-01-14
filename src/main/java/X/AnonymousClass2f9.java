package X;

import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2f9  reason: invalid class name */
public class AnonymousClass2f9 implements AbstractC02970Eh {
    public final /* synthetic */ C60542pf A00;

    @Override // X.AbstractC02970Eh
    public void AFt(Exception exc) {
    }

    public AnonymousClass2f9(C60542pf r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02970Eh
    public void AG3(String str, File file, byte[] bArr) {
        C60542pf r2 = this.A00;
        r2.A02 = null;
        if (file == null) {
            AnonymousClass008.A19("gif/preview/holder file is null for ", str);
            return;
        }
        String str2 = r2.A03;
        if (!str.equals(str2)) {
            AnonymousClass008.A1S(AnonymousClass008.A0Z("gif/preview/holder outdated url ", str, " current "), str2);
            return;
        }
        if (bArr != null) {
            r2.A06.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, C02580Cq.A08));
        }
        AnonymousClass008.A16("gif/preview/holder player created for ", str);
        AnonymousClass2Q2 r3 = r2.A0C;
        if (r3 != null) {
            try {
                C04900Mh A01 = C04900Mh.A01(ParcelFileDescriptor.open(new File(file.getAbsolutePath()), 268435456), false);
                r3.A01 = A01;
                C20250wO A04 = A01.A04(r3.A02.getContext());
                r3.A00 = A04;
                A04.start();
            } catch (IOException e) {
                Log.e("gif/loading/io-exception", e);
            }
            r3.A03.setImageDrawable(r3.A00);
        }
        r2.A06.setVisibility(8);
    }
}
