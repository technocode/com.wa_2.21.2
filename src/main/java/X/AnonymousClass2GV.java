package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2GV  reason: invalid class name */
public class AnonymousClass2GV extends ArrayAdapter {
    public final /* synthetic */ AnonymousClass0QH A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2GV(AnonymousClass0QH r2, Context context, List list) {
        super(context, (int) R.layout.multiple_contact_picker_row, list);
        this.A00 = r2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass2GY r0;
        Object item = getItem(i);
        if (item != null) {
            C007003k r5 = (C007003k) item;
            if (view == null) {
                AnonymousClass0QH r4 = this.A00;
                view = r4.getLayoutInflater().inflate(R.layout.multiple_contact_picker_row, viewGroup, false);
                r0 = new AnonymousClass2GY(r4.A0U, ((AnonymousClass2C0) r4).A01, r4.A0Y, view);
                view.setTag(r0);
            } else {
                r0 = (AnonymousClass2GY) view.getTag();
            }
            this.A00.A0h(r0, r5);
            return view;
        }
        throw null;
    }
}
