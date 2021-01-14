package org.npci.commonlibrary;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass3BN;
import X.AnonymousClass3BX;
import X.C004302a;
import X.C73263Wc;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class NPCIFragment extends AnonymousClass037 implements AnonymousClass3BX {
    public int A00 = -1;
    public Context A01;
    public Handler A02;
    public PopupWindow A03;
    public Runnable A04;
    public Timer A05;
    public Timer A06 = null;
    public JSONArray A07 = null;
    public JSONObject A08 = null;
    public JSONObject A09 = null;
    public boolean A0A = false;
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final ArrayList A0C = new ArrayList();

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        this.A01 = context;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        Runnable runnable;
        this.A0U = true;
        Timer timer = this.A06;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.A05;
        if (timer2 != null) {
            timer2.cancel();
        }
        Handler handler = this.A02;
        if (!(handler == null || (runnable = this.A04) == null)) {
            handler.removeCallbacks(runnable);
        }
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        ActivityC004902h A0A2 = A0A();
        if (A0A2 instanceof GetCredential) {
            ((GetCredential) A0A2).A0B = this;
        }
    }

    public final int A0n(float f) {
        return (int) (f * ((float) (A02().getDisplayMetrics().densityDpi / 160)));
    }

    public C73263Wc A0o(String str, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C73263Wc r3 = new C73263Wc(A0A());
        if (this.A07.length() == 1) {
            r3.setActionBarPositionTop(true);
            layoutParams.width = A0n(300.0f);
            layoutParams.topMargin = A0n(40.0f);
            r3.A0A.setCharSize(0.0f);
            r3.A0A.setSpace((float) A0n(15.0f));
            r3.A0A.setFontSize((float) A0n(22.0f));
            r3.A0A.setPadding(0, A0n(32.0f), 0, 0);
            r3.A0A.setMargin(new int[]{0, A0n(32.0f), 0, 0});
            r3.A0A.setLineStrokeCentered(true);
            r3.A0A.setLineStrokeSelected((float) A0n(2.0f));
            r3.A0A.setColorStates(C004302a.A02(A0A(), R.color.form_item_input_colors_transparent));
        }
        r3.setLayoutParams(layoutParams);
        r3.setInputLength(i2);
        r3.A0B = this;
        r3.setTitle(str);
        r3.A01 = i;
        return r3;
    }

    public void A0p() {
        String string;
        Bundle bundle = super.A06;
        if (bundle != null) {
            try {
                String string2 = bundle.getString("configuration");
                if (string2 != null) {
                    this.A08 = new JSONObject(string2);
                }
                String string3 = bundle.getString("controls");
                if (!(string3 == null || (string = new JSONObject(string3).getString("CredAllowed")) == null)) {
                    this.A07 = new JSONArray(string);
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject = null;
                    JSONObject jSONObject2 = null;
                    JSONObject jSONObject3 = null;
                    JSONObject jSONObject4 = null;
                    for (int i = 0; i < this.A07.length(); i++) {
                        try {
                            String optString = ((JSONObject) this.A07.get(i)).optString("subtype", "");
                            if (optString.equals("ATMPIN")) {
                                jSONObject = this.A07.getJSONObject(i);
                            }
                            if (optString.matches("OTP|SMS|HOTP|TOTP")) {
                                jSONObject2 = this.A07.getJSONObject(i);
                            }
                            if (optString.equals("MPIN")) {
                                jSONObject3 = this.A07.getJSONObject(i);
                            }
                            if (optString.equals("NMPIN")) {
                                jSONObject4 = this.A07.getJSONObject(i);
                            }
                        } catch (JSONException unused) {
                            Log.e("PAY: sortCredAllowedString failed");
                        }
                    }
                    if (!(this.A07.length() != 3 || jSONObject == null || jSONObject2 == null || jSONObject3 == null)) {
                        arrayList.add(jSONObject2);
                        arrayList.add(jSONObject);
                        arrayList.add(jSONObject3);
                    }
                    if (!(this.A07.length() != 2 || jSONObject2 == null || jSONObject3 == null)) {
                        arrayList.add(jSONObject2);
                        arrayList.add(jSONObject3);
                    }
                    if (!(this.A07.length() != 2 || jSONObject3 == null || jSONObject4 == null)) {
                        arrayList.add(jSONObject3);
                        arrayList.add(jSONObject4);
                    }
                    if (arrayList.size() > 0) {
                        this.A07 = new JSONArray((Collection) arrayList);
                    }
                }
                String string4 = bundle.getString("salt");
                if (string4 != null) {
                    this.A09 = new JSONObject(string4);
                }
                String string5 = bundle.getString("payInfo");
                if (string5 != null) {
                    new JSONArray(string5);
                }
            } catch (JSONException e) {
                Log.e("PAY: Error while reading Arguments", e);
            }
        }
    }

    public void A0q(View view, String str) {
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View inflate = A0A().getLayoutInflater().inflate(R.layout.npci_layout_popup_view, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.popup_text)).setText(str);
        PopupWindow popupWindow2 = new PopupWindow(inflate, -2, A0n(60.0f));
        this.A03 = popupWindow2;
        popupWindow2.setAnimationStyle(R.style.PopupAnimation);
        this.A03.showAtLocation(view, 17, 0, 0);
        inflate.findViewById(R.id.popup_button).setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 37));
        this.A05 = new Timer();
        Handler handler = new Handler(Looper.getMainLooper());
        this.A02 = handler;
        RunnableEBaseShape13S0100000_I1_8 runnableEBaseShape13S0100000_I1_8 = new RunnableEBaseShape13S0100000_I1_8(this, 46);
        this.A04 = runnableEBaseShape13S0100000_I1_8;
        handler.postDelayed(runnableEBaseShape13S0100000_I1_8, 3000);
    }

    public void A0r(C73263Wc r10) {
        Timer timer = new Timer();
        this.A06 = timer;
        timer.schedule(new AnonymousClass3BN(this), 45000);
        r10.AQf("", null, null, 0, false, false);
        r10.A00(r10.A03, false);
        r10.A01(this.A0B.A06(R.string.npci_detecting_otp), true);
        r10.A02(true);
    }
}
