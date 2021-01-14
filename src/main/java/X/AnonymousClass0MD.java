package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0MD  reason: invalid class name */
public class AnonymousClass0MD extends AnonymousClass0ME implements DialogInterface {
    public final C12810j6 A00 = new C12810j6(getContext(), this, getWindow());

    public AnonymousClass0MD(Context context, int i) {
        super(context, A00(context, i));
    }

    public static int A00(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button A02(int i) {
        C12810j6 r2 = this.A00;
        if (r2 == null) {
            throw null;
        } else if (i == -3) {
            return r2.A0H;
        } else {
            if (i == -2) {
                return r2.A0G;
            }
            if (i == -1) {
                return r2.A0I;
            }
            return null;
        }
    }

    public void A03(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.A00.A04(i, charSequence, onClickListener);
    }

    public void A04(CharSequence charSequence) {
        C12810j6 r0 = this.A00;
        r0.A0S = charSequence;
        TextView textView = r0.A0M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (X.C12810j6.A03(r11) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0164, code lost:
        if (r12.getVisibility() == 8) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (r11 != null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0203 A[ADDED_TO_REGION] */
    @Override // X.AnonymousClass0ME
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 872
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MD.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0O;
        if (nestedScrollView == null || !nestedScrollView.A0E(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0O;
        if (nestedScrollView == null || !nestedScrollView.A0E(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, X.AnonymousClass0ME
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C12810j6 r0 = this.A00;
        r0.A0T = charSequence;
        TextView textView = r0.A0N;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
