package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.DocumentPickerActivity;
import java.util.Collections;

/* renamed from: X.1I8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ DocumentPickerActivity A00;

    public /* synthetic */ AnonymousClass1I8(DocumentPickerActivity documentPickerActivity) {
        this.A00 = documentPickerActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        DocumentPickerActivity documentPickerActivity = this.A00;
        int headerViewsCount = i - documentPickerActivity.A0T().getHeaderViewsCount();
        if (headerViewsCount < 0) {
            documentPickerActivity.A0V();
            return;
        }
        AnonymousClass1LY r1 = (AnonymousClass1LY) documentPickerActivity.A08.get(headerViewsCount);
        if (documentPickerActivity.A02 != null) {
            documentPickerActivity.A0W(r1);
        } else {
            documentPickerActivity.A0X(Collections.singletonList(r1));
        }
    }
}
