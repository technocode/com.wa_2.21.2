package X;

import android.content.Context;
import android.widget.EditText;

/* renamed from: X.1GT  reason: invalid class name */
public class AnonymousClass1GT extends EditText {
    public AnonymousClass1GS A00;

    public AnonymousClass1GT(Context context) {
        super(context);
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        AnonymousClass1GS r0 = this.A00;
        if (r0 != null) {
            C25301Gh r02 = ((C37831or) r0).A00.A00;
            r02.A04 = i;
            r02.A03 = i2;
        }
    }

    public void setOnSelectionChangedListener(AnonymousClass1GS r1) {
        this.A00 = r1;
    }
}
