package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.List;

/* renamed from: X.2mT  reason: invalid class name and case insensitive filesystem */
public class C58762mT extends AnonymousClass1MI {
    public int A00 = this.A01.getMeasuredHeight();
    public NumberEntryKeyboard A01;
    public AbstractC60792qE A02;
    public List A03;

    public C58762mT(Activity activity, C06170Sb r6, AnonymousClass03P r7, AnonymousClass00D r8, AnonymousClass1MF r9, AbstractC60792qE r10, List list, AnonymousClass2WC r12) {
        super(activity, r6, r7, r8, r9);
        this.A02 = r10;
        this.A03 = list;
        NumberEntryKeyboard numberEntryKeyboard = new NumberEntryKeyboard(activity, null);
        this.A01 = numberEntryKeyboard;
        numberEntryKeyboard.A06 = r10;
        numberEntryKeyboard.setCustomKey(r12);
        this.A02.setCustomCursorEnabled(true);
        setContentView(this.A01);
        setTouchable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(-1));
        setTouchInterceptor(new AnonymousClass2WA(this, list));
        this.A01.measure(View.MeasureSpec.makeMeasureSpec(activity.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // X.AnonymousClass1MI
    public void dismiss() {
        this.A02.setHasFocus(false);
        super.dismiss();
    }
}
