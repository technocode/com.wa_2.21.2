package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.1SZ  reason: invalid class name */
public final class AnonymousClass1SZ extends ArrayAdapter {
    public final Context A00;
    public final LayoutInflater A01;
    public final AnonymousClass0HJ A02;
    public final C014308b A03;
    public final AnonymousClass0YX A04;
    public final AnonymousClass01X A05;
    public final AnonymousClass31y A06;

    public int getViewTypeCount() {
        return 3;
    }

    public AnonymousClass1SZ(Context context, AnonymousClass0HJ r3, C014308b r4, AnonymousClass01X r5, AnonymousClass31y r6, AnonymousClass0YX r7, List list) {
        super(context, (int) R.layout.contact_picker_row, list);
        this.A00 = context;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r7;
        this.A01 = LayoutInflater.from(context);
    }

    public int getItemViewType(int i) {
        AbstractC27921Sd r0 = (AbstractC27921Sd) getItem(i);
        if (r0 == null) {
            return super.getItemViewType(i);
        }
        return r0.A6v();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AbstractC27901Sb r2;
        View view2 = view;
        AbstractC27921Sd r1 = (AbstractC27921Sd) getItem(i);
        if (r1 == null) {
            return super.getView(i, view, viewGroup);
        }
        if (view == null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                view2 = this.A01.inflate(R.layout.contact_picker_row, viewGroup, false);
                view2.findViewById(R.id.contactpicker_row_phone_type).setVisibility(8);
                r2 = new C42811xK(this.A00, this.A03, this.A05, this.A06, this.A04, view2);
            } else if (itemViewType == 1) {
                view2 = this.A01.inflate(R.layout.contact_picker_row, viewGroup, false);
                view2.findViewById(R.id.contactpicker_row_phone_type).setVisibility(8);
                r2 = new C42831xM(this.A02, this.A03, this.A05, this.A06, view2);
            } else if (itemViewType != 2) {
                return super.getView(i, null, viewGroup);
            } else {
                view2 = this.A01.inflate(R.layout.list_section, viewGroup, false);
                r2 = new C42821xL(this.A05, view2);
            }
            view2.setTag(r2);
        } else {
            r2 = (AbstractC27901Sb) view.getTag();
        }
        r2.ADY(r1);
        return view2;
    }
}
