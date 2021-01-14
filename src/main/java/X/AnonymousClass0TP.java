package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.0TP  reason: invalid class name */
public class AnonymousClass0TP extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ AnonymousClass0TN A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public AnonymousClass0TP(AnonymousClass0TN r2) {
        this.A01 = r2;
        A01();
    }

    /* renamed from: A00 */
    public AnonymousClass1ZT getItem(int i) {
        AnonymousClass0T8 r0 = this.A01.A05;
        r0.A05();
        ArrayList arrayList = r0.A08;
        int i2 = i + 0;
        int i3 = this.A00;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (AnonymousClass1ZT) arrayList.get(i2);
    }

    public void A01() {
        AnonymousClass0T8 r0 = this.A01.A05;
        AnonymousClass1ZT r4 = r0.A04;
        if (r4 != null) {
            r0.A05();
            ArrayList arrayList = r0.A08;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == r4) {
                    this.A00 = i;
                    return;
                }
            }
        }
        this.A00 = -1;
    }

    public int getCount() {
        AnonymousClass0T8 r0 = this.A01.A05;
        r0.A05();
        int size = r0.A08.size() - 0;
        return this.A00 < 0 ? size : size - 1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            AnonymousClass0TN r0 = this.A01;
            view = r0.A02.inflate(r0.A00, viewGroup, false);
        }
        ((AbstractC13070jY) view).AAn(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
