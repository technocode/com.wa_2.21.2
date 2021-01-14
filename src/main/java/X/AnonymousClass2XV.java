package X;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;

/* renamed from: X.2XV  reason: invalid class name */
public class AnonymousClass2XV extends AbstractC11910hD {
    public View A00;
    public Group A01;
    public final AnonymousClass2XZ A02;

    public AnonymousClass2XV(View view, AnonymousClass2XZ r5) {
        super(view);
        AnonymousClass0Q7.A0D(view, R.id.link_device_button).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(r5, 43));
        this.A02 = r5;
        this.A01 = (Group) AnonymousClass0Q7.A0D(view, R.id.web_beta_group);
        this.A00 = AnonymousClass0Q7.A0D(view, R.id.header_separator);
    }
}
