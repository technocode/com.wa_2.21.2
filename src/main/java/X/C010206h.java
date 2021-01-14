package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.06h  reason: invalid class name and case insensitive filesystem */
public class C010206h {
    public AbstractC009005t A00;
    public AbstractC009005t A01;
    public C37451oF A02;
    public C37611oV A03;
    public WeakReference A04;
    public List A05;
    public Map A06;
    public Map A07;
    public Map A08 = new HashMap();
    public final C38041pE A09;
    public final C38081pI A0A;
    public final List A0B;
    public final List A0C;
    public final Map A0D;

    static {
        new Handler(Looper.getMainLooper());
    }

    public C010206h(AnonymousClass1GP r3, C38081pI r4, C38041pE r5) {
        C37411oB r1 = ((C37431oD) r3).A00;
        this.A01 = (AbstractC009005t) r1.A00;
        this.A05 = r1.A01;
        this.A0C = new ArrayList();
        this.A0D = new HashMap();
        this.A0B = new ArrayList();
        this.A0A = r4;
        this.A09 = r5;
    }

    public final Pair A00(Map map, Map map2, List list) {
        Iterator it = list.iterator();
        HashMap hashMap = null;
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    C38071pH r2 = (C38071pH) it2.next();
                    String str = r2.A01;
                    HashMap hashMap2 = map2;
                    if (hashMap != null) {
                        hashMap2 = hashMap;
                    }
                    if (!hashMap2.containsKey(str)) {
                        if (hashMap == null) {
                            hashMap = new HashMap(map2);
                        }
                        hashMap.put(str, r2);
                    }
                    if (!map.containsKey(str)) {
                        String str2 = r2.A02;
                        if (this.A09 != null) {
                            C009205v.A00().A04.get(str2);
                            throw new RuntimeException(AnonymousClass008.A0K("Missing variable module with type: ", str2));
                        }
                        throw null;
                    }
                }
            }
        }
        if (hashMap != null) {
            map2 = hashMap;
        }
        return new Pair(map, map2);
    }

    public AbstractC009005t A01() {
        AbstractC009005t r0;
        if (C008805h.A1L()) {
            C38081pI r4 = this.A0A;
            if (r4 != null) {
                C33471gp.A00("Bloks SnapshotComponent", null);
                try {
                    List list = this.A0C;
                    if (list.isEmpty()) {
                        r0 = this.A01;
                    } else {
                        r0 = C008805h.A0L(this.A01, new C37591oT(list));
                    }
                    if (r4 != null) {
                        return r0;
                    }
                    throw null;
                } finally {
                    if (r4 != null) {
                        AnonymousClass112.A00();
                        throw th;
                    }
                }
            } else {
                throw null;
            }
        } else {
            throw new RuntimeException("Tree operations are only supported from the UI Thread");
        }
    }

    public void A02() {
        if (C008805h.A1L()) {
            C38081pI r2 = this.A0A;
            if (r2 != null) {
                C33471gp.A00("Bloks ModelMutation", null);
                AbstractC009005t A012 = A01();
                boolean z = false;
                boolean z2 = false;
                if (this.A01 != A012) {
                    z2 = true;
                }
                this.A01 = A012;
                this.A0C.clear();
                if (r2 != null) {
                    AnonymousClass112.A00();
                    Map map = this.A08;
                    Map map2 = this.A07;
                    List list = this.A0B;
                    this.A04.get();
                    Pair A002 = A00(map, map2, list);
                    Map map3 = (Map) A002.first;
                    this.A07 = (Map) A002.second;
                    list.clear();
                    Map map4 = this.A0D;
                    if (!map4.isEmpty()) {
                        Map map5 = this.A08;
                        if (map3 == map5) {
                            map3 = new HashMap(map5);
                        }
                        map3.putAll(map4);
                        map4.clear();
                    }
                    if (map3 != this.A08) {
                        z = true;
                    }
                    this.A08 = map3;
                    C37611oV r1 = this.A03;
                    if (r1 == null) {
                        return;
                    }
                    if (!z && !z2) {
                        return;
                    }
                    if (r1 != null) {
                        r1.A00.A02(new C37561oQ((AbstractC008905s) r1.A01.A01, r1.A02));
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw new RuntimeException("Tree operations are only supported from the UI Thread");
    }

    public void A03(long j, AbstractC25361Gp r6) {
        if (C008805h.A1L()) {
            this.A0C.add(new Pair(new C37571oR(j), r6));
            return;
        }
        throw new RuntimeException("Tree operations are only supported from the UI Thread");
    }

    public void A04(long j, AbstractC25361Gp r6) {
        if (C008805h.A1L()) {
            this.A0C.add(new Pair(new C37581oS(j), r6));
            return;
        }
        throw new RuntimeException("Tree operations are only supported from the UI Thread");
    }
}
