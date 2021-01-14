package X;

import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3Sz  reason: invalid class name and case insensitive filesystem */
public class C72473Sz implements AnonymousClass13X {
    public final /* synthetic */ AnonymousClass3T0 A00;

    @Override // X.AnonymousClass13X
    public AnonymousClass13V A7z() {
        return null;
    }

    public C72473Sz(AnonymousClass3T0 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass13X
    public List A60(String str, boolean z) {
        List<AnonymousClass13V> A03 = C227813d.A03(str, z);
        if (A03.isEmpty()) {
            return A03;
        }
        if (!this.A00.A00) {
            LinkedList linkedList = new LinkedList();
            boolean z2 = false;
            for (AnonymousClass13V r2 : A03) {
                if (!z2) {
                    String str2 = r2.A02;
                    if (str2.startsWith("OMX.google")) {
                        StringBuilder A0S = AnonymousClass008.A0S("ListViewOptimizedExoPlayer/softwareDecoder=");
                        A0S.append(str2);
                        Log.d(A0S.toString());
                        z2 = true;
                        linkedList.add(0, r2);
                    }
                }
                linkedList.add(r2);
            }
            return linkedList;
        }
        AnonymousClass008.A1S(AnonymousClass008.A0S("ListViewOptimizedExoPlayer/firstDecoder="), ((AnonymousClass13V) A03.get(0)).A02);
        return A03;
    }
}
