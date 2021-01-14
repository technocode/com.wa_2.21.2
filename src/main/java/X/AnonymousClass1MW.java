package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.MentionableEntry;

/* renamed from: X.1MW  reason: invalid class name */
public class AnonymousClass1MW implements TextWatcher {
    public int A00;
    public boolean A01;
    public C40321t0[] A02;
    public final /* synthetic */ MentionableEntry A03;

    public AnonymousClass1MW(MentionableEntry mentionableEntry) {
        this.A03 = mentionableEntry;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A00 > 0) {
            MentionableEntry mentionableEntry = this.A03;
            C40321t0[] r7 = this.A02;
            boolean z = this.A01;
            if (mentionableEntry != null) {
                int i = 0;
                if (!z) {
                    C40321t0[] r3 = (C40321t0[]) mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), C40321t0.class);
                    mentionableEntry.A0A(mentionableEntry.A08);
                    mentionableEntry.A08 = null;
                    int length = r3.length;
                    while (i < length) {
                        C40321t0 r1 = r3[i];
                        mentionableEntry.A0A(r1.A00);
                        mentionableEntry.A0A(r1);
                        i++;
                    }
                } else {
                    int length2 = r7.length;
                    while (i < length2) {
                        C40321t0 r32 = r7[i];
                        int spanStart = editable.getSpanStart(r32.A00);
                        int spanEnd = editable.getSpanEnd(r32);
                        if (!(spanStart == -1 || spanEnd == -1)) {
                            mentionableEntry.A0A(r32.A00);
                            mentionableEntry.A0A(r32);
                            editable.delete(spanStart, spanEnd);
                        }
                        i++;
                    }
                }
            } else {
                throw null;
            }
        }
        this.A03.A07(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionableEntry mentionableEntry = this.A03;
        int selectionEnd = mentionableEntry.getSelectionEnd();
        this.A02 = (C40321t0[]) mentionableEntry.getEditableText().getSpans(selectionEnd, selectionEnd, C40321t0.class);
        boolean z = false;
        if (mentionableEntry.getSelectionStart() == mentionableEntry.getSelectionEnd()) {
            z = true;
        }
        this.A01 = z;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i2;
    }
}
