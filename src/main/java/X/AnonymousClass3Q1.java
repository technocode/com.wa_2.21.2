package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.3Q1  reason: invalid class name */
public class AnonymousClass3Q1 extends C13380k9 {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();
    public final AnonymousClass0KB A01 = AnonymousClass0KB.A00();

    public AnonymousClass3Q1(Context context, View view) {
        super(context, view, 0, R.attr.popupMenuStyle);
        AnonymousClass0T8 r5 = this.A02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass02R(Integer.valueOf((int) R.id.menuitem_forward), this.A00.A06(R.string.menuitem_status_forward)));
        arrayList.add(new AnonymousClass02R(Integer.valueOf((int) R.id.menuitem_share_status_third_party), this.A00.A06(R.string.menuitem_status_share)));
        if (this.A01.A01()) {
            arrayList.add(new AnonymousClass02R(Integer.valueOf((int) R.id.menuitem_share_status_facebook), this.A00.A06(R.string.menuitem_status_share_with_fb)));
        }
        arrayList.add(new AnonymousClass02R(Integer.valueOf((int) R.id.menuitem_delete), this.A00.A06(R.string.menuitem_status_delete)));
        for (int i = 0; i < arrayList.size(); i++) {
            AnonymousClass02R r1 = (AnonymousClass02R) arrayList.get(i);
            Object obj = r1.A00;
            if (obj != null) {
                Number number = (Number) obj;
                Object obj2 = r1.A01;
                if (obj2 != null) {
                    r5.add(0, number.intValue(), 0, (String) obj2);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }
}
