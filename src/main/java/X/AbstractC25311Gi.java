package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.1Gi  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC25311Gi {
    public void A00(Object obj, AnonymousClass05q r20, AnonymousClass29W r21, Object obj2) {
        File A01;
        int i;
        Camera camera;
        Long l;
        if (this instanceof C43171xu) {
            ((C43171xu) this).A01((View) obj, (C46542Ay) r21);
        } else if (this instanceof C43141xr) {
            C43141xr r5 = (C43141xr) this;
            ImageView imageView = (ImageView) obj;
            AnonymousClass2Av r3 = (AnonymousClass2Av) r21;
            imageView.setScaleType(r3.A02);
            C009405x r0 = r3.A03;
            if (r0 != null) {
                imageView.setColorFilter(r0.A00(r20).intValue());
            }
            if (!TextUtils.isEmpty(r3.A06)) {
                String str = r3.A06;
                String str2 = r3.A07;
                String str3 = r3.A04;
                C009405x r13 = r3.A03;
                C28011Sm r1 = r5.A00;
                if (!TextUtils.isEmpty(str2)) {
                    C28051Sr.A1W(r20, imageView, str2, str3, r13);
                }
                r1.A01().A01(str, imageView, null, null, new C43121xp(new WeakReference(imageView), new WeakReference(r20), r13, str2, r20, imageView, str3));
            } else if (!TextUtils.isEmpty(r3.A07)) {
                C28051Sr.A1W(r20, imageView, r3.A07, r3.A04, r3.A03);
            } else if (!TextUtils.isEmpty(r3.A05) && (A01 = r5.A01.A01(r3.A05)) != null) {
                imageView.setImageBitmap(BitmapFactory.decodeFile(A01.getAbsolutePath()));
            }
        } else if (this instanceof C43131xq) {
            C43131xq r2 = (C43131xq) this;
            ImageView imageView2 = (ImageView) obj;
            C46492Ar r32 = (C46492Ar) r21;
            C010706m r02 = ((AnonymousClass05r) r20).A01;
            String str4 = r32.A07;
            C42951xY r12 = r02.A03;
            Context context = ((AnonymousClass05r) r20).A00;
            if (r12 != null) {
                if (C002001d.A3E(context) && !TextUtils.isEmpty(r32.A06)) {
                    str4 = r32.A06;
                }
                if (!TextUtils.isEmpty(str4)) {
                    C67743Ab r52 = (C67743Ab) r2.A00.get();
                    Uri parse = Uri.parse(str4);
                    StringBuilder sb = new StringBuilder();
                    sb.append(parse.getHost());
                    sb.append(parse.getPath());
                    String obj3 = sb.toString();
                    C664334g r03 = r52.A00;
                    if (r03 == null) {
                        C664234e r22 = new C664234e((AnonymousClass02M) r52.A01.get(), (C02660Cy) r52.A03.get(), new File(((AnonymousClass00G) r52.A02.get()).A00.getCacheDir(), "wabloks_images"));
                        r22.A05 = true;
                        r22.A02 = 16777216;
                        r22.A01 = Integer.MAX_VALUE;
                        r03 = r22.A00();
                        r52.A00 = r03;
                    }
                    int i2 = r03.A00;
                    r03.A01.A00(new C72123Rp(str4, obj3, imageView2, null, null, i2, i2, null), r03.A02);
                }
                imageView2.setScaleType(r32.A02);
                C009405x r04 = r32.A04;
                if (r04 != null) {
                    imageView2.setColorFilter(r04.A00(r20).intValue());
                    return;
                }
                Integer num = r32.A05;
                if (num != null) {
                    imageView2.setColorFilter(num.intValue());
                    return;
                }
                C009405x r05 = r32.A03;
                if (r05 != null) {
                    imageView2.setColorFilter(r05.A00(r20).intValue());
                    return;
                }
                return;
            }
            throw null;
        } else if (this instanceof C43101xn) {
            C43101xn r23 = (C43101xn) this;
            View view = (View) obj;
            C46482Aq r33 = (C46482Aq) r21;
            view.setFocusable(false);
            Context context2 = ((AnonymousClass05r) r20).A00;
            ((Activity) context2).getWindow().setFlags(8192, 8192);
            CodeInputField codeInputField = (CodeInputField) view.findViewById(R.id.code);
            if (codeInputField == null) {
                String str5 = r33.A08;
                if (str5 != null) {
                    boolean equals = str5.equals("fb_pay");
                    int i3 = R.layout.code_input;
                    if (equals) {
                        i3 = R.layout.code_input_fb_pay;
                    }
                    codeInputField = (CodeInputField) View.inflate(context2, i3, null);
                } else {
                    codeInputField = (CodeInputField) View.inflate(context2, R.layout.code_input, null);
                }
                codeInputField.setCustomSelectionActionModeCallback(new AnonymousClass1TG());
                ((ViewGroup) view).addView(codeInputField);
                r23.A01(codeInputField, r20, r33);
            }
            Integer num2 = r33.A05;
            if (num2 != null) {
                codeInputField.setGravity(num2.intValue());
            }
            String str6 = r33.A06;
            if (str6 == null || !str6.equals("error")) {
                codeInputField.setErrorState(false);
            } else {
                codeInputField.setErrorState(true);
                codeInputField.A03();
                r33.A07 = "";
                r33.A06 = "no_error";
                codeInputField.removeTextChangedListener(codeInputField.A04);
                r23.A01(codeInputField, r20, r33);
            }
            boolean z = !Boolean.FALSE.equals(r33.A02);
            codeInputField.setEnabled(z);
            codeInputField.setCursorVisible(false);
            String str7 = r33.A07;
            if (str7 != null && !str7.equals(codeInputField.getCode())) {
                codeInputField.setCode(r33.A07);
            }
            if (z) {
                codeInputField.requestFocus();
                Runnable runnable = (Runnable) codeInputField.getTag();
                if (runnable == null) {
                    runnable = new RunnableEBaseShape7S0200000_I1_2(r20, codeInputField, 3);
                    codeInputField.setTag(runnable);
                }
                codeInputField.postDelayed(runnable, 0);
                return;
            }
            codeInputField.A03();
        } else if (this instanceof C43081xl) {
            C43081xl r53 = (C43081xl) this;
            View view2 = (View) obj;
            C46472Ap r34 = (C46472Ap) r21;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            r53.A02 = displayMetrics.heightPixels;
            r53.A03 = displayMetrics.widthPixels;
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.bloks_camera_preview);
            if (TextUtils.equals(r34.A01, "front")) {
                r53.A00 = 1;
                i = 1;
            } else {
                r53.A00 = 0;
                i = 0;
            }
            if (Camera.getNumberOfCameras() < i + 1) {
                i = 0;
            }
            try {
                camera = Camera.open(i);
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("CAMERA EXPECTION");
                sb2.append(e);
                Log.e(sb2.toString());
                camera = null;
            }
            r53.A04 = camera;
            r53.A0B = r34.A03;
            r53.A0A = r34.A02;
            r53.A0C = r34.A06;
            r53.A0F = false;
            r53.A0D = false;
            r53.A08 = (BloksCameraOverlay) view2.findViewById(R.id.camera_overlay);
            Context context3 = ((AnonymousClass05r) r20).A00;
            Camera camera2 = r53.A04;
            int i4 = r53.A00;
            int i5 = r53.A03;
            int i6 = r53.A02;
            AnonymousClass27q r06 = new AnonymousClass27q(context3);
            r06.A02 = camera2;
            r06.A01 = i5;
            r06.A00 = i6;
            ((SurfaceHolder$CallbackC50852Wi) r06).A00 = i4;
            r53.A09 = r06;
            BloksCameraOverlay bloksCameraOverlay = r53.A08;
            String str8 = r34.A04;
            if (str8 == null) {
                str8 = "original";
            }
            bloksCameraOverlay.A00(str8);
            viewGroup.removeAllViews();
            viewGroup.addView(r53.A09);
            r53.A01 = r53.A09.getDisplayOrientation();
            View findViewById = view2.findViewById(R.id.shutter);
            r53.A06 = r20;
            r53.A07 = r34.A00;
            findViewById.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(r53, r34, new AnonymousClass1TF(r53, r20, r34), 4));
        } else if (this instanceof C43071xk) {
            ((C43071xk) this).A02((TextEmojiLabel) obj, r20, (AnonymousClass2B0) r21, obj2);
        } else if (this instanceof C43061xj) {
            View view3 = (View) obj;
            C46532Ax r35 = (C46532Ax) r21;
            if (r35.A00 != null) {
                view3.post(new RunnableEBaseShape7S0200000_I1_2(r35, r20, 1));
            }
        } else if (this instanceof C43051xi) {
            C43051xi.A00((TextEmojiLabel) obj, r20, (C46552Az) r21, obj2);
        } else if (this instanceof C43041xh) {
            ((C43041xh) this).A01((View) obj, r20, (AnonymousClass2Aw) r21);
        } else if (this instanceof C43031xg) {
            ((C43031xg) this).A01((View) obj, r20, (C46522Au) r21);
        } else if (this instanceof C43021xf) {
            View view4 = (View) obj;
            C46512At r36 = (C46512At) r21;
            TextInputEditText textInputEditText = (TextInputEditText) view4.findViewById(R.id.hintOrDate);
            TextInputLayout textInputLayout = (TextInputLayout) view4.findViewById(R.id.inputView);
            String str9 = r36.A04;
            if (str9 != null) {
                textInputLayout.setHint(str9);
            }
            Calendar instance = Calendar.getInstance();
            if (!TextUtils.isEmpty(r36.A03)) {
                Date A1B = C28051Sr.A1B(r36.A03);
                if (A1B != null) {
                    textInputEditText.setText(DateFormat.getDateInstance(1).format(A1B));
                    instance.setTime(A1B);
                }
            } else if (r36.A00 != 0) {
                instance.set(1, instance.get(1) + r36.A00);
            }
            AnonymousClass1TB r8 = new AnonymousClass1TB(r36, textInputEditText, r20);
            boolean z2 = !Boolean.FALSE.equals(r36.A02);
            textInputEditText.setEnabled(z2);
            textInputEditText.setClickable(z2);
            try {
                l = Long.valueOf(Long.parseLong(r36.A05));
            } catch (NumberFormatException unused) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("WaDatePicker/bind Max date is not a valid date format"), r36.A05);
                l = null;
            }
            if (z2) {
                DialogInterface$OnClickListenerC464029y r6 = new DialogInterface$OnClickListenerC464029y(((AnonymousClass05r) r20).A00, r8, instance.get(1), instance.get(2), instance.get(5));
                if (l != null) {
                    r6.A01.setMaxDate(l.longValue());
                }
                textInputEditText.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(r6, 27));
                return;
            }
            textInputEditText.setOnClickListener(null);
        } else if (this instanceof C43011xe) {
            ((C43011xe) this).A01((View) obj, r20, (C46502As) r21, obj2);
        } else if (this instanceof C37851ot) {
            AnonymousClass1GT r9 = (AnonymousClass1GT) obj;
            C46422Aa r37 = (C46422Aa) r21;
            Parcelable parcelable = r37.A00.A08;
            if (parcelable != null) {
                r9.onRestoreInstanceState(parcelable);
            }
            ArrayList arrayList = new ArrayList();
            C37851ot.A00(r9, r37, r37.A00.A0C);
            r37.A00.A07.set(r9.getPaddingLeft(), r9.getPaddingTop(), r9.getPaddingRight(), r9.getPaddingBottom());
            r37.A00.A01 = r9.getInputType();
            C25301Gh r4 = r37.A00;
            int i7 = r4.A04;
            if (i7 != -1) {
                r9.setSelection(i7, r4.A03);
            } else if (r9.getText() != null) {
                r9.setSelection(r9.getText().length());
            }
            C25301Gh r42 = r37.A00;
            TextWatcher textWatcher = r42.A0A;
            if (textWatcher == null) {
                textWatcher = new C25291Gg(r37, r20);
                r42.A0A = textWatcher;
            }
            AnonymousClass1GS r07 = r42.A0B;
            if (r07 == null) {
                r07 = new C37831or(r37);
                r42.A0B = r07;
            }
            r9.A00 = r07;
            r9.removeTextChangedListener(textWatcher);
            r9.addTextChangedListener(r37.A00.A0A);
            String str10 = r37.A0G;
            if (str10 != null) {
                C25301Gh r14 = r37.A00;
                if (r14.A09 == null) {
                    r14.A09 = new AnonymousClass1GY(str10, r9);
                }
                r9.removeTextChangedListener(r37.A00.A09);
                r9.addTextChangedListener(r37.A00.A09);
            }
            if (!(r37.A04 == null && r37.A05 == null)) {
                r9.setOnFocusChangeListener(new View$OnFocusChangeListenerC25281Gf(r37, r20));
            }
            r37.A00.A06 = r9.getTextColors();
            C009405x r08 = r37.A02;
            if (r08 != null) {
                r9.setTextColor(r08.A00(r20).intValue());
            } else {
                Integer num3 = r37.A0B;
                if (num3 != null) {
                    r9.setTextColor(num3.intValue());
                }
            }
            r37.A00.A05 = r9.getHintTextColors();
            C009405x r09 = r37.A01;
            if (r09 != null) {
                r9.setHintTextColor(r09.A00(r20).intValue());
            }
            Integer num4 = r37.A09;
            if (num4 != null) {
                arrayList.add(new InputFilter.LengthFilter(num4.intValue()));
            }
            if (r37.A03 != null) {
                arrayList.add(new C25261Gd(r37, r20));
            }
            r9.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
            r37.A00.A00 = r9.getImeOptions();
            String str11 = r37.A0H;
            if (str11 != null) {
                int hashCode = str11.hashCode();
                if (hashCode != 3089282) {
                    if (hashCode == 3377907 && str11.equals("next")) {
                        r9.setImeOptions(5);
                    }
                } else if (str11.equals("done")) {
                    r9.setImeOptions(6);
                }
            }
            if (r37.A06 != null) {
                r9.setOnEditorActionListener(new C25271Ge(r37, r20));
            }
        } else if (this instanceof C37791on) {
        }
    }
}
