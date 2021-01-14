package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.0ee  reason: invalid class name and case insensitive filesystem */
public class C10450ee extends AnonymousClass0JW {
    public final AnonymousClass009 A00;
    public final C000300f A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass03S A03;
    public final AnonymousClass0XO A04;
    public final C71213Oa A05;
    public final C007703s A06;

    public C10450ee(C71213Oa r1, AnonymousClass00G r2, AnonymousClass009 r3, C000300f r4, AnonymousClass0XO r5, AnonymousClass03S r6, C007703s r7) {
        this.A05 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A06 = r7;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC48882Od r7 = (AbstractC48882Od) obj;
        if (r7 == null) {
            C74003Zv r2 = this.A05.A00;
            r2.A00 = null;
            ((AnonymousClass3OZ) r2).A00.A00.remove(Integer.valueOf(r2.A00()));
        } else if (!super.A00.isCancelled()) {
            C71213Oa r0 = this.A05;
            C74003Zv r5 = r0.A00;
            String str = r0.A01;
            Context context = r5.A0H.getContext();
            C71223Ob r22 = new C71223Ob(r5, r7, r5.A04.A00.getResources().getDimensionPixelSize(R.dimen.gallery_picker_folder_thumb_size));
            C71233Oc r1 = new C71233Oc(r5, r22, context, str);
            r5.A09.setTag(r22);
            r5.A07.A02(r22, r1);
            ((AnonymousClass3OZ) r5).A00.A00.remove(Integer.valueOf(r5.A00()));
        }
    }
}
