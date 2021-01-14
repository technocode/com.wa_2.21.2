package X;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: X.23n  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC452223n extends AbstractC30161ar {
    public int A00;
    public int A01;
    public LayoutInflater A02;

    public AbstractC452223n(Context context, int i) {
        super(context, null, true);
        this.A00 = i;
        this.A01 = i;
        this.A02 = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
