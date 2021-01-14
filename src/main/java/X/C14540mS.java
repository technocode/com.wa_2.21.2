package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0mS  reason: invalid class name and case insensitive filesystem */
public final class C14540mS {
    public int A00;
    public ArrayList A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public final PendingIntent A04;
    public final Bundle A05;
    public final IconCompat A06;
    public final CharSequence A07;

    public C14540mS(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat A032 = IconCompat.A03(null, "", i);
        Bundle bundle = new Bundle();
        this.A06 = A032;
        this.A07 = AnonymousClass03E.A00(charSequence);
        this.A04 = pendingIntent;
        this.A05 = bundle;
        this.A01 = null;
        this.A00 = 0;
    }

    public C14550mT A00() {
        C14630mc[] r6;
        CharSequence[] charSequenceArr;
        Set set;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.A01;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C14630mc r1 = (C14630mc) it.next();
                if (r1.A04 || (!((charSequenceArr = r1.A05) == null || charSequenceArr.length == 0) || (set = r1.A03) == null || set.isEmpty())) {
                    arrayList2.add(r1);
                } else {
                    arrayList.add(r1);
                }
            }
        }
        C14630mc[] r5 = null;
        if (arrayList.isEmpty()) {
            r6 = null;
        } else {
            r6 = (C14630mc[]) arrayList.toArray(new C14630mc[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            r5 = (C14630mc[]) arrayList2.toArray(new C14630mc[arrayList2.size()]);
        }
        return new C14550mT(this.A06, this.A07, this.A04, this.A05, r5, r6, this.A00, this.A03);
    }
}
