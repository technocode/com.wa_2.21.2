package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.3RW  reason: invalid class name */
public class AnonymousClass3RW extends AbstractC11910hD {
    public final TextView A00;
    public final C000300f A01 = C000300f.A00();
    public final C11930hF A02;
    public final ThumbnailButton A03;
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final C014308b A05 = C014308b.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final AnonymousClass00Y A07 = AnonymousClass00Y.A00();
    public final AnonymousClass31y A08 = AnonymousClass31y.A00();

    public AnonymousClass3RW(View view) {
        super(view);
        this.A03 = (ThumbnailButton) AnonymousClass0Q7.A0D(view, R.id.storage_usage_chat_contact_photo);
        this.A00 = (TextView) AnonymousClass0Q7.A0D(view, R.id.storage_usage_chat_used_space);
        this.A02 = new C11930hF(view, R.id.storage_usage_chat_contact_name, this.A05, this.A06, this.A08);
        AnonymousClass0Q7.A0d(view, new C41111uU());
    }
}
