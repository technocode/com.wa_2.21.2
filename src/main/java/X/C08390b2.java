package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0b2  reason: invalid class name and case insensitive filesystem */
public class C08390b2 extends AbstractC08400b3 {
    public final AnonymousClass02N A00;
    public final AnonymousClass0PA A01;
    public final C71383Or A02;
    public final AnonymousClass00T A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final Map A07 = new HashMap();
    public final boolean A08;

    public C08390b2(Context context, AnonymousClass00T r3, AnonymousClass0PA r4, Resources resources, C71383Or r6, List list, List list2, List list3, AnonymousClass02N r10, boolean z) {
        super(context, resources);
        this.A03 = r3;
        this.A01 = r4;
        this.A02 = r6;
        this.A04 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A00 = r10;
        this.A08 = z;
    }

    public final void A0F(AnonymousClass31h r7, int i) {
        r7.A02.setVisibility(0);
        r7.A03.setVisibility(0);
        r7.A01.setVisibility(8);
        AnonymousClass0PA r4 = this.A01;
        Uri uri = (Uri) this.A04.get(i);
        C71273Og r1 = new C71273Og(this, r7, i);
        if (r4 != null) {
            C09850dd r2 = new C09850dd(r4, uri, r1);
            AnonymousClass0JW r0 = (AnonymousClass0JW) this.A07.put(Integer.valueOf(i), r2);
            if (r0 != null) {
                r0.A00.cancel(true);
            }
            this.A03.ANC(r2, new Void[0]);
            return;
        }
        throw null;
    }
}
