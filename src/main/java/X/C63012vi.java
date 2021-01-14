package X;

import android.widget.AbsListView;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;

/* renamed from: X.2vi  reason: invalid class name and case insensitive filesystem */
public class C63012vi implements AbsListView.OnScrollListener {
    public final /* synthetic */ IndiaUpiBankPickerActivity A00;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C63012vi(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity) {
        this.A00 = indiaUpiBankPickerActivity;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.A00.A0B.A02 = Boolean.TRUE;
    }
}
