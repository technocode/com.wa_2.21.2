package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.1xK  reason: invalid class name and case insensitive filesystem */
public final class C42811xK implements AbstractC27901Sb {
    public final Context A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final C11930hF A03;
    public final AnonymousClass0YX A04;
    public final AnonymousClass01X A05;

    public C42811xK(Context context, C014308b r8, AnonymousClass01X r9, AnonymousClass31y r10, AnonymousClass0YX r11, View view) {
        this.A00 = context;
        this.A05 = r9;
        this.A04 = r11;
        this.A01 = (ImageView) view.findViewById(R.id.contactpicker_row_photo);
        C11930hF r0 = new C11930hF(view, R.id.contactpicker_row_name, r8, r9, r10);
        this.A03 = r0;
        C002301g.A03(r0.A00);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.contactpicker_row_status);
    }

    @Override // X.AbstractC27901Sb
    public void ADY(AbstractC27921Sd r6) {
        C007003k r4 = ((C42871xQ) r6).A00;
        ImageView imageView = this.A01;
        AnonymousClass0Q7.A0g(imageView, AnonymousClass1VY.A0D(r4.A09));
        imageView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r4, 14));
        this.A04.A02(r4, imageView);
        C11930hF r3 = this.A03;
        r3.A03(r4, null);
        String A0F = this.A05.A0F(C12420i4.A00(r4));
        if (r3.A00.getText().toString().equals(A0F)) {
            TextEmojiLabel textEmojiLabel = this.A02;
            textEmojiLabel.setVisibility(8);
            textEmojiLabel.setText("");
            return;
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        textEmojiLabel2.setVisibility(0);
        textEmojiLabel2.setText(A0F);
    }
}
