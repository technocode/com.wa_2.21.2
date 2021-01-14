package org.npci.commonlibrary;

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
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class PinFragment extends NPCIFragment implements AnonymousClass3BX {
    public int A00 = 0;
    public Boolean A01 = null;
    public boolean A02 = false;
    public final HashMap A03 = new HashMap();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.npci_fragment_pin, viewGroup, false);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.booleanValue() != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0150, code lost:
        if (r12.equals("OTP") != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0157, code lost:
        if (r12.equals("SMS") != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015e, code lost:
        if (r12.equals("HOTP") != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0171, code lost:
        if (r12.equals("TOTP") != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0178, code lost:
        if (r12.equals("EMAIL") != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017a, code lost:
        r0 = ((org.npci.commonlibrary.NPCIFragment) r21).A0B.A06(com.google.android.search.verification.client.R.string.npci_otp_title);
        ((org.npci.commonlibrary.NPCIFragment) r21).A00 = r3;
     */
    @Override // X.AnonymousClass037, org.npci.commonlibrary.NPCIFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0l(android.view.View r22, android.os.Bundle r23) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.PinFragment.A0l(android.view.View, android.os.Bundle):void");
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
                    try {
                        JSONObject jSONObject = (JSONObject) ((AnonymousClass3BR) arrayList2.get(i3)).getFormDataTag();
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
