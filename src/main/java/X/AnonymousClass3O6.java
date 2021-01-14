package X;

import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3O6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3O6 implements AbstractC03150Ez {
    public final /* synthetic */ AbstractC007503q A00;
    public final /* synthetic */ AnonymousClass3ZS A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ AnonymousClass3O6(AnonymousClass3ZS r1, AbstractC007503q r2, List list) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = list;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass3ZS r11 = this.A01;
        AbstractC007503q r0 = this.A00;
        List list = this.A02;
        AnonymousClass36V r14 = (AnonymousClass36V) obj;
        if (r0 instanceof C04830Lz) {
            AnonymousClass1Z4 r2 = r14.A03;
            if (r2 != null) {
                r11.A0C.A07(r2, r11.A06);
                r11.A07.setTitleAndDescription(C003701u.A07(r2.A07(), 128), null, list);
                List list2 = r2.A05;
                if (!(list2 == null || list2.isEmpty())) {
                    r11.A07.setSubText(((AnonymousClass1Z3) r2.A05.get(0)).A02, list);
                    return;
                }
                return;
            }
            return;
        }
        List list3 = r14.A02;
        for (int i = 0; i < r11.A09.size(); i++) {
            if (i < list3.size()) {
                r11.A0C.A07((AnonymousClass1Z4) list3.get(i), (ImageView) r11.A09.get(i));
            }
        }
        int i2 = r14.A00;
        AnonymousClass1Z4 r02 = r14.A03;
        String A07 = r02 == null ? null : r02.A07();
        if (A07 != null) {
            int i3 = i2 - 1;
            r11.A07.setTitleAndDescription(r11.A0D.A0A(R.plurals.contacts_array_title, (long) i3, C003701u.A07(A07, 128), Integer.valueOf(i3)), null, list);
            return;
        }
        r11.A07.setTitleAndDescription(r11.A0D.A0A(R.plurals.n_contacts_message_title, (long) i2, Integer.valueOf(i2)), null, null);
    }
}
