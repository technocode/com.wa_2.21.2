package X;

import android.widget.BaseAdapter;
import com.whatsapp.voipcalling.CallLogActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.38p  reason: invalid class name and case insensitive filesystem */
public class C674438p extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ CallLogActivity A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public C674438p(CallLogActivity callLogActivity) {
        this.A01 = callLogActivity;
    }

    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
        if (r2 == 6) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r14, android.view.View r15, android.view.ViewGroup r16) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C674438p.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
