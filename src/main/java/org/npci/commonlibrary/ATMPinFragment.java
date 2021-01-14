package org.npci.commonlibrary;

import X.AnonymousClass01X;
import X.AnonymousClass1YV;
import X.AnonymousClass3B7;
import X.AnonymousClass3BE;
import X.AnonymousClass3BI;
import X.AnonymousClass3BL;
import X.AnonymousClass3BM;
import X.AnonymousClass3BR;
import X.AnonymousClass3BX;
import X.C004302a;
import X.C73243Wa;
import X.C73263Wc;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.facebook.redex.ViewOnClickEBaseShape0S2300000_I1;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

public class ATMPinFragment extends NPCIFragment implements AnonymousClass3BX {
    public int A00 = 0;
    public ViewSwitcher A01 = null;
    public boolean A02 = false;
    public final HashMap A03 = new HashMap();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.npci_fragment_atmpin, viewGroup, false);
    }

    @Override // X.AnonymousClass037, org.npci.commonlibrary.NPCIFragment
    public void A0l(View view, Bundle bundle) {
        int i;
        String A06;
        super.A0l(view, bundle);
        A0p();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.switcherLayout1);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.switcherLayout2);
        this.A01 = (ViewSwitcher) view.findViewById(R.id.view_switcher);
        if (((NPCIFragment) this).A07 != null) {
            boolean z = false;
            for (int i2 = 0; i2 < ((NPCIFragment) this).A07.length(); i2++) {
                try {
                    JSONObject jSONObject = ((NPCIFragment) this).A07.getJSONObject(i2);
                    String string = jSONObject.getString("subtype");
                    if (jSONObject.optInt("dLength") == 0) {
                        i = 6;
                    } else {
                        i = jSONObject.optInt("dLength");
                    }
                    if (string.equals("MPIN")) {
                        AnonymousClass01X r9 = ((NPCIFragment) this).A0B;
                        C73263Wc A0o = A0o(r9.A06(R.string.npci_set_mpin_title), i2, i);
                        C73263Wc A0o2 = A0o(r9.A06(R.string.npci_confirm_mpin_title), i2, i);
                        if (!z) {
                            A0o.A4L();
                            z = true;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(A0o);
                        arrayList.add(A0o2);
                        C73243Wa r1 = new C73243Wa(A0A());
                        r1.A00(arrayList, this);
                        r1.A02 = jSONObject;
                        ((NPCIFragment) this).A0C.add(r1);
                        viewGroup2.addView(r1);
                    } else {
                        if (string.equals("ATMPIN")) {
                            A06 = ((NPCIFragment) this).A0B.A06(R.string.npci_atm_title);
                        } else if ("OTP".equals(string) || "SMS".equals(string) || "EMAIL".equals(string) || "HOTP".equals(string) || "TOTP".equals(string)) {
                            A06 = ((NPCIFragment) this).A0B.A06(R.string.npci_otp_title);
                            ((NPCIFragment) this).A00 = i2;
                        } else {
                            A06 = "";
                        }
                        C73263Wc A0o3 = A0o(A06, i2, i);
                        if (!z) {
                            A0o3.A4L();
                            z = true;
                        }
                        A0o3.A07 = jSONObject;
                        ((NPCIFragment) this).A0C.add(A0o3);
                        viewGroup.addView(A0o3);
                    }
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        int i3 = ((NPCIFragment) this).A00;
        if (i3 != -1) {
            ArrayList arrayList2 = ((NPCIFragment) this).A0C;
            if (arrayList2.get(i3) instanceof C73263Wc) {
                C73263Wc r0 = (C73263Wc) arrayList2.get(i3);
                A0r(r0);
                r0.A0C = true;
            }
        }
        ArrayList arrayList3 = ((NPCIFragment) this).A0C;
        int size = arrayList3.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 != ((NPCIFragment) this).A00) {
                AnonymousClass3BR r5 = (AnonymousClass3BR) arrayList3.get(i4);
                Drawable A032 = C004302a.A03(A0A(), R.drawable.ic_visibility_on);
                Drawable A033 = C004302a.A03(A0A(), R.drawable.ic_visibility_off);
                AnonymousClass01X r12 = ((NPCIFragment) this).A0B;
                String A062 = r12.A06(R.string.npci_action_hide);
                String A063 = r12.A06(R.string.npci_action_show);
                r5.AQf(A063, A032, new ViewOnClickEBaseShape0S2300000_I1(r5, A062, A063, A033, A032), 0, true, true);
            }
        }
    }

    public final void A0s() {
        AnonymousClass3BL r0;
        C73263Wc r2;
        String inputValue;
        int i = ((NPCIFragment) this).A00;
        if (i != -1) {
            ArrayList arrayList = ((NPCIFragment) this).A0C;
            if ((arrayList.get(i) instanceof C73263Wc) && ((inputValue = (r2 = (C73263Wc) arrayList.get(i)).getInputValue()) == null || inputValue.length() != r2.A00)) {
                A0q(r2, ((NPCIFragment) this).A0B.A06(R.string.npci_invalid_otp));
                return;
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = ((NPCIFragment) this).A0C;
            if (i2 < arrayList2.size()) {
                if (arrayList2.get(i2) instanceof C73263Wc) {
                    C73263Wc r22 = (C73263Wc) arrayList2.get(i2);
                    if (r22.getInputValue().length() != r22.A00) {
                        A0q(r22, ((NPCIFragment) this).A0B.A06(R.string.npci_component_message));
                        return;
                    }
                }
                i2++;
            } else if (!this.A02) {
                this.A02 = true;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    JSONObject jSONObject = (JSONObject) ((AnonymousClass3BR) arrayList2.get(i3)).getFormDataTag();
                    try {
                        String string = jSONObject.getString("type");
                        String string2 = jSONObject.getString("subtype");
                        ((NPCIFragment) this).A09.put("credential", ((AnonymousClass3BR) arrayList2.get(i3)).getInputValue());
                        String A002 = ((GetCredential) ((NPCIFragment) this).A01).A09.A04.A00(((NPCIFragment) this).A09);
                        AnonymousClass3B7 r23 = ((GetCredential) ((NPCIFragment) this).A01).A09;
                        AnonymousClass3BI r5 = r23.A01;
                        if (r5 == null && (r0 = r23.A05) != null) {
                            AnonymousClass3BE r1 = r0.A03;
                            r23.A00 = r1;
                            r5 = new AnonymousClass3BI(r1, r0.A00);
                            r23.A01 = r5;
                        }
                        AnonymousClass3BM A003 = r5.A00(A00(), A002, string, string2, ((NPCIFragment) this).A09);
                        if (A003 != null) {
                            HashMap hashMap = this.A03;
                            StringBuilder sb = new StringBuilder();
                            AnonymousClass1YV.A0F(A003, sb);
                            hashMap.put(string2, sb.toString());
                        }
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
                Intent intent = new Intent();
                intent.putExtra("credBlocks", this.A03);
                ((Activity) ((NPCIFragment) this).A01).setResult(250, intent);
                ((Activity) ((NPCIFragment) this).A01).finish();
                return;
            } else {
                return;
            }
        }
    }

    @Override // X.AnonymousClass3BX
    public void AGK(int i) {
        if (!(((NPCIFragment) this).A0C.get(i) instanceof C73243Wa)) {
            this.A00 = i;
        }
    }

    @Override // X.AnonymousClass3BX
    public void AGL(int i, String str) {
        int i2 = ((NPCIFragment) this).A00;
        if (i2 != -1 && i2 == i) {
            ArrayList arrayList = ((NPCIFragment) this).A0C;
            if (arrayList.get(i2) instanceof C73263Wc) {
                Timer timer = ((NPCIFragment) this).A06;
                if (timer != null) {
                    timer.cancel();
                }
                ((C73263Wc) arrayList.get(((NPCIFragment) this).A00)).A02(false);
                ((C73263Wc) arrayList.get(((NPCIFragment) this).A00)).A01("", false);
                C73263Wc r3 = (C73263Wc) arrayList.get(((NPCIFragment) this).A00);
                Drawable A032 = C004302a.A03(A0A(), R.drawable.ic_tick_ok);
                if (A032 != null) {
                    r3.A03.setImageDrawable(A032);
                }
                r3.A00(r3.A03, true);
            }
        }
    }

    @Override // X.AnonymousClass3BX
    public void AGM(View view, String str) {
        A0q(view, str);
    }
}
