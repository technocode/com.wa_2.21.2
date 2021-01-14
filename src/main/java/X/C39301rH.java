package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1rH  reason: invalid class name and case insensitive filesystem */
public class C39301rH implements AnonymousClass1XG {
    public final /* synthetic */ C08850bp A00;

    public C39301rH(C08850bp r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1XG
    public void AFY(int i) {
        this.A00.A00 = i;
    }

    @Override // X.AnonymousClass1XG
    public void AGc(AnonymousClass02U r12, UserJid userJid, long j, String str, long j2, String str2, Map map, int i, C11220fu r22) {
        ArrayList arrayList = new ArrayList(map.keySet().size());
        for (AnonymousClass02N r1 : map.keySet()) {
            C007003k A09 = this.A00.A03.A09(r1);
            if (!(A09 == null || A09.A08 == null)) {
                arrayList.add(A09);
            }
        }
        C08850bp r3 = this.A00;
        Collections.sort(arrayList, new C39291rG(r3.A02, r3.A04));
        r3.A01 = new AnonymousClass2RU(r12, userJid, str, arrayList, i, r22);
    }
}
