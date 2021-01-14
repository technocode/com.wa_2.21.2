package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2vs  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC63112vs extends ArrayAdapter {
    public List A00 = new ArrayList();
    public final AnonymousClass01X A01;
    public final C01970Ad A02;

    public int getViewTypeCount() {
        return 1;
    }

    public AbstractC63112vs(Context context, AnonymousClass01X r4, C01970Ad r5) {
        super(context, (int) R.layout.payment_method_row, new ArrayList());
        this.A01 = r4;
        this.A02 = r5;
    }

    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ArrayAdapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }
}
