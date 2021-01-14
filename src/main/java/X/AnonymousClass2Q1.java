package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Q1  reason: invalid class name */
public abstract class AnonymousClass2Q1 {
    public String A00;
    public ArrayList A01 = new ArrayList();
    public boolean A02;
    public boolean A03;
    public final List A04 = new ArrayList();

    public void A00(String str, Collection collection, boolean z) {
        String str2;
        StringBuilder A0Z = AnonymousClass008.A0Z("gif/search/updating result \"", str, "\"");
        if (z) {
            str2 = " failed";
        } else {
            str2 = "";
        }
        A0Z.append(str2);
        Log.d(A0Z.toString());
        AnonymousClass00E.A01();
        this.A02 = z;
        if (collection != null) {
            this.A04.addAll(collection);
        }
        this.A00 = str;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C54492f0) it.next()).A08(this);
        }
        this.A03 = false;
    }
}
