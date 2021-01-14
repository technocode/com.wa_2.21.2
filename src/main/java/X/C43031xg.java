package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1xg  reason: invalid class name and case insensitive filesystem */
public class C43031xg extends AbstractC25311Gi {
    public static final C43031xg A00 = new C43031xg();

    public void A01(View view, AnonymousClass05q r11, C46522Au r12) {
        String str;
        View childAt;
        String str2;
        AnonymousClass1TA r1;
        Context context = ((AnonymousClass05r) r11).A00;
        Activity activity = (Activity) context;
        Boolean bool = r12.A07;
        if (bool != null && bool.booleanValue()) {
            activity.getWindow().setFlags(8192, 8192);
        }
        boolean equals = Boolean.TRUE.equals(r12.A04);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.container);
        if (viewGroup.getChildCount() == 0) {
            LayoutInflater from = LayoutInflater.from(context);
            int i = R.layout.wa_bloks_text_input_layout;
            if (equals) {
                i = R.layout.wa_bloks_text_input_layout_purple;
            }
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(i, (ViewGroup) null, false);
            LayoutInflater from2 = LayoutInflater.from(context);
            int i2 = R.layout.wa_bloks_text_input_edit_text;
            if (equals) {
                i2 = R.layout.wa_bloks_text_input_edit_text_purple;
            }
            TextView textView = (TextView) from2.inflate(i2, (ViewGroup) null, false);
            String str3 = r12.A0J;
            if (str3 != null) {
                try {
                    textView.setTextSize(AnonymousClass05i.A02(str3));
                } catch (AnonymousClass060 e) {
                    Log.d("PAY: WaFormInputBinder/bindView cannot parse text size", e);
                }
            }
            viewGroup2.addView(textView, 0, new LinearLayout.LayoutParams(-1, -2));
            viewGroup.addView(viewGroup2);
        }
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.default_text_input_layout);
        EditText editText = (EditText) textInputLayout.findViewById(R.id.text_view);
        TextWatcher textWatcher = (TextWatcher) editText.getTag(R.id.text_watcher);
        editText.removeTextChangedListener(textWatcher);
        editText.removeTextChangedListener((TextWatcher) editText.getTag(R.id.mask_text_watcher));
        editText.setTag(R.id.text_watcher, null);
        editText.setTag(R.id.mask_text_watcher, null);
        if (!TextUtils.equals((String) editText.getTag(R.id.numerical_mask), r12.A0G)) {
            editText.setTag(R.id.is_mask_dirty, Boolean.TRUE);
            editText.setTag(R.id.numerical_mask, r12.A0G);
        }
        if (!TextUtils.equals((String) editText.getTag(R.id.mask), r12.A0F)) {
            editText.setTag(R.id.is_mask_dirty, Boolean.TRUE);
            editText.setTag(R.id.mask, r12.A0G);
        }
        String str4 = r12.A0I;
        if (str4 != null && !str4.equals(editText.getText().toString())) {
            editText.setText(r12.A0I);
            editText.setTag(R.id.is_mask_dirty, Boolean.TRUE);
        }
        if (r12.A0C == null) {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            int i3 = R.style.HintText;
            if (equals) {
                i3 = 2131951933;
            }
            textInputLayout.setErrorTextAppearance(i3);
            int i4 = R.style.HintText;
            if (equals) {
                i4 = 2131951933;
            }
            textInputLayout.setHintTextAppearance(i4);
        } else {
            textInputLayout.setErrorEnabled(true);
            if (TextUtils.isEmpty(r12.A0C)) {
                str = " ";
            } else {
                str = r12.A0C;
            }
            textInputLayout.setError(str);
            if (TextUtils.isEmpty(r12.A0C) && textInputLayout.getChildCount() > 1 && (childAt = textInputLayout.getChildAt(1)) != null) {
                childAt.setVisibility(8);
            }
            textInputLayout.setErrorTextAppearance(R.style.ErrorText);
            textInputLayout.setHintTextAppearance(R.style.ErrorText);
        }
        String str5 = r12.A0E;
        if (str5 != null) {
            textInputLayout.setHint(str5);
        }
        Integer num = r12.A09;
        if (num != null) {
            editText.setGravity(num.intValue());
        }
        String str6 = r12.A0D;
        if (str6 != null) {
            editText.setTypeface(Typeface.create(str6, 0));
        }
        Integer num2 = r12.A0A;
        if (num2 != null) {
            int intValue = num2.intValue();
            if ((intValue & 32) == 32) {
                editText.setInputType(intValue);
            } else {
                editText.setInputType(intValue | 16384);
            }
        }
        boolean equals2 = "true".equals(r12.A0H);
        editText.setEnabled(!equals2);
        boolean z = !equals2;
        editText.setFocusableInTouchMode(z);
        editText.setFocusable(z);
        editText.setCursorVisible(!equals2);
        Boolean bool2 = Boolean.TRUE;
        editText.setSingleLine(!bool2.equals(r12.A03));
        if (bool2.equals(r12.A06)) {
            textInputLayout.setPasswordVisibilityToggleEnabled(true);
        }
        if (bool2.equals(r12.A05)) {
            editText.setTransformationMethod(new PasswordTransformationMethod());
        }
        if (textWatcher == null) {
            textWatcher = new AnonymousClass1TD(r12, r11);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1Mt());
        String str7 = r12.A0B;
        if (str7 != null) {
            if ("lowercase".equals(str7)) {
                arrayList.add(new AnonymousClass1TE(AnonymousClass01X.A00()));
            } else if ("uppercase".equals(str7)) {
                arrayList.add(new InputFilter.AllCaps());
            }
        }
        Integer num3 = r12.A08;
        if (num3 != null) {
            arrayList.add(new InputFilter.LengthFilter(num3.intValue()));
        }
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        Integer num4 = r12.A0A;
        if (!(num4 == null || ((str2 = r12.A0G) == null && r12.A0F == null))) {
            String str8 = r12.A0F;
            if ((num4.intValue() & 2) == 2) {
                if (str8 == null) {
                    str8 = str2;
                }
                r1 = new C42961xZ(str8, editText);
            } else {
                r1 = new AnonymousClass1TA(str8, editText);
            }
            editText.addTextChangedListener(r1);
            editText.setTag(R.id.mask_text_watcher, r1);
            Boolean bool3 = (Boolean) editText.getTag(R.id.is_mask_dirty);
            if (bool3 != null && bool3.booleanValue()) {
                r1.afterTextChanged(editText.getEditableText());
                editText.setTag(R.id.is_mask_dirty, Boolean.FALSE);
            }
        }
        editText.addTextChangedListener(textWatcher);
        editText.setTag(R.id.text_watcher, textWatcher);
        if (r12.A00 != null) {
            ViewOnClickEBaseShape1S0200000_I1_0 viewOnClickEBaseShape1S0200000_I1_0 = new ViewOnClickEBaseShape1S0200000_I1_0(r12, r11, 17);
            textInputLayout.setOnClickListener(viewOnClickEBaseShape1S0200000_I1_0);
            View findViewById = textInputLayout.findViewById(R.id.text_view);
            findViewById.setOnClickListener(viewOnClickEBaseShape1S0200000_I1_0);
            findViewById.setFocusable(false);
        }
    }
}
