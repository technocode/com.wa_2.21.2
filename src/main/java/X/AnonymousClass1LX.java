package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.DocumentPickerActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1LX  reason: invalid class name */
public class AnonymousClass1LX extends BaseAdapter implements Filterable {
    public final AnonymousClass1LZ A00 = new AnonymousClass1LZ(this.A01);
    public final /* synthetic */ DocumentPickerActivity A01;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public boolean isEmpty() {
        return false;
    }

    public AnonymousClass1LX(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public int getCount() {
        List list = this.A01.A08;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Filter getFilter() {
        return this.A00;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C26461La r7;
        String A0K;
        if (view != null) {
            r7 = (C26461La) view.getTag();
        } else {
            view = this.A01.getLayoutInflater().inflate(R.layout.document_picker_item, (ViewGroup) null, false);
            r7 = new C26461La(view);
            view.setTag(r7);
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        AnonymousClass1LY r4 = (AnonymousClass1LY) documentPickerActivity.A08.get(i);
        ImageView imageView = r7.A01;
        Context context = view.getContext();
        File file = r4.A02;
        if (file == null) {
            A0K = "";
        } else {
            A0K = C006803i.A0K(file.getAbsolutePath());
        }
        imageView.setImageDrawable(AnonymousClass0ZD.A04(context, C02230Bd.A0Q(A0K), A0K, false));
        TextView textView = r7.A04;
        Context context2 = view.getContext();
        String name = file.getName();
        ArrayList arrayList = documentPickerActivity.A06;
        AnonymousClass01X r6 = ((AnonymousClass2C0) documentPickerActivity).A01;
        textView.setText(AbstractC11890hA.A02(context2, name, arrayList, r6));
        r7.A03.setText(C002001d.A1Y(r6, r4.A01));
        TextView textView2 = r7.A02;
        long j = r4.A00;
        textView2.setText(C002001d.A1e(r6, j, false));
        textView2.setContentDescription(C002001d.A1e(r6, j, true));
        View view2 = r7.A00;
        view2.setContentDescription(r6.A06(R.string.checked_icon_label));
        if (documentPickerActivity.A0B.contains(r4)) {
            view.setBackgroundResource(R.drawable.contact_row_selection);
            view2.setVisibility(0);
            return view;
        }
        view.setBackgroundResource(0);
        view2.setVisibility(8);
        return view;
    }
}
