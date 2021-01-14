package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.MentionableEntry;
import com.whatsapp.emoji.search.EmojiSearchContainer;

/* renamed from: X.3IN  reason: invalid class name */
public class AnonymousClass3IN implements AbstractC664834n {
    public View.OnFocusChangeListener A00;
    public View A01;
    public ImageButton A02;
    public MentionableEntry A03;
    public EmojiSearchContainer A04;
    public AnonymousClass3IL A05;
    public final Context A06;
    public final TextWatcher A07 = new AnonymousClass3IM(this);
    public final AnonymousClass03P A08 = AnonymousClass03P.A00();
    public final AnonymousClass01X A09 = AnonymousClass01X.A00();
    public final C02590Cr A0A = C02590Cr.A00();
    public final AnonymousClass022 A0B = AnonymousClass022.A00();

    @Override // X.AbstractC664834n
    public /* synthetic */ void AAV(ViewStub viewStub) {
        C664734m.A00(this, viewStub);
    }

    public AnonymousClass3IN(Context context, AnonymousClass3IL r3) {
        this.A06 = context;
        this.A05 = r3;
    }

    @Override // X.AbstractC664834n
    public void A2F(Object obj) {
        this.A03.setText((String) obj);
    }

    @Override // X.AbstractC664834n
    public int A74() {
        return R.layout.shared_payment_entry;
    }

    @Override // X.AbstractC664834n
    public void ALk(View view) {
        this.A02 = (ImageButton) AnonymousClass0Q7.A0D(view, R.id.emoji_picker_btn);
        this.A03 = (MentionableEntry) AnonymousClass0Q7.A0D(view, R.id.send_payment_note);
        this.A01 = AnonymousClass0Q7.A0D(view, R.id.text_entry_layout);
        this.A04 = (EmojiSearchContainer) AnonymousClass0Q7.A0D(view, R.id.emoji_search_container);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.payment_entry_action_stub);
        if (viewStub != null) {
            this.A05.AAV(viewStub);
        } else {
            this.A05.ALk(AnonymousClass0Q7.A0D(view, R.id.payment_entry_action_inflated));
        }
        this.A03.addTextChangedListener(this.A07);
        MentionableEntry mentionableEntry = this.A03;
        AnonymousClass01X r5 = this.A09;
        mentionableEntry.setHint(r5.A06(R.string.send_payment_note));
        this.A03.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1024)});
        this.A03.setOnFocusChangeListener(new View$OnFocusChangeListenerC63482wU(this));
        this.A03.addTextChangedListener(new C07850Zx(this.A0A, this.A08, r5, this.A0B, this.A03, (TextView) AnonymousClass0Q7.A0D(view, R.id.counter), 1024, 30, true));
    }
}
