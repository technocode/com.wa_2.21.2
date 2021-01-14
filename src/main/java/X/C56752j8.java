package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: X.2j8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56752j8 implements AbstractC03150Ez {
    public final /* synthetic */ C60602pn A00;

    public /* synthetic */ C56752j8(C60602pn r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C60602pn r5 = this.A00;
        if (obj instanceof IOException) {
            AnonymousClass1W8 r2 = new AnonymousClass1W8(9, null, false);
            StringBuilder A0S = AnonymousClass008.A0S("MediaDownload/onPostExecute; mediaHash=");
            A0S.append(r5.A0Z.A0C);
            A0S.append(" status=");
            A0S.append(r2);
            Log.i(A0S.toString());
            r5.A0C(r2);
            r5.A0D(r2);
        } else if (obj instanceof CancellationException) {
            r5.A0D(new AnonymousClass1W8(13, null, false));
        }
    }
}
