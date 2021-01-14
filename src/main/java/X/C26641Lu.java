package X;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.FirstStatusConfirmationDialogFragment;
import com.whatsapp.StatusPrivacyActivity;

/* renamed from: X.1Lu  reason: invalid class name and case insensitive filesystem */
public class C26641Lu extends ClickableSpan {
    public final /* synthetic */ FirstStatusConfirmationDialogFragment A00;

    public C26641Lu(FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment) {
        this.A00 = firstStatusConfirmationDialogFragment;
    }

    public void onClick(View view) {
        this.A00.A0M(new Intent(view.getContext(), StatusPrivacyActivity.class), 0, null);
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C004302a.A00(this.A00.A00(), R.color.accent_light));
    }
}
