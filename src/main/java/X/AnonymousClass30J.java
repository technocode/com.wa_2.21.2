package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.RegisterPhone;

/* renamed from: X.30J  reason: invalid class name */
public class AnonymousClass30J extends ClickableSpan {
    public final /* synthetic */ AnonymousClass30K A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass30J(AnonymousClass30K r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void onClick(View view) {
        RegisterPhone registerPhone = this.A00.A00;
        AnonymousClass0CO r1 = registerPhone.A0L;
        String str = this.A01;
        String str2 = this.A02;
        ((AnonymousClass0HU) registerPhone).A01.A03.setText(AnonymousClass0JE.A09(r1, str, str2).substring(str.length() + 2));
        EditText editText = ((AnonymousClass0HU) registerPhone).A01.A03;
        editText.setSelection(editText.getText().length());
        registerPhone.A0V();
        ((ActivityC004702f) registerPhone).A0F.A06(R.string.register_number_mistyped_toast, 1);
        AnonymousClass008.A1U(new StringBuilder("register/phone/suggested/tapped "), str2);
        registerPhone.A0J = true;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
