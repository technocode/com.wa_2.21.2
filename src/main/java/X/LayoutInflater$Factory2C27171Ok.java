package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.1Ok  reason: invalid class name and case insensitive filesystem */
public class LayoutInflater$Factory2C27171Ok implements LayoutInflater.Factory2 {
    public final AbstractC003201p A00;

    public LayoutInflater$Factory2C27171Ok(AbstractC003201p r1) {
        this.A00 = r1;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("TextView".equals(str)) {
            return new WaTextView(context, attributeSet);
        }
        return this.A00.A03(null, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
