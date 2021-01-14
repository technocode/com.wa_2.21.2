package X;

import android.graphics.Typeface;
import android.view.View;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1Ji  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC26051Ji implements View.OnLongClickListener {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public /* synthetic */ View$OnLongClickListenerC26051Ji(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public final boolean onLongClick(View view) {
        TextStatusComposerActivity textStatusComposerActivity = this.A00;
        int i = textStatusComposerActivity.A01;
        int[] iArr = C660232m.A02;
        int A002 = C660232m.A00(iArr, i);
        if (A002 <= 0) {
            A002 = iArr.length;
        }
        int i2 = iArr[A002 - 1];
        textStatusComposerActivity.A01 = i2;
        Typeface A01 = C660232m.A01(textStatusComposerActivity, i2);
        textStatusComposerActivity.A07.setTypeface(A01);
        textStatusComposerActivity.A08.setTypeface(A01);
        C002001d.A2R(textStatusComposerActivity, textStatusComposerActivity.A0N, ((AnonymousClass2C0) textStatusComposerActivity).A01.A06(TextStatusComposerActivity.A0f[C660232m.A00(iArr, textStatusComposerActivity.A01)]));
        return true;
    }
}
