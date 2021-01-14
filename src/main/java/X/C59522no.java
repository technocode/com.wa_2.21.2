package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2no  reason: invalid class name and case insensitive filesystem */
public class C59522no extends AbstractC72343Sm {
    public final ActivityC004702f A00;
    public final C56832jG A01;
    public final AnonymousClass0ML A02;

    public C59522no(ActivityC004702f r1, AnonymousClass0ML r2, C56832jG r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass15D
    public AnonymousClass15E A3F() {
        File file;
        AnonymousClass0ML r4 = this.A02;
        AnonymousClass0M4 r1 = ((AnonymousClass0M3) r4).A02;
        if (r1 == null) {
            throw null;
        } else if (!r1.A0P || (file = r1.A0F) == null || !file.exists()) {
            return new C74313ac(this.A00, r4, super.A00, this.A01);
        } else {
            return new C53542dR(this.A00, Uri.fromFile(r1.A0F));
        }
    }
}
