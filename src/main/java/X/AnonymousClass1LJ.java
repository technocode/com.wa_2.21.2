package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.CountryPicker;
import java.util.List;

/* renamed from: X.1LJ  reason: invalid class name */
public final class AnonymousClass1LJ extends ArrayAdapter {
    public final String A00;
    public final String A01;
    public final /* synthetic */ CountryPicker A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1LJ(CountryPicker countryPicker, Context context, List list, String str, String str2) {
        super(context, (int) R.layout.country_picker_row, list);
        this.A02 = countryPicker;
        this.A00 = str;
        this.A01 = str2;
    }

    public int getCount() {
        return Math.max(1, super.getCount());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LJ.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
