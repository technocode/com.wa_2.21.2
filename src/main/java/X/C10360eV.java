package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupAdminPickerActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0eV  reason: invalid class name and case insensitive filesystem */
public class C10360eV extends AnonymousClass0JW {
    public final C014308b A00 = C014308b.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final String A02;
    public final WeakReference A03;
    public final List A04 = new ArrayList();

    public C10360eV(GroupAdminPickerActivity groupAdminPickerActivity, List list, String str) {
        this.A03 = new WeakReference(groupAdminPickerActivity);
        this.A04.addAll(list);
        this.A02 = str;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A03.get();
        if (groupAdminPickerActivity != null && !C002001d.A3D(groupAdminPickerActivity)) {
            C54872fd r2 = groupAdminPickerActivity.A09;
            String str = groupAdminPickerActivity.A0B;
            r2.A01 = list;
            r2.A00 = AnonymousClass1YB.A03(str, r2.A02.A0K);
            ((AbstractC16300pa) r2).A01.A00();
            TextView textView = (TextView) groupAdminPickerActivity.findViewById(R.id.search_no_matches);
            if (!list.isEmpty() || TextUtils.isEmpty(groupAdminPickerActivity.A0B)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(groupAdminPickerActivity.getString(R.string.search_no_results, groupAdminPickerActivity.A0B));
        }
    }
}
