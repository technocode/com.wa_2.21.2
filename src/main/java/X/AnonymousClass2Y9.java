package X;

import com.whatsapp.MentionableEntry;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.2Y9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Y9 implements AbstractC47082Gj {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public /* synthetic */ AnonymousClass2Y9(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }

    @Override // X.AbstractC47082Gj
    public final void AFV() {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A00;
        int selectionStart = sharedTextPreviewDialogFragment.A02.getSelectionStart();
        if (selectionStart == sharedTextPreviewDialogFragment.A02.getSelectionEnd() && sharedTextPreviewDialogFragment.A0C) {
            MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A02;
            int offsetForPosition = mentionableEntry.getOffsetForPosition(mentionableEntry.getX() + ((float) sharedTextPreviewDialogFragment.A02.getWidth()), (float) sharedTextPreviewDialogFragment.A04.getScrollY());
            int abs = Math.abs(sharedTextPreviewDialogFragment.A02.getLayout().getLineTop(0) - sharedTextPreviewDialogFragment.A02.getLayout().getLineBottom(0));
            MentionableEntry mentionableEntry2 = sharedTextPreviewDialogFragment.A02;
            int offsetForPosition2 = mentionableEntry2.getOffsetForPosition(mentionableEntry2.getX() + ((float) sharedTextPreviewDialogFragment.A02.getWidth()), (float) ((sharedTextPreviewDialogFragment.A04.getHeight() + sharedTextPreviewDialogFragment.A04.getScrollY()) - abs));
            if (selectionStart < offsetForPosition) {
                sharedTextPreviewDialogFragment.A02.setSelection(offsetForPosition);
            } else if (selectionStart > offsetForPosition2) {
                sharedTextPreviewDialogFragment.A02.setSelection(offsetForPosition2);
            }
        } else if (!sharedTextPreviewDialogFragment.A0C) {
            sharedTextPreviewDialogFragment.A0C = true;
        }
        sharedTextPreviewDialogFragment.A0y();
    }
}
