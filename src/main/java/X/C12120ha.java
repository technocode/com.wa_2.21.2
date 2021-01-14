package X;

import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.0ha  reason: invalid class name and case insensitive filesystem */
public class C12120ha extends C05390Oi {
    public ProfilePhotoChange A00;
    public String A01;

    public C12120ha(C007303n r2, long j) {
        super(r2, j, 6);
    }

    @Override // X.AbstractC007503q
    public void A0d(String str) {
        synchronized (this.A0o) {
            this.A01 = str;
        }
    }

    public String A0v() {
        String str;
        synchronized (this.A0o) {
            str = this.A01;
        }
        return str;
    }
}
