package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ey  reason: invalid class name and case insensitive filesystem */
public class C54472ey extends AbstractC11910hD {
    public View A00;
    public TextView A01;
    public final /* synthetic */ C54482ez A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54472ey(C54482ez r4, ViewGroup viewGroup) {
        super(r4.A01.inflate(R.layout.gif_picker_category, viewGroup, false));
        this.A02 = r4;
        View view = this.A0H;
        this.A00 = view.findViewById(R.id.gif_cat_marker);
        this.A01 = (TextView) view.findViewById(R.id.gif_category_title);
    }
}
