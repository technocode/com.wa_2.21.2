package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1Jk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC26071Jk implements View.OnLongClickListener {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public /* synthetic */ View$OnLongClickListenerC26071Jk(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public final boolean onLongClick(View view) {
        TextStatusComposerActivity textStatusComposerActivity = this.A00;
        int i = textStatusComposerActivity.A00;
        int[] iArr = C660232m.A01;
        int A002 = C660232m.A00(iArr, i);
        if (A002 <= 0) {
            A002 = iArr.length;
        }
        textStatusComposerActivity.A00 = iArr[A002 - 1];
        textStatusComposerActivity.getWindow().setBackgroundDrawable(new ColorDrawable(textStatusComposerActivity.A00));
        C002001d.A2R(textStatusComposerActivity, textStatusComposerActivity.A0N, ((AnonymousClass2C0) textStatusComposerActivity).A01.A06(TextStatusComposerActivity.A0e[C660232m.A00(iArr, textStatusComposerActivity.A00)]));
        return true;
    }
}
