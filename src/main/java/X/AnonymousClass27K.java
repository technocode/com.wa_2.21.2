package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.List;

/* renamed from: X.27K  reason: invalid class name */
public class AnonymousClass27K extends AbstractC30331b9 {
    public List A00;
    public final AnonymousClass088 A01 = AnonymousClass088.A00();
    public final C000300f A02 = C000300f.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final File[] A04;

    public AnonymousClass27K(Context context) {
        super(context);
        File file = this.A01.A04().A02;
        AnonymousClass089.A03(file, false);
        this.A04 = new File[]{new File(Environment.getExternalStorageDirectory(), "Download"), Environment.getExternalStorageDirectory(), file, new File(Environment.getExternalStorageDirectory(), "Documents")};
    }

    @Override // X.C15650oR
    public void A02() {
        List list = this.A00;
        if (list != null && !this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A03(list);
            }
        }
        boolean z = ((C15650oR) this).A03;
        ((C15650oR) this).A03 = false;
        super.A04 |= z;
        if (z || this.A00 == null) {
            A00();
        }
    }

    @Override // X.C15650oR
    public void A03(Object obj) {
        List list = (List) obj;
        if (!this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A03(list);
            }
        }
    }
}
