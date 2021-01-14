package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape0S0201000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.InvalidParameterException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1xt  reason: invalid class name and case insensitive filesystem */
public class C43161xt extends AbstractC16300pa {
    public int A00 = -1;
    public final LayoutInflater A01;
    public final AbstractC009505y A02;
    public final C42981xb A03;
    public final C664334g A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final JSONArray A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C43161xt(C42981xb r2, LayoutInflater layoutInflater, C664334g r4, JSONArray jSONArray, AbstractC009505y r6, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.A0C = jSONArray;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A0B = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A0E = z;
        this.A0D = z2;
        this.A04 = r4;
        this.A01 = layoutInflater;
        this.A02 = r6;
        this.A03 = r2;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A0C.length();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        View inflate = this.A01.inflate(R.layout.wa_list_view_row, viewGroup, false);
        if (this.A0E) {
            TypedValue typedValue = new TypedValue();
            viewGroup.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            inflate.setBackgroundResource(typedValue.resourceId);
        }
        return new C43151xs(this, inflate);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r11, int i) {
        C43151xs r112 = (C43151xs) r11;
        if (r112 != null) {
            try {
                C43161xt r8 = r112.A06;
                JSONObject jSONObject = r8.A0C.getJSONObject(r112.A00());
                r112.A02.setText(jSONObject.getString(r8.A0B));
                boolean optBoolean = jSONObject.optBoolean(r8.A06, false);
                View view = r112.A0H;
                float f = 1.0f;
                if (optBoolean) {
                    f = 0.38f;
                }
                view.setAlpha(f);
                boolean z = false;
                if (!optBoolean) {
                    z = true;
                }
                view.setFocusable(z);
                boolean z2 = false;
                if (!optBoolean) {
                    z2 = true;
                }
                view.setClickable(z2);
                String str = r8.A09;
                int i2 = 8;
                if (str == null) {
                    r112.A05.setVisibility(8);
                    r112.A03.setVisibility(8);
                } else if (str.equals("radio")) {
                    r112.A0C(true);
                } else {
                    if (str.equals("image")) {
                        String str2 = r8.A07;
                        if (!TextUtils.isEmpty(str2)) {
                            r112.A03.setVisibility(8);
                            String str3 = r8.A08;
                            if (TextUtils.isEmpty(str3) || (str3 != null && str3.equals("url"))) {
                                r112.A05.setVisibility(0);
                                r8.A04.A00(jSONObject.getString(str2), r112.A05);
                            } else if (!TextUtils.isEmpty(str3) && str3 != null && str3.equals("file_path")) {
                                String string = jSONObject.getString(str2);
                                if (new File(string).exists()) {
                                    r112.A05.setVisibility(0);
                                    r112.A05.setImageURI(Uri.parse(string));
                                } else {
                                    r112.A05.setVisibility(8);
                                }
                            }
                        }
                    }
                    r112.A05.setVisibility(8);
                    r112.A03.setVisibility(8);
                }
                String str4 = r8.A05;
                if (str4 == null || TextUtils.isEmpty(jSONObject.optString(str4))) {
                    r112.A01.setVisibility(8);
                } else {
                    r112.A01.setText(jSONObject.optString(str4));
                    r112.A01.setVisibility(0);
                }
                String str5 = r8.A0A;
                if (str5 == null || !str5.equals("radio")) {
                    r112.A04.setVisibility(8);
                } else {
                    r112.A0C(false);
                }
                view.setOnClickListener(new ViewOnClickEBaseShape0S0201000_I1(this, r112, i, 1));
                boolean z3 = this.A0D;
                if (z3 || i == A05() - 1) {
                    View view2 = r112.A00;
                    if (!z3) {
                        i2 = 4;
                    }
                    view2.setVisibility(i2);
                    return;
                }
                r112.A00.setVisibility(0);
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder("WaListViewBinder/ListViewHolder/decorate: property not found at position ");
                sb.append(r112.A00());
                sb.append(":");
                sb.append(r112.A06.A0C.toString());
                Log.e(sb.toString());
                throw new InvalidParameterException(sb.toString());
            }
        } else {
            throw null;
        }
    }
}
