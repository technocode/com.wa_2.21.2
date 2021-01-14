package X;

import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2k0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2k0 implements AbstractC03150Ez {
    public final /* synthetic */ C60622pp A00;

    public /* synthetic */ AnonymousClass2k0(C60622pp r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C60622pp r1 = this.A00;
        Throwable th = (Throwable) obj;
        StringBuilder A0S = AnonymousClass008.A0S("mediaupload/oncancelled, request=");
        A0S.append(r1.A0P);
        A0S.append(", this=");
        A0S.append(r1);
        Log.i(A0S.toString(), th);
        if (th instanceof FileNotFoundException) {
            r1.A07(7);
        } else if (th instanceof IOException) {
            if (r1.A0M.A04(th)) {
                r1.A07(18);
            } else {
                r1.A07(3);
            }
        } else if (th instanceof C667135n) {
            r1.A07(5);
        } else if (th instanceof NoSuchAlgorithmException) {
            r1.A07(16);
        } else {
            r1.A07(1);
        }
    }
}
