package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1Jl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C26081Jl implements TextView.OnEditorActionListener {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public /* synthetic */ C26081Jl(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        TextStatusComposerActivity textStatusComposerActivity = this.A00;
        if (i != 4) {
            return false;
        }
        textStatusComposerActivity.A0V();
        return true;
    }
}
