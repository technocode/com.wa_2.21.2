package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.02j  reason: invalid class name and case insensitive filesystem */
public class ActivityC005002j extends Activity implements AbstractC005102k, AbstractC005202l {
    public C013807v A00 = new C013807v(this);

    @Override // X.AbstractC005202l
    public boolean AQM(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AnonymousClass0Q7.A0n(decorView, keyEvent)) {
            return C14900n4.A00(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AnonymousClass0Q7.A0n(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass084.A00(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.A00.A05(EnumC014207z.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
