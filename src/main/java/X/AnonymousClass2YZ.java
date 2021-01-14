package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.2YZ  reason: invalid class name */
public class AnonymousClass2YZ extends AbstractC11910hD {
    public final View A00;
    public final TextView A01;
    public final ThumbnailButton A02;

    public AnonymousClass2YZ(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ThumbnailButton) view.findViewById(R.id.contact_row_photo);
        TextView textView = (TextView) view.findViewById(R.id.contact_name);
        this.A01 = textView;
        AnonymousClass0Q7.A0W(textView, 2);
    }
}
