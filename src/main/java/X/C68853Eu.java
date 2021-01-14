package X;

import android.os.Build;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.3Eu  reason: invalid class name and case insensitive filesystem */
public class C68853Eu extends AbstractC04060Iw {
    public final /* synthetic */ AbstractC27431Py A00;
    public final /* synthetic */ C61902tv A01;
    public final /* synthetic */ byte[] A02;

    public C68853Eu(C61902tv r1, AbstractC27431Py r2, byte[] bArr) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = bArr;
    }

    @Override // X.AbstractC04060Iw
    public void A00() {
        this.A01.A02.A07(null, "sign: authentication failed", null);
        this.A00.ADB();
    }

    @Override // X.AbstractC04060Iw
    public void A01(int i, CharSequence charSequence) {
        C018809u r2 = this.A01.A02;
        StringBuilder sb = new StringBuilder("sign: authentication error=");
        sb.append(i);
        sb.append(" errString=");
        sb.append(i);
        r2.A04(sb.toString());
        this.A00.ADA(i, charSequence);
    }

    @Override // X.AbstractC04060Iw
    public void A02(int i, CharSequence charSequence) {
        C018809u r2 = this.A01.A02;
        StringBuilder sb = new StringBuilder("sign: authentication help=");
        sb.append(i);
        sb.append(" errString=");
        sb.append((Object) charSequence);
        r2.A07(null, sb.toString(), null);
        this.A00.ADC(i, charSequence);
    }

    @Override // X.AbstractC04060Iw
    public void A03(C14730mn r5) {
        try {
            Signature signature = r5.A00.A00;
            if (signature != null) {
                signature.update(this.A02);
                this.A00.ADD(signature.sign());
                return;
            }
            throw null;
        } catch (SignatureException e) {
            C018809u r2 = this.A01.A02;
            StringBuilder A0S = AnonymousClass008.A0S("sign: api=");
            A0S.append(Build.VERSION.SDK_INT);
            A0S.append(" error: ");
            A0S.append(e.toString());
            r2.A04(A0S.toString());
            this.A00.ADD(null);
        }
    }
}
