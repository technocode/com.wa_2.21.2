package X;

import android.content.Context;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.34D  reason: invalid class name */
public class AnonymousClass34D extends LinearLayout {
    public WaImageView A00 = ((WaImageView) AnonymousClass0Q7.A0D(this, R.id.storage_usage_sort_row_checkmark));
    public WaTextView A01 = ((WaTextView) AnonymousClass0Q7.A0D(this, R.id.storage_usage_sort_row_text));

    public AnonymousClass34D(Context context) {
        super(context);
        LinearLayout.inflate(getContext(), R.layout.storage_usage_gallery_sort_bottom_sheet_row, this);
        setOrientation(0);
        setGravity(16);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
    }

    public void setChecked(boolean z) {
        WaImageView waImageView = this.A00;
        int i = 8;
        if (z) {
            i = 0;
        }
        waImageView.setVisibility(i);
    }

    public void setText(String str) {
        this.A01.setText(str);
    }
}
