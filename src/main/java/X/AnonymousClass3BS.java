package X;

import android.view.View;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.3BS  reason: invalid class name */
public class AnonymousClass3BS implements View.OnLongClickListener {
    public final /* synthetic */ FormItemEditText A00;

    public AnonymousClass3BS(FormItemEditText formItemEditText) {
        this.A00 = formItemEditText;
    }

    public boolean onLongClick(View view) {
        FormItemEditText formItemEditText = this.A00;
        formItemEditText.setSelection(formItemEditText.getText().length());
        return true;
    }
}
