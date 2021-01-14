package X;

import android.os.Bundle;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.MentionableEntry;
import com.whatsapp.util.Log;

/* renamed from: X.1qP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38761qP implements InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ MentionableEntry A00;

    public /* synthetic */ C38761qP(MentionableEntry mentionableEntry) {
        this.A00 = mentionableEntry;
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        MentionableEntry mentionableEntry = this.A00;
        Log.d("mentionable/entry/onCommitContent");
        AnonymousClass1MX r0 = mentionableEntry.A09;
        if (r0 != null) {
            return r0.onCommitContent(inputContentInfoCompat, i, bundle);
        }
        Log.e("mentionable/entry/no on commit content listener");
        return false;
    }
}
