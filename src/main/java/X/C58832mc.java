package X;

import android.util.Pair;
import android.widget.SectionIndexer;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2mc  reason: invalid class name and case insensitive filesystem */
public class C58832mc extends AnonymousClass2YM implements SectionIndexer {
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();
    public final /* synthetic */ ContactPickerFragment A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58832mc(ContactPickerFragment contactPickerFragment) {
        super(contactPickerFragment);
        this.A02 = contactPickerFragment;
    }

    public int getPositionForSection(int i) {
        List list = this.A00;
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return ((Number) list.get(i)).intValue();
    }

    public int getSectionForPosition(int i) {
        return C28051Sr.A04(i, super.A02, this.A01, this.A00);
    }

    public Object[] getSections() {
        return this.A01.toArray(new String[1]);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A0S = C28051Sr.A0S(super.A02, this.A02.A1O);
        this.A01 = (List) A0S.first;
        this.A00 = (List) A0S.second;
    }
}
