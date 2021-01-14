package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* renamed from: X.2pw  reason: invalid class name and case insensitive filesystem */
public class C60672pw extends AbstractC463429i {
    public static final Editable.Factory A01 = new AnonymousClass2HS();
    public AnonymousClass2HT A00;

    public C60672pw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            AnonymousClass03P.A00();
        }
        setEditableFactory(A01);
        setCustomSelectionActionModeCallback(new AnonymousClass2HR(this));
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass2HT r0 = this.A00;
        if (r0 != null) {
            r0.AGv(i, keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // com.whatsapp.WaEditText
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 23 && i == 16908322) {
            i = 16908337;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setInputEnterDone(boolean z) {
        int i = 0;
        if (z) {
            i = 6;
        }
        setInputEnterAction(i);
    }

    public void setInputEnterSend(boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        setInputEnterAction(i);
    }

    public void setOnKeyPreImeListener(AnonymousClass2HT r1) {
        this.A00 = r1;
    }
}
