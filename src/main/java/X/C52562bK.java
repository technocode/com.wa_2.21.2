package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2bK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52562bK implements AbstractC47972Kk {
    public final /* synthetic */ C39171r4 A00;
    public final /* synthetic */ C02290Bk A01;

    public /* synthetic */ C52562bK(C02290Bk r1, C39171r4 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC47972Kk
    public final AnonymousClass1V1 AN5() {
        C02290Bk r5 = this.A01;
        C39171r4 r4 = this.A00;
        r5.A0M.A01();
        C014508d r0 = r5.A0K.A01;
        r0.A05();
        r0.A06();
        int A06 = r5.A06();
        int i = (A06 * 100) / (A06 + 1);
        ArrayList A0F = r5.A0F();
        if (A0F.size() <= 0) {
            Log.i("msgstore/restore/backupfiles/none-found");
            return AnonymousClass1V1.A00(0);
        }
        Iterator it = A0F.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            StringBuilder A0S = AnonymousClass008.A0S("msgstore/restore/backupfiles ");
            A0S.append(file.getName());
            A0S.append(" (");
            A0S.append(file.length());
            A0S.append(")");
            Log.i(A0S.toString());
        }
        File parentFile = r5.A0D().getParentFile();
        if (!parentFile.exists()) {
            Log.d("msgstore/restore/createinternaldir");
            if (!parentFile.mkdirs()) {
                Log.w("msgstore/restore/createinternaldir failed");
            }
        } else {
            C006803i.A0m(r5.A0D());
        }
        return r5.A09(i, A0F, r4);
    }
}
