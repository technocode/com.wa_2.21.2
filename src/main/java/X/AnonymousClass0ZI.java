package X;

import com.whatsapp.util.Log;

/* renamed from: X.0ZI  reason: invalid class name */
public class AnonymousClass0ZI extends AbstractC007503q {
    public int A00;

    public AnonymousClass0ZI(C007303n r2, long j) {
        super(r2, j, (byte) 12);
    }

    public AnonymousClass0ZI(C007303n r3, long j, byte[] bArr, int i) {
        super(r3, j, (byte) 12);
        StringBuilder A0S = AnonymousClass008.A0S("FMessageFuture/futureproof/size=");
        A0S.append(Integer.valueOf(bArr.length));
        Log.w(A0S.toString());
        A0o(bArr);
        this.A00 = i;
    }
}
