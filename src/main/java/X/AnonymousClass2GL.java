package X;

import android.widget.AbsListView;
import com.whatsapp.contact.picker.BidiContactListView;

/* renamed from: X.2GL  reason: invalid class name */
public class AnonymousClass2GL implements AbsListView.OnScrollListener {
    public int A00 = 0;
    public final /* synthetic */ BidiContactListView A01;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public AnonymousClass2GL(BidiContactListView bidiContactListView) {
        this.A01 = bidiContactListView;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        int i2 = this.A00;
        if (i2 == 0 && i != i2) {
            this.A01.A01.A02(absListView);
        }
        this.A00 = i;
    }
}
