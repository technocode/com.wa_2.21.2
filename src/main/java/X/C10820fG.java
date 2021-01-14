package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.StatusesFragment;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0fG  reason: invalid class name and case insensitive filesystem */
public class C10820fG extends BaseAdapter implements Filterable {
    public long A00 = 4;
    public Filter A01;
    public final Map A02 = new HashMap();
    public final /* synthetic */ StatusesFragment A03;

    public int getViewTypeCount() {
        return 3;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C10820fG(StatusesFragment statusesFragment) {
        this.A03 = statusesFragment;
    }

    public int getCount() {
        return this.A03.A0C.size();
    }

    public Filter getFilter() {
        Filter filter = this.A01;
        if (filter != null) {
            return filter;
        }
        C27061Nu r1 = new C27061Nu(this.A03);
        this.A01 = r1;
        return r1;
    }

    public Object getItem(int i) {
        return this.A03.A0C.get(i);
    }

    public long getItemId(int i) {
        AbstractC27051Nt r1 = (AbstractC27051Nt) this.A03.A0C.get(i);
        if (r1 instanceof C40811ts) {
            UserJid userJid = ((C40811ts) r1).A01.A0A;
            Map map = this.A02;
            Number number = (Number) map.get(userJid);
            if (number == null) {
                long j = this.A00;
                this.A00 = 1 + j;
                number = Long.valueOf(j);
                map.put(userJid, number);
            }
            return number.longValue();
        } else if (r1 instanceof C40801tr) {
            return ((C40801tr) r1).A00;
        } else {
            if (r1 instanceof C40781tp) {
                return 3;
            }
            throw new UnsupportedOperationException("Each list item must have an id");
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A03.A0C.get(i);
        if (obj instanceof C40811ts) {
            return 0;
        }
        if (obj instanceof C40801tr) {
            return 1;
        }
        if (obj instanceof C40781tp) {
            return 2;
        }
        throw new UnsupportedOperationException("Each list item type must have a itemType");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        StatusesFragment statusesFragment = this.A03;
        return ((AbstractC27051Nt) statusesFragment.A0C.get(i)).A9j(i, view, viewGroup, statusesFragment.A00());
    }
}
