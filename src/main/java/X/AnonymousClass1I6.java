package X;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.search.verification.client.R;
import com.whatsapp.DocumentPickerActivity;
import java.util.List;

/* renamed from: X.1I6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I6 implements AdapterView.OnItemLongClickListener {
    public final /* synthetic */ DocumentPickerActivity A00;

    public /* synthetic */ AnonymousClass1I6(DocumentPickerActivity documentPickerActivity) {
        this.A00 = documentPickerActivity;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        DocumentPickerActivity documentPickerActivity = this.A00;
        int headerViewsCount = i - documentPickerActivity.A0T().getHeaderViewsCount();
        if (headerViewsCount >= 0) {
            AnonymousClass1LY r1 = (AnonymousClass1LY) documentPickerActivity.A08.get(headerViewsCount);
            if (documentPickerActivity.A02 != null) {
                documentPickerActivity.A0W(r1);
            } else {
                List list = documentPickerActivity.A0B;
                list.clear();
                list.add(r1);
                C002001d.A2R(documentPickerActivity, documentPickerActivity.A0I, ((AnonymousClass2C0) documentPickerActivity).A01.A0A(R.plurals.n_items_selected, (long) list.size(), Integer.valueOf(list.size())));
                documentPickerActivity.A02 = documentPickerActivity.A0B(documentPickerActivity.A0A);
                documentPickerActivity.A03.notifyDataSetChanged();
                return true;
            }
        }
        return true;
    }
}
