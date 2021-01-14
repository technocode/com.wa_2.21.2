package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* renamed from: X.1oy  reason: invalid class name and case insensitive filesystem */
public class C37901oy implements AnonymousClass11B {
    public final AnonymousClass05q A00;
    public final AbstractC25311Gi A01;

    public C37901oy(AbstractC25311Gi r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        AbstractC25311Gi r1 = this.A01;
        AnonymousClass05q r2 = this.A00;
        if (r1 instanceof C43101xn) {
            View view = (View) obj;
            CodeInputField codeInputField = (CodeInputField) view.findViewById(R.id.code);
            codeInputField.removeTextChangedListener(codeInputField.A04);
            if (codeInputField.getTag() != null) {
                codeInputField.removeCallbacks((Runnable) codeInputField.getTag());
            }
            ((ViewGroup) view).removeAllViews();
            ((Activity) ((AnonymousClass05r) r2).A00).getWindow().clearFlags(8192);
        } else if (r1 instanceof C43051xi) {
            TextView textView = (TextView) obj;
            textView.setText("");
            textView.setGravity(8388659);
            textView.setMovementMethod(null);
            textView.setTag(R.id.on_text_clicked_listener, null);
        } else if (r1 instanceof C43031xg) {
            ((ViewGroup) ((View) obj).findViewById(R.id.container)).removeAllViews();
            ((Activity) ((AnonymousClass05r) r2).A00).getWindow().clearFlags(8192);
        }
    }
}
