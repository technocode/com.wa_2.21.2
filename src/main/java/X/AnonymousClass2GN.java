package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.2GN  reason: invalid class name */
public class AnonymousClass2GN implements AbsListView.OnScrollListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public AnonymousClass2GN(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ContactPickerFragment contactPickerFragment = this.A00;
        View view = contactPickerFragment.A08;
        if (view == null) {
            return;
        }
        if (i != 0) {
            view.setVisibility(8);
        } else if (contactPickerFragment.A1q.containsKey(C12060hU.A00)) {
            contactPickerFragment.A08.setVisibility(0);
            View childAt = absListView.getChildAt(0);
            if (childAt != null) {
                contactPickerFragment.A08.setAlpha(((float) (childAt.getTop() + childAt.getHeight())) / ((float) childAt.getHeight()));
                contactPickerFragment.A08.setTranslationY((float) childAt.getTop());
            }
        }
    }
}
