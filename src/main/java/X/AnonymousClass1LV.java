package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.RtlCheckBox;
import java.util.List;

/* renamed from: X.1LV  reason: invalid class name */
public class AnonymousClass1LV extends LinearLayout {
    public AnonymousClass1LV(Context context, String str, String str2, List list) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.dialog_fragment_custom_view, this);
        setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_padding_horizontal);
        int i = 0;
        setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_padding_top), dimensionPixelSize, 0);
        TextView textView = (TextView) AnonymousClass0Q7.A0D(this, R.id.title);
        TextView textView2 = (TextView) AnonymousClass0Q7.A0D(this, R.id.subtitle);
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str2)) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_first_checkbox_margin_top);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_checkbox_margin_top);
        while (i < list.size()) {
            AnonymousClass1LT r4 = (AnonymousClass1LT) list.get(i);
            int i2 = i == 0 ? dimensionPixelSize2 : dimensionPixelSize3;
            RtlCheckBox rtlCheckBox = new RtlCheckBox(getContext(), null);
            rtlCheckBox.setTextSize(2, 16.0f);
            rtlCheckBox.setTextColor(C004302a.A00(getContext(), R.color.secondary_text));
            addView(rtlCheckBox);
            ((ViewGroup.MarginLayoutParams) rtlCheckBox.getLayoutParams()).topMargin = i2;
            rtlCheckBox.setText(r4.A01);
            rtlCheckBox.setChecked(false);
            if (r4.A00 != null) {
                rtlCheckBox.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(r4, rtlCheckBox, 3));
            }
            i++;
        }
    }
}
