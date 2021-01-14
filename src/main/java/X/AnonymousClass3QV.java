package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3QV  reason: invalid class name */
public class AnonymousClass3QV extends AnonymousClass0JW {
    public final C03570Gt A00;
    public final AnonymousClass33Y A01;

    public AnonymousClass3QV(C03570Gt r1, AnonymousClass33Y r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        this.A01.AH1(((Bitmap[]) objArr)[0]);
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        AnonymousClass33N[] r5 = (AnonymousClass33N[]) objArr;
        if (r5 != null) {
            C03570Gt r1 = this.A00;
            AnonymousClass33N r3 = r5[0];
            AnonymousClass00E.A00();
            boolean z = r3.A0N;
            if (!z) {
                String str = r3.A0D;
                AnonymousClass00E.A00();
                File A08 = r1.A08(str);
                if (A08 == null || !A08.exists()) {
                    return null;
                }
                return BitmapFactory.decodeFile(A08.getAbsolutePath());
            } else if (!z) {
                Log.e("StickerRepository/retrieveThirdPartyTrayIconFromFile attempted to get cached tray of non-third party pack");
                return null;
            } else {
                File A02 = r1.A0K.A02(r3.A0D);
                if (A02 == null || !A02.exists()) {
                    return null;
                }
                return BitmapFactory.decodeFile(A02.getAbsolutePath());
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            this.A01.AH8();
        } else {
            this.A01.AHD(bitmap);
        }
    }
}
