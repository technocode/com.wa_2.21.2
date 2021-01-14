package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.05C  reason: invalid class name */
public class AnonymousClass05C {
    public final C000300f A00;
    public final AnonymousClass04y A01;
    public final AnonymousClass00S A02;
    public final JniBridge A03;

    public AnonymousClass05C(AnonymousClass00S r1, JniBridge jniBridge, C000300f r3, AnonymousClass04y r4) {
        this.A02 = r1;
        this.A03 = jniBridge;
        this.A00 = r3;
        this.A01 = r4;
    }

    public final List A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JniBridge jniBridge = this.A03;
            Object jvidispatchOOO = JniBridge.jvidispatchOOO(1, jniBridge.getWajContext(), ((C05770Qa) it.next()).A01);
            if (jvidispatchOOO == null) {
                Log.e("wamsys/convertToNativePublicKeyList/public-key-conversion-failed");
                return null;
            }
            arrayList.add(jvidispatchOOO);
        }
        return arrayList;
    }
}
