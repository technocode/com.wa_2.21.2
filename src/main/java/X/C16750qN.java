package X;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* renamed from: X.0qN  reason: invalid class name and case insensitive filesystem */
public class C16750qN {
    public EnumC16760qO A00;
    public AbstractC17020qq A01;
    public ArrayList A02;
    public Set A03;
    public Executor A04;
    public Executor A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final C16770qP A0A;
    public final Class A0B = WorkDatabase.class;
    public final String A0C;

    public C16750qN(Context context, String str) {
        this.A09 = context;
        this.A0C = str;
        this.A00 = EnumC16760qO.AUTOMATIC;
        this.A08 = true;
        this.A0A = new C16770qP();
    }

    public void A00(AbstractC16820qU... r10) {
        if (this.A03 == null) {
            this.A03 = new HashSet();
        }
        for (AbstractC16820qU r2 : r10) {
            this.A03.add(Integer.valueOf(r2.A01));
            this.A03.add(Integer.valueOf(r2.A00));
        }
        C16770qP r6 = this.A0A;
        if (r6 == null) {
            throw null;
        }
        for (AbstractC16820qU r5 : r10) {
            int i = r5.A01;
            int i2 = r5.A00;
            AbstractMap abstractMap = (AbstractMap) r6.A00.get(Integer.valueOf(i));
            if (abstractMap == null) {
                abstractMap = new TreeMap();
                r6.A00.put(Integer.valueOf(i), abstractMap);
            }
            Integer valueOf = Integer.valueOf(i2);
            Object obj = abstractMap.get(valueOf);
            if (obj != null) {
                StringBuilder sb = new StringBuilder("Overriding migration ");
                sb.append(obj);
                sb.append(" with ");
                sb.append(r5);
                Log.w("ROOM", sb.toString());
            }
            abstractMap.put(valueOf, r5);
        }
    }
}
