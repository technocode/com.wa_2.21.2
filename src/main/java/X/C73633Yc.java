package X;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Yc  reason: invalid class name and case insensitive filesystem */
public class C73633Yc extends AbstractC69453Hc {
    public final View A00;
    public final Button A01;
    public final TextView A02;
    public final C61112sW A03 = C61112sW.A00();

    public C73633Yc(View view) {
        super(view);
        AnonymousClass0Q7.A0D(view, R.id.request_cancel_button);
        this.A01 = (Button) AnonymousClass0Q7.A0D(view, R.id.retry_withdrawal_button);
        this.A00 = AnonymousClass0Q7.A0D(view, R.id.action_buttons_container);
        this.A02 = (TextView) AnonymousClass0Q7.A0D(view, R.id.short_description_text);
    }
}
